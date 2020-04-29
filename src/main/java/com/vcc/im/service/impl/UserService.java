package com.vcc.im.service.impl;
import com.vcc.im.common.AbstractService;
import com.vcc.im.dao.User;
import org.springframework.stereotype.Service;
import com.vcc.im.mapper.IUserMapper;
import com.vcc.im.common.IOperations;
import javax.annotation.Resource;
import com.vcc.im.service.IUserService;
/**
 * @author 123
 */
@Service("User")
public class UserService extends AbstractService<User> implements IUserService{
       public UserService(){
           this.setTableName("user");
        }
       @Resource
       private IUserMapper userMapper;
       @Override
       protected IOperations<User> getMapper(){
           return userMapper;       }
       @Override
       public void setTableName(String tableName){           this.tableName=tableName;}
}