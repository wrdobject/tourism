package com.sdgl.pojo.set;

import java.util.Date;

public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private int userRole;
    private Date create_date;
    private String userAddress;
    private String user_QQ;
    private int user_Dept;
    private String Sex;
    private String phoneNo;
    private int userState;
    private String OpenId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUser_QQ() {
        return user_QQ;
    }

    public void setUser_QQ(String user_QQ) {
        this.user_QQ = user_QQ;
    }

    public int getUser_Dept() {
        return user_Dept;
    }

    public void setUser_Dept(int user_Dept) {
        this.user_Dept = user_Dept;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }
}
