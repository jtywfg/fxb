package com.fxb.model;

public class User {
	/**  
	* @Title: User.java
	* @Package com.fxb.model
	* @Description: 
	* @author wufugui 
	* @date 2017年4月7日
	* @version V1.0  
	*/
	private Integer id;
    private String userName;
    private String password;
    private Integer age;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
