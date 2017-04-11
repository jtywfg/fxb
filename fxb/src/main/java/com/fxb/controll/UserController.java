package com.fxb.controll;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fxb.model.User;
import com.fxb.service.SaleUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	/**  
	* @Title: UserController.java
	* @Package com.fxb.controll
	* @Description: 
	* @author wufugui 
	* @date 2017年4月7日
	* @version V1.0  
	*/
	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private SaleUserService userService;
	/**
	* @Title: toIndex
	* @Description: 用于测试velocity的集成，指向/WEB-INF/views/目录下的vm文件
	* @author wufugui
	* @date 2017年4月11日
	* @return String
	 */
	@RequestMapping("/showUser") 
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        logger.info("username==============" + user.getUserName());
        model.addAttribute("user", user);
        return "showUser";
	}
	/**
	* @Title: toIndex
	* @Description: 用于测试velocity的集成，指向/WEB-INF/views/目录下的vm文件
	* @author wufugui
	* @date 2017年4月11日
	* @return String
	 */
	@RequestMapping("/showAllUser")
	public String showAllUser(HttpServletRequest request,Model model){
		List<User> userList = userService.findAllUser();
		logger.info("userList's size==============" + userList.size());
		model.addAttribute("userList",userList);
		return "showAllUser";
	}
	/**
	* @Title: showAllUserFlt
	* @Description: 用于测试freemarker的集成，指向/WEB-INF/views-flt/目录下的ftl文件
	* @author wufugui
	* @date 2017年4月11日
	* @return String
	 */
	@RequestMapping("/showAllUserFtl") 
	public String showAllUserFtl(HttpServletRequest request,Model model){
		List<User> userList = userService.findAllUser();
		logger.info("userList's size==============" + userList.size());
		model.addAttribute("userList",userList);
		return "/user_list";
	}

}