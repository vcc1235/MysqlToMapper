package com.vcc.im.dao;
/**
@author vcc
@date Wed Apr 29 23:23:50 CST 2020
*/
import java.sql.Timestamp;

/** '用户表 */
public class User implements java.io.Serializable{
       private static final long serialVersionUID = 1L;

    /**  用户,*/
    private String userId;
    /**  账号,*/
    private String userAccount;
    /**  邮箱,*/
    private String userEmail;
    /**  昵称,*/
    private String userNickName;
    /**  密码,*/
    private String userPassword;
    /**  性别,*/
    private String userSex;
    /**  签名,*/
    private String userSign;
    /**  头像,*/
    private String userIcon;
    /**  国籍,*/
    private String userCountry;
    /**  手机号,*/
    private String userMobile;
    /**  区号,*/
    private String userCode;
    /**  省,*/
    private String userProvice;
    /**  城市,*/
    private String userCity;
    /**  县,*/
    private String userRegion;
    /**  创建时间,*/
    private Timestamp createTime;
    /**  更新时间,*/
    private Timestamp updateTime;
    /**  状态,*/
    private String status;

    /**  用户,*/
    public String getUserId(){
        return userId;
    }

    /**  用户,*/
    public void setUserId(String userId){
        this.userId = userId;
    }

    /**  账号,*/
    public String getUserAccount(){
        return userAccount;
    }

    /**  账号,*/
    public void setUserAccount(String userAccount){
        this.userAccount = userAccount;
    }

    /**  邮箱,*/
    public String getUserEmail(){
        return userEmail;
    }

    /**  邮箱,*/
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }

    /**  昵称,*/
    public String getUserNickName(){
        return userNickName;
    }

    /**  昵称,*/
    public void setUserNickName(String userNickName){
        this.userNickName = userNickName;
    }

    /**  密码,*/
    public String getUserPassword(){
        return userPassword;
    }

    /**  密码,*/
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }

    /**  性别,*/
    public String getUserSex(){
        return userSex;
    }

    /**  性别,*/
    public void setUserSex(String userSex){
        this.userSex = userSex;
    }

    /**  签名,*/
    public String getUserSign(){
        return userSign;
    }

    /**  签名,*/
    public void setUserSign(String userSign){
        this.userSign = userSign;
    }

    /**  头像,*/
    public String getUserIcon(){
        return userIcon;
    }

    /**  头像,*/
    public void setUserIcon(String userIcon){
        this.userIcon = userIcon;
    }

    /**  国籍,*/
    public String getUserCountry(){
        return userCountry;
    }

    /**  国籍,*/
    public void setUserCountry(String userCountry){
        this.userCountry = userCountry;
    }

    /**  手机号,*/
    public String getUserMobile(){
        return userMobile;
    }

    /**  手机号,*/
    public void setUserMobile(String userMobile){
        this.userMobile = userMobile;
    }

    /**  区号,*/
    public String getUserCode(){
        return userCode;
    }

    /**  区号,*/
    public void setUserCode(String userCode){
        this.userCode = userCode;
    }

    /**  省,*/
    public String getUserProvice(){
        return userProvice;
    }

    /**  省,*/
    public void setUserProvice(String userProvice){
        this.userProvice = userProvice;
    }

    /**  城市,*/
    public String getUserCity(){
        return userCity;
    }

    /**  城市,*/
    public void setUserCity(String userCity){
        this.userCity = userCity;
    }

    /**  县,*/
    public String getUserRegion(){
        return userRegion;
    }

    /**  县,*/
    public void setUserRegion(String userRegion){
        this.userRegion = userRegion;
    }

    /**  创建时间,*/
    public Timestamp getCreateTime(){
        return createTime;
    }

    /**  创建时间,*/
    public void setCreateTime(Timestamp createTime){
        this.createTime = createTime;
    }

    /**  更新时间,*/
    public Timestamp getUpdateTime(){
        return updateTime;
    }

    /**  更新时间,*/
    public void setUpdateTime(Timestamp updateTime){
        this.updateTime = updateTime;
    }

    /**  状态,*/
    public String getStatus(){
        return status;
    }

    /**  状态,*/
    public void setStatus(String status){
        this.status = status;
    }
}
