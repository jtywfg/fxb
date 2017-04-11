package com.fxb.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.fxb.dao.UserMapper;
import com.fxb.model.BackUser;
import com.fxb.model.User;
import com.fxb.service.SaleUserService;


/**  
 * @Title: SaleUserServiceImpl.java
 * @Package com.wyywp.sales.service.impl
 * @Description: 
 * @author wufugui 
 * @date 2016年6月3日
 * @version V1.0  
 */
@Service("saleUserService")
public class SaleUserServiceImpl  implements SaleUserService {
	@Resource
	private UserMapper userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}
	
	
}
