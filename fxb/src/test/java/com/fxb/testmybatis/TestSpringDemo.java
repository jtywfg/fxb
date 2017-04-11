package com.fxb.testmybatis;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fxb.model.User;
import com.fxb.service.SaleUserService;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml"})
public class TestSpringDemo {
	/**  
	* @Title: TestSpringDemo.java
	* @Package com.fxb
	* @Description: 
	* @author wufugui 
	* @date 2017年4月7日
	* @version V1.0  
	*/
private static Logger logger = Logger.getLogger(TestSpringDemo.class);
    
    @Resource
    private SaleUserService saleUserService = null;
    
    @Test
    public void test2() {
    	User user = saleUserService.getUserById(2);
        logger.info("userName" + user.getUserName());
    }
}
