package com.sdgl.pojo.onefei;

import lombok.Data;

import java.util.Date;

@Data
public class TeamAll extends DjsTe {

    private Integer qId;

    private Integer qRId;

    private String qCarName;

    private String qType;

    private Date qStartTime;

    private Date qEndTime;

    private String qPlateNum;

    private Double qPrice;

    private String qDriverName;

    private String qIphone;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getqRId() {
        return qRId;
    }

    public void setqRId(Integer qRId) {
        this.qRId = qRId;
    }

    public String getqCarName() {
        return qCarName;
    }

    public void setqCarName(String qCarName) {
        this.qCarName = qCarName == null ? null : qCarName.trim();
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType == null ? null : qType.trim();
    }

    public Date getqStartTime() {
        return qStartTime;
    }

    public void setqStartTime(Date qStartTime) {
        this.qStartTime = qStartTime;
    }

    public Date getqEndTime() {
        return qEndTime;
    }

    public void setqEndTime(Date qEndTime) {
        this.qEndTime = qEndTime;
    }

    public String getqPlateNum() {
        return qPlateNum;
    }

    public void setqPlateNum(String qPlateNum) {
        this.qPlateNum = qPlateNum == null ? null : qPlateNum.trim();
    }

    public Double getqPrice() {
        return qPrice;
    }

    public void setqPrice(Double qPrice) {
        this.qPrice = qPrice;
    }

    public String getqDriverName() {
        return qDriverName;
    }

    public void setqDriverName(String qDriverName) {
        this.qDriverName = qDriverName == null ? null : qDriverName.trim();
    }

    public String getqIphone() {
        return qIphone;
    }

    public void setqIphone(String qIphone) {
        this.qIphone = qIphone == null ? null : qIphone.trim();
    }




    private Integer userid;

    private String username;

    private String userpwd;

    private Integer userrole;

    private Date createDate;

    private String useraddress;

    private String userQq;

    private Integer userDept;

    private String phoneno;

    private String openid;

    private Integer usernum;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getUserrole() {
        return userrole;
    }

    public void setUserrole(Integer userrole) {
        this.userrole = userrole;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public Integer getUserDept() {
        return userDept;
    }

    public void setUserDept(Integer userDept) {
        this.userDept = userDept;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }


    private Integer basicId;

    private String basicNum;

    private String basicName;

    private String basicFountain;

    private Integer basicDays;

    private Date basicCreationTime;

    private String basicCreationPeople;

    private Date basicModifyTime;

    private String basicModifyPeople;

    private String basicOne;

    private String basicTwo;

    private String basicThree;

    public Integer getBasicId() {
        return basicId;
    }

    public void setBasicId(Integer basicId) {
        this.basicId = basicId;
    }

    public String getBasicNum() {
        return basicNum;
    }

    public void setBasicNum(String basicNum) {
        this.basicNum = basicNum == null ? null : basicNum.trim();
    }

    public String getBasicName() {
        return basicName;
    }

    public void setBasicName(String basicName) {
        this.basicName = basicName == null ? null : basicName.trim();
    }

    public String getBasicFountain() {
        return basicFountain;
    }

    public void setBasicFountain(String basicFountain) {
        this.basicFountain = basicFountain == null ? null : basicFountain.trim();
    }

    public Integer getBasicDays() {
        return basicDays;
    }

    public void setBasicDays(Integer basicDays) {
        this.basicDays = basicDays;
    }

    public Date getBasicCreationTime() {
        return basicCreationTime;
    }

    public void setBasicCreationTime(Date basicCreationTime) {
        this.basicCreationTime = basicCreationTime;
    }

    public String getBasicCreationPeople() {
        return basicCreationPeople;
    }

    public void setBasicCreationPeople(String basicCreationPeople) {
        this.basicCreationPeople = basicCreationPeople == null ? null : basicCreationPeople.trim();
    }

    public Date getBasicModifyTime() {
        return basicModifyTime;
    }

    public void setBasicModifyTime(Date basicModifyTime) {
        this.basicModifyTime = basicModifyTime;
    }

    public String getBasicModifyPeople() {
        return basicModifyPeople;
    }

    public void setBasicModifyPeople(String basicModifyPeople) {
        this.basicModifyPeople = basicModifyPeople == null ? null : basicModifyPeople.trim();
    }

    public String getBasicOne() {
        return basicOne;
    }

    public void setBasicOne(String basicOne) {
        this.basicOne = basicOne == null ? null : basicOne.trim();
    }

    public String getBasicTwo() {
        return basicTwo;
    }

    public void setBasicTwo(String basicTwo) {
        this.basicTwo = basicTwo == null ? null : basicTwo.trim();
    }

    public String getBasicThree() {
        return basicThree;
    }

    public void setBasicThree(String basicThree) {
        this.basicThree = basicThree == null ? null : basicThree.trim();
    }
}
