package com.example.sweater;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;


//@SpringBootTest
//@AutoConfigureMockMvc
//@TestPropertySource("/application-test.properties")
//@Sql(value = {"/create-user-before.sql", "/messages-list-before.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//@Sql(value = {"/messages-list-after.sql", "/create-user-after.sql"}, executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
//@WithUserDetails(value = "dru")
public class MainControllerTest {
//    @Autowired
//    private MainController controller;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void mainPageTest() throws Exception {
//        this.mockMvc.perform(get("/main"))
//                .andDo(print())
//                .andExpect(authenticated())
//                .andExpect(xpath("//*[@id='navbarSupportedContent']/div").string("dru"));
//    }
//
//    @Test
//    public void messageListTest() throws Exception {
//        this.mockMvc.perform(get("/main"))
//                .andDo(print())
//                .andExpect(authenticated())
//                .andExpect(xpath("//*[@id='message-list']/div").nodeCount(4));
//    }
//
//    @Test
//    public void filterMessageTest() throws Exception {
//        this.mockMvc.perform(get("/main").param("filter", "my-tag"))
//                .andDo(print())
//                .andExpect(authenticated())
//                .andExpect(xpath("//*[@id='message-list']/div").nodeCount(2))
//                .andExpect(xpath("//*[@id='message-list']/div[@data-id='1']").exists())
//                .andExpect(xpath("//*[@id='message-list']/div[@data-id='3']").exists());
//    }

//    @Test
//    public void addMessageToListTest() throws Exception {
//        MockHttpServletRequestBuilder multipart = multipart("/main")
//                .file("file", "123".getBytes())
//                .param("text", "third")
//                .param("tag", "fourth")
//                .with(csrf());
//
//        this.mockMvc.perform(multipart)
//                .andDo(print())
//                .andExpect(authenticated())
//                .andExpect(xpath("//*[@id='message-list']/div").nodeCount(4))
//                .andExpect(xpath("//*[@id='message-list']/div[@data-id='3']").exists())
//                .andExpect(xpath("//*[@id='message-list']/div[@data-id='1']/div/span").string("first"));
//    }
}
