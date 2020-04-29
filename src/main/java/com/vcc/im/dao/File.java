package com.vcc.im.dao;
/**
@author vcc
@date Wed Apr 29 23:23:50 CST 2020
*/
import java.sql.Timestamp;

/** '文件表 */
public class File implements java.io.Serializable{
       private static final long serialVersionUID = 1L;

    /**  id,*/
    private Integer fileId;
    /**  名称,*/
    private String fileName;
    /**  路径,*/
    private String fileUrl;
    /**  大小,*/
    private Integer fileSize;
    /**  格式,*/
    private String fileType;
    /**  拥有者,*/
    private String userId;
    /**  创建时间,*/
    private Timestamp createTime;
    /**  更新时间,*/
    private Timestamp updateTime;

    /**  id,*/
    public Integer getFileId(){
        return fileId;
    }

    /**  id,*/
    public void setFileId(Integer fileId){
        this.fileId = fileId;
    }

    /**  名称,*/
    public String getFileName(){
        return fileName;
    }

    /**  名称,*/
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    /**  路径,*/
    public String getFileUrl(){
        return fileUrl;
    }

    /**  路径,*/
    public void setFileUrl(String fileUrl){
        this.fileUrl = fileUrl;
    }

    /**  大小,*/
    public Integer getFileSize(){
        return fileSize;
    }

    /**  大小,*/
    public void setFileSize(Integer fileSize){
        this.fileSize = fileSize;
    }

    /**  格式,*/
    public String getFileType(){
        return fileType;
    }

    /**  格式,*/
    public void setFileType(String fileType){
        this.fileType = fileType;
    }

    /**  拥有者,*/
    public String getUserId(){
        return userId;
    }

    /**  拥有者,*/
    public void setUserId(String userId){
        this.userId = userId;
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
