package org.wecancodeit.com.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private WaterBodyRepo waterBodyRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void bodyOfWatersShouldBeOkAndReturnBodyOfWatersTemplateWithBodyOfWatersAttributes() throws Exception {
        mockMvc.perform(get("/waterBodies"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("allWaterBodiesTemplate"))
                .andExpect(model().attributeExists("waterBodies"));
    }

    @Test
    public void shouldBeOkForASingleBodyOfWaterEndpointWithBodyOfWaterTemplateAndBodyOfWaterModelAttribute() throws Exception {
        WaterBodyModel testBodyOfWater = new WaterBodyModel("Caribbean");
        when(waterBodyRepo.findBodyOfWaterByLocation("Caribbean")).thenReturn(testBodyOfWater);
        mockMvc.perform(get("/waterBodies/Caribbean"))
                .andExpect(status().isOk())
                .andExpect(view().name("waterBodyTemplate"))
                .andExpect(model().attributeExists("waterBody"));
    }
}
