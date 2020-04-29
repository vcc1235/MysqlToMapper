package com.vcc.im.dao;
/**
@author vcc
@date Wed Apr 29 23:23:50 CST 2020
*/
import java.sql.Timestamp;

/** '好友关系 */
public class Friend implements java.io.Serializable{
       private static final long serialVersionUID = 1L;

    /**  id,*/
    private Integer friendId;
    /**  用户id,*/
    private String friendUserId;
    /**  好友id,*/
    private String firendToId;
    /**  黑名单,*/
    private String block;
    /**  消息置顶,*/
    private String tip;
    /**  请求添加好友,*/
    private String request;
    /**  是否同意添加好友,*/
    private String response;
    /**  创建时间,*/
    private Timestamp createTime;
    /**  更新时间,*/
    private Timestamp updateTime;
    /**  指定看朋友圈权限,*/
    private String monent;

    /**  id,*/
    public Integer getFriendId(){
        return friendId;
    }

    /**  id,*/
    public void setFriendId(Integer friendId){
        this.friendId = friendId;
    }

    /**  用户id,*/
    public String getFriendUserId(){
        return friendUserId;
    }

    /**  用户id,*/
    public void setFriendUserId(String friendUserId){
        this.friendUserId = friendUserId;
    }

    /**  好友id,*/
    public String getFirendToId(){
        return firendToId;
    }

    /**  好友id,*/
    public void setFirendToId(String firendToId){
        this.firendToId = firendToId;
    }

    /**  黑名单,*/
    public String getBlock(){
        return block;
    }

    /**  黑名单,*/
    public void setBlock(String block){
        this.block = block;
    }

    /**  消息置顶,*/
    public String getTip(){
        return tip;
    }

    /**  消息置顶,*/
    public void setTip(String tip){
        this.tip = tip;
    }

    /**  请求添加好友,*/
    public String getRequest(){
        return request;
    }

    /**  请求添加好友,*/
    public void setRequest(String request){
        this.request = request;
    }

    /**  是否同意添加好友,*/
    public String getResponse(){
        return response;
    }

    /**  是否同意添加好友,*/
    public void setResponse(String response){
        this.response = response;
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

    /**  指定看朋友圈权限,*/
    public String getMonent(){
        return monent;
    }

    /**  指定看朋友圈权限,*/
    public void setMonent(String monent){
        this.monent = monent;
    }
}
