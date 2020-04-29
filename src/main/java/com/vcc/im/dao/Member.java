package com.vcc.im.dao;
/**
@author vcc
@date Wed Apr 29 23:23:50 CST 2020
*/
import java.sql.Timestamp;

/** '成员表 */
public class Member implements java.io.Serializable{
       private static final long serialVersionUID = 1L;

    /**  id,*/
    private Integer memberId;
    /**  房间id ,*/
    private Integer roomId;
    /**  用户,*/
    private String userId;
    /**  群昵称,*/
    private String roomName;
    /**  是否置顶,*/
    private String roomTip;
    /**  角色,*/
    private Integer roomRole;
    /**  创建时间,*/
    private Timestamp createTime;
    /**  更新时间,*/
    private Timestamp updateTime;

    /**  id,*/
    public Integer getMemberId(){
        return memberId;
    }

    /**  id,*/
    public void setMemberId(Integer memberId){
        this.memberId = memberId;
    }

    /**  房间id ,*/
    public Integer getRoomId(){
        return roomId;
    }

    /**  房间id ,*/
    public void setRoomId(Integer roomId){
        this.roomId = roomId;
    }

    /**  用户,*/
    public String getUserId(){
        return userId;
    }

    /**  用户,*/
    public void setUserId(String userId){
        this.userId = userId;
    }

    /**  群昵称,*/
    public String getRoomName(){
        return roomName;
    }

    /**  群昵称,*/
    public void setRoomName(String roomName){
        this.roomName = roomName;
    }

    /**  是否置顶,*/
    public String getRoomTip(){
        return roomTip;
    }

    /**  是否置顶,*/
    public void setRoomTip(String roomTip){
        this.roomTip = roomTip;
    }

    /**  角色,*/
    public Integer getRoomRole(){
        return roomRole;
    }

    /**  角色,*/
    public void setRoomRole(Integer roomRole){
        this.roomRole = roomRole;
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
}
