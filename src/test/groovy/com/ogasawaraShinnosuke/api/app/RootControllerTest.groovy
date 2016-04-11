package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.conf.ApplicationConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.setup.MockMvcBuilders

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.http.MediaType
import org.springframework.mock.web.MockServletContext
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = MockServletContext)
@WebAppConfiguration
class RootControllerTest {

    MockMvc mvc

    @Before
    def void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new RootController()).build()
    }

    @Test
    def void getIndex() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string("ok"))
    }

    @Test
    def void getLive() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/live").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().json("[{\"id\":1,\"name\":\"test\"},{\"id\":2,\"name\":\"ken\"}]"))
    }
}
