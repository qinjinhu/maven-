package com.ysd.entity;

import java.util.Date;

public class User {
     private String Id;
     private String LoginName;
     private String Password;
     private String IsLockout;
	 private Date LastLoginTime;
	 private Integer PsdWrongTime;
	 private Date LockTime;
	 private String ProtectEmail;
	 private String protectMTel;
	 private Date CreateTime;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getIsLockout() {
		return IsLockout;
	}
	public void setIsLockout(String isLockout) {
		IsLockout = isLockout;
	}
	public Date getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public Integer getPsdWrongTime() {
		return PsdWrongTime;
	}
	public void setPsdWrongTime(Integer psdWrongTime) {
		PsdWrongTime = psdWrongTime;
	}
	public Date getLockTime() {
		return LockTime;
	}
	public void setLockTime(Date lockTime) {
		LockTime = lockTime;
	}
	public String getProtectEmail() {
		return ProtectEmail;
	}
	public void setProtectEmail(String protectEmail) {
		ProtectEmail = protectEmail;
	}
	public String getProtectMTel() {
		return protectMTel;
	}
	public void setProtectMTel(String protectMTel) {
		this.protectMTel = protectMTel;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public User(String id, String loginName, String password, String isLockout, Date lastLoginTime,
			Integer psdWrongTime, Date lockTime, String protectEmail, String protectMTel, Date createTime) {
		super();
		Id = id;
		LoginName = loginName;
		Password = password;
		IsLockout = isLockout;
		LastLoginTime = lastLoginTime;
		PsdWrongTime = psdWrongTime;
		LockTime = lockTime;
		ProtectEmail = protectEmail;
		this.protectMTel = protectMTel;
		CreateTime = createTime;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", LoginName=" + LoginName + ", Password=" + Password + ", IsLockout=" + IsLockout
				+ ", LastLoginTime=" + LastLoginTime + ", PsdWrongTime=" + PsdWrongTime + ", LockTime=" + LockTime
				+ ", ProtectEmail=" + ProtectEmail + ", protectMTel=" + protectMTel + ", CreateTime=" + CreateTime
				+ "]";
	}
	 
     
     
}
