package com.example.template;

import contracttest.OrderApplication;
import contracttest.infra.OrderController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.filter.CharacterEncodingFilter;

@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.MOCK,
    classes = OrderApplication.class
)
@AutoConfigureMockMvc
@Import(TestDataConfig.class)
public class RestBase {

    @Autowired
    private OrderController orderController;

    @Before
    public void setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders
            .standaloneSetup(orderController)
            .addFilters(new CharacterEncodingFilter("UTF-8", true));

        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
        RestAssuredMockMvc
            .given()
            .contentType("application/json;charset=UTF-8");
    }
}
