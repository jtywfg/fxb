package com.fxb.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fxb.model.BackUser;
import com.fxb.model.User;


/**  
 * @Description: 
 * @author wufugui 
 * @date 2016年6月3日
 */
public interface SaleUserService {

	public User getUserById(int userId);
	public List<User> findAllUser();
}
