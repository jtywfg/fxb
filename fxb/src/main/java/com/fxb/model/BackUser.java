package com.fxb.model;

import java.io.Serializable;
import java.util.Date;

public class BackUser implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5439460387528095976L;

	private Integer userid;

    private String useraccount;

    private String username;

    private String userpwd;

    private Integer roleid;

    private String salt;

    private Integer status;

    private Integer deptid;

    private Integer positionid;
    
    /**
     * 内容后台用户使用
     * 学段：1：初中，2：高中
     */
    private Integer schoolType;
    
    private Date createTime; //创建时间
    
    /**
     * 内容后台用户使用
     * 学科：1：语文，2：数学...
     * 存储格式：1,2
     */
    private String courseCodes;

    private Integer worknumber;

    private Long telephone;
    
    private String systenm;
    
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSystenm() {
		return systenm;
	}

	public void setSystenm(String systenm) {
		this.systenm = systenm;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(Integer worknumber) {
        this.worknumber = worknumber;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
    
	public Integer getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(Integer schoolType) {
		this.schoolType = schoolType;
	}

	public String getCourseCodes() {
		return courseCodes;
	}

	public void setCourseCodes(String courseCodes) {
		this.courseCodes = courseCodes;
	}

	@Override
	public String toString() {
		return "BackUser [userid=" + userid + ", useraccount=" + useraccount + ", username=" + username + ", userpwd="
				+ userpwd + ", roleid=" + roleid + ", salt=" + salt + ", status=" + status + ", deptid=" + deptid
				+ ", positionid=" + positionid + ", worknumber=" + worknumber + ", telephone=" + telephone + "]";
	}

	public BackUser() {}

	public BackUser(String useraccount, String username, String userpwd, Integer roleid, Integer status, Integer deptid,
			Integer positionid, Integer worknumber, Long telephone, String systenm) {
		this.useraccount = useraccount;
		this.username = username;
		this.userpwd = userpwd;
		this.roleid = roleid;
		this.status = status;
		this.deptid = deptid;
		this.positionid = positionid;
		this.worknumber = worknumber;
		this.telephone = telephone;
		this.systenm = systenm;
	}

	
	
}