package com.hrambelo.codestory.web.controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 30/01/13 - Time: 15:59
 * Package: com.hrambelo.codestory.web.controller
 * Codestory
 */
public class CodestoryControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        CodestoryController codestoryController = new CodestoryController();
        mockMvc = standaloneSetup(codestoryController)
                .build();
    }

    @Test
    public void testShowEmail() throws Exception {
        mockMvc.perform(get("/").param("q", "email"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("bensmania@gmail.com"));
    }

    @Test
    public void testHappy() throws Exception {
        mockMvc.perform(get("/").param("q", "heureux"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("OUI"));
    }

    @Test
    public void testMailing() throws Exception {
        mockMvc.perform(get("/").param("q", "Es+tu+abonne+a+la+mailing+list(OUI/NON)"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("OUI"));
    }

    @Test
    public void testMarkDown() throws Exception {
        mockMvc.perform(get("/").param("q", "Es+tu+pret+a+recevoir+une+enonce+au+format+markdown+par+http+post"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("OUI"));
    }

    @Test
    public void testAlwaysYes() throws Exception {
        mockMvc.perform(get("/").param("q", "Est+ce+que+tu+reponds+toujours+oui(OUI/NON)"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("NON"));
    }

    @Test
    public void testPostEnonce() throws Exception {
        mockMvc.perform(post("/enonce/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void testReceive() throws Exception {
        mockMvc.perform(get("/").param("q", "As+tu+bien+recu+le+premier+enonce(OUI/NON)"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("OUI"));
    }

    @Test
    public void shouldNotPost() throws Exception {
        mockMvc
                .perform(post("/").param("q", "sample"))
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
