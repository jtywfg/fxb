package com.fxb.testmybatis;


import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fxb.model.BackUser;
import com.fxb.model.User;
import com.fxb.service.SaleUserService;
public class TestMybatis {
	/**  
	* @Title: TestMybatis.java
	* @Package com.fxb
	* @Description: 
	* @author wufugui 
	* @date 2017年4月7日
	* @version V1.0  
	*/
	private static Logger logger = Logger.getLogger(TestMybatis.class);
    
    private ApplicationContext ac = null;
    
    @Resource
    private SaleUserService saleUserService = null;
    
    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
        saleUserService = (SaleUserService) ac.getBean("saleUserService");
    }
 
    @Test
    public void test1() {
        User user = saleUserService.getUserById(1);
    	logger.info("userName" + user.getUserName());
    	List<User> list=saleUserService.findAllUser();
    	System.out.println(list.size());
    }
}
