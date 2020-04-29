package com.vcc.im.dao;
/**
@author vcc
@date Wed Apr 29 23:23:50 CST 2020
*/
import java.sql.Timestamp;

/** '群组表 */
public class Room implements java.io.Serializable{
       private static final long serialVersionUID = 1L;

    /**  id,*/
    private Integer roomId;
    /**  创建者,*/
    private String userId;
    /**  名称,*/
    private String roomName;
    /**  类型,*/
    private String roomType;
    /**  密码,*/
    private String roomPassword;
    /**  签名,*/
    private String roomSign;
    /**  最多人数,*/
    private Long roomSum;
    /**  介绍,*/
    private String roomDec;
    /**  文件,*/
    private String roomFileList;
    /**  相册,*/
    private String roomImgList;
    /**  创建,*/
    private Timestamp createTime;
    /**  更新时间,*/
    private Timestamp updateTime;

    /**  id,*/
    public Integer getRoomId(){
        return roomId;
    }

    /**  id,*/
    public void setRoomId(Integer roomId){
        this.roomId = roomId;
    }

    /**  创建者,*/
    public String getUserId(){
        return userId;
    }

    /**  创建者,*/
    public void setUserId(String userId){
        this.userId = userId;
    }

    /**  名称,*/
    public String getRoomName(){
        return roomName;
    }

    /**  名称,*/
    public void setRoomName(String roomName){
        this.roomName = roomName;
    }

    /**  类型,*/
    public String getRoomType(){
        return roomType;
    }

    /**  类型,*/
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    /**  密码,*/
    public String getRoomPassword(){
        return roomPassword;
    }

    /**  密码,*/
    public void setRoomPassword(String roomPassword){
        this.roomPassword = roomPassword;
    }

    /**  签名,*/
    public String getRoomSign(){
        return roomSign;
    }

    /**  签名,*/
    public void setRoomSign(String roomSign){
        this.roomSign = roomSign;
    }

    /**  最多人数,*/
    public Long getRoomSum(){
        return roomSum;
    }

    /**  最多人数,*/
    public void setRoomSum(Long roomSum){
        this.roomSum = roomSum;
    }

    /**  介绍,*/
    public String getRoomDec(){
        return roomDec;
    }

    /**  介绍,*/
    public void setRoomDec(String roomDec){
        this.roomDec = roomDec;
    }

    /**  文件,*/
    public String getRoomFileList(){
        return roomFileList;
    }

    /**  文件,*/
    public void setRoomFileList(String roomFileList){
        this.roomFileList = roomFileList;
    }

    /**  相册,*/
    public String getRoomImgList(){
        return roomImgList;
    }

    /**  相册,*/
    public void setRoomImgList(String roomImgList){
        this.roomImgList = roomImgList;
    }

    /**  创建,*/
    public Timestamp getCreateTime(){
        return createTime;
    }

    /**  创建,*/
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
