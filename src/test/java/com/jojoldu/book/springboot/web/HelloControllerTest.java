package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// ** @RunWith(SpringRunner.class)
// 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킵니다.
// 여기서는  SpringRunner라는 스프링 실행자를 사용합니다
// 즉, 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 합니다.
// ** @WebMvcTest
//여러 스프링 테스트 어노테이션 중, Web에 집중할 수 있는 어노테이션입니다.
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired   // 프링이 관리하는 빈을 주입시킨다.
    private MockMvc mvc;  // 웹 API를 테스트 할 때 사용합니다.
                          // 스프링 테스트의 시작점입니다.
                          // 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있습니다.
    @Test
    public void hello() throws Exception {
        String hello = "hello";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

}
