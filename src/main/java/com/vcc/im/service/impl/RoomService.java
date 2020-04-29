package com.vcc.im.service.impl;
import com.vcc.im.common.AbstractService;
import com.vcc.im.dao.Room;
import org.springframework.stereotype.Service;
import com.vcc.im.mapper.IRoomMapper;
import com.vcc.im.common.IOperations;
import javax.annotation.Resource;
import com.vcc.im.service.IRoomService;
/**
 * @author 123
 */
@Service("Room")
public class RoomService extends AbstractService<Room> implements IRoomService{
       public RoomService(){
           this.setTableName("room");
        }
       @Resource
       private IRoomMapper roomMapper;
       @Override
       protected IOperations<Room> getMapper(){
           return roomMapper;       }
       @Override
       public void setTableName(String tableName){           this.tableName=tableName;}
}