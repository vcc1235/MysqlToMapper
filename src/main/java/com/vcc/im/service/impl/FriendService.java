package com.vcc.im.service.impl;
import com.vcc.im.common.AbstractService;
import com.vcc.im.dao.Friend;
import org.springframework.stereotype.Service;
import com.vcc.im.mapper.IFriendMapper;
import com.vcc.im.common.IOperations;
import javax.annotation.Resource;
import com.vcc.im.service.IFriendService;
/**
 * @author 123
 */
@Service("Friend")
public class FriendService extends AbstractService<Friend> implements IFriendService{
       public FriendService(){
           this.setTableName("friend");
        }
       @Resource
       private IFriendMapper friendMapper;
       @Override
       protected IOperations<Friend> getMapper(){
           return friendMapper;       }
       @Override
       public void setTableName(String tableName){           this.tableName=tableName;}
}