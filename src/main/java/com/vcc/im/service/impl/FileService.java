package com.vcc.im.service.impl;
import com.vcc.im.common.AbstractService;
import com.vcc.im.dao.File;
import org.springframework.stereotype.Service;
import com.vcc.im.mapper.IFileMapper;
import com.vcc.im.common.IOperations;
import javax.annotation.Resource;
import com.vcc.im.service.IFileService;
/**
 * @author 123
 */
@Service("File")
public class FileService extends AbstractService<File> implements IFileService{
       public FileService(){
           this.setTableName("file");
        }
       @Resource
       private IFileMapper fileMapper;
       @Override
       protected IOperations<File> getMapper(){
           return fileMapper;       }
       @Override
       public void setTableName(String tableName){           this.tableName=tableName;}
}