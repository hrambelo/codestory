package com.hrambelo.codestory.web.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Matchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 15:59
 * Package: com.hrambelo.codestory.web.controller
 * Codestory
 */
public class EmailControllerTest {

    private EmailController emailController;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        EmailController emailController = new EmailController();
        mockMvc = standaloneSetup(emailController)
                .build();
    }

    @After
    public void tearDown() throws Exception {
        emailController = null;
    }

    @Test
    public void testShowEmailFail() throws Exception {
        mockMvc.perform(get("/").param("q", "toto"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("wrong question, ask my email instead"));
    }

    @Test
    public void testShowEmail() throws Exception {
        mockMvc.perform(get("/").param("q", "email"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("bensmania@gmail.com"));
    }

    @Test
    public void shouldNotPost() throws Exception {
        mockMvc
                .perform(post("/").param("q", anyString()))
                .andExpect(status().isMethodNotAllowed())
                .andExpect(header()
                        .string("Allow", is("GET")));
    }

    @Test
    public void printInfo() throws Exception {
        mockMvc
                .perform(get("/?q=email"))
                .andDo(print());

    }
}
