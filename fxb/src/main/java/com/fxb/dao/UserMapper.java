package com.fxb.dao;

import java.util.List;

import com.fxb.model.BackUser;
import com.fxb.model.User;

/**  
 * @Description: 
 * @author wufugui 
 * @date 2017年4月7日
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<User> getAllUser();
}
