package com.example.sweater;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

//@SpringBootTest
//@AutoConfigureMockMvc
//@TestPropertySource("/application-test.properties")

public class LoginTest {
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private MainController controller;
//
//    @Test
//    public void contextLoads() throws Exception {
//        this.mockMvc.perform(get("/"))   // sehfenin mapi
//                .andDo(print())                     // problemleri cap edir
//                .andExpect(status().isOk())         // bizim gozlediyimiz kod ile cavabi muqayise edir yeni 200 code gozleyir problem olduqda ecseption atir
//                .andExpect(content().string(containsString("Hello, guest")))
//                .andExpect(content().string(containsString("Please, login")));
//    }
//
//    @Test
//    public void accesDeniedTest() throws Exception {
//        this.mockMvc.perform(get("/main"))                           // sehfenin mapi
//                .andDo(print())                                                 // problemleri cap edir
//                .andExpect(status().is3xxRedirection())                         // xeta bash verdiyi halda bizi login sehifesine yoneldir
//                .andExpect(redirectedUrl("http://localhost/login")); // burada biz sehifeni deqiq teyyin edirik
//    }

//    @Test
//    @Sql(value = {"/create-user-before.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//
//    public void correctLoginTest() throws Exception {
//        this.mockMvc.perform(formLogin().user("dru").password("123"))                // loginin duzgunluyunu yoxlayir
//                .andDo(print())
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/"));                      // problem olarsa bu sehifeye redirect edir
//    }


//    @Test
//    public void badCredentials() throws Exception {
//        this.mockMvc.perform(post("/login").param("username", "jonh")) // post metodu logine param metodu ile yalnsih melumat gonderirik
//                .andDo(print())
//                .andExpect(status().isForbidden());                                             // ve bu zaman 403 qadaga olacaq
//    }
}
