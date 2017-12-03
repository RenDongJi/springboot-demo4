package com.ren.controller;

import com.ren.SpringbootDemo4Application;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * @project: springboot-demo4
 * @description:
 * @author: DongJi_Ren
 * @date: 2017/12/3 22:18.
 * @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootDemo4Application.class)//确定启动类
@WebAppConfiguration//junit模拟web
public class BaseTest {

    @Resource
    protected WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    @Before
    public void init() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
