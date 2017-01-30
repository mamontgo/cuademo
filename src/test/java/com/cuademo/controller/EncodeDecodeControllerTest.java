package com.cuademo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cuademo.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {Application.class})
public class EncodeDecodeControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;
    
	
    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
	
    @Test
    public void testEncodeEncode() throws Exception {
        mockMvc.perform(get("/encoded").param("payload", "Encode"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("data").value("Ksgrff") );              
    }

    @Test
    public void testEncodeFuzzy() throws Exception {
        mockMvc.perform(get("/encoded").param("payload", "Fuzzy"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("data").value("Kycbz") );              
    }
    
    @Test
    public void testDecodeKsgrff() throws Exception {
        mockMvc.perform(get("/decoded").param("payload", "Ksgrff"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("data").value("Encode") );              
    }

    @Test
    public void testDecodeKycbz() throws Exception {
        mockMvc.perform(get("/decoded").param("payload", "Kycbz"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("data").value("Fuzzy") );              
    }


}
