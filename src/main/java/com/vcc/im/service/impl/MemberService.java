package com.vcc.im.service.impl;
import com.vcc.im.common.AbstractService;
import com.vcc.im.dao.Member;
import org.springframework.stereotype.Service;
import com.vcc.im.mapper.IMemberMapper;
import com.vcc.im.common.IOperations;
import javax.annotation.Resource;
import com.vcc.im.service.IMemberService;
/**
 * @author 123
 */
@Service("Member")
public class MemberService extends AbstractService<Member> implements IMemberService{
       public MemberService(){
           this.setTableName("member");
        }
       @Resource
       private IMemberMapper memberMapper;
       @Override
       protected IOperations<Member> getMapper(){
           return memberMapper;       }
       @Override
       public void setTableName(String tableName){           this.tableName=tableName;}
}