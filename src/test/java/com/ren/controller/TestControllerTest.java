package com.ren.controller;

import com.ren.SpringbootDemo4Application;
import com.ren.model.Department;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @project: springboot-demo4
 * @description:
 * @author: DongJi_Ren
 * @date: 2017/12/3 21:54.
 * @version: v1.0
 */
@Transactional//确保数据回滚
public class TestControllerTest extends BaseTest {

    @Before
    public void setUp() throws Exception {}

    @Test
    public void findDepartment() throws Exception {

        String uri = "/test/findDepartment";
        //MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(uri).param("name","123456").accept(MediaType.APPLICATION_JSON)).andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();
        int status = response.getStatus();
        System.out.println(status);
        String contentAsString = response.getContentAsString();
        System.out.println(contentAsString);

    }

}