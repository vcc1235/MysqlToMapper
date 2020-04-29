package com.vcc.im.common;
import java.util.LinkedHashMap;
import java.io.Serializable;
import java.util.List;


/**
 * @author 123
 */
public abstract class AbstractService<T extends Serializable> implements IServiceOperations<T> {

   protected abstract IOperations<T> getMapper();
   protected String tableName = "";
   public abstract void setTableName(String tableName);
   protected String getTableName() { return this.tableName;}
   @Override
   public List<T> getList(String field, LinkedHashMap<String, String> condition,int offset,int limit,String order) {
       return this.getAll(field,condition,offset,limit,order,tableName);
   }
   @Override
   public List<T> getList(LinkedHashMap<String, String> condition,int offset,int limit,String order){
       return this.getAll(null,condition,offset,limit,order,tableName);
   }
   @Override
   public List<T> getList(LinkedHashMap<String, String> condition,int offset,int limit){
       return this.getAll(null,condition,offset,limit,null,tableName);
   }
   @Override
   public List<T> getAll(String field, LinkedHashMap<String, String> condition){
       return this.getAll(field,condition,0,0,null,tableName);
   }
   @Override
   public List<T> getAll(String field, LinkedHashMap<String, String> condition,String order){
       return this.getAll(field,condition,0,0,order,tableName);
   }
   @Override
   public List<T> getAll(LinkedHashMap<String, String> condition){
       return this.getAll(null,condition,0,0,null,tableName);
   }
   @Override
   public List<T> getAll(LinkedHashMap<String, String> condition , String order){
       return this.getAll(null,condition,0,0,order,tableName);
   }
   @Override
   public T getOne(LinkedHashMap<String, String> condition){
       List<T> list = this.getAll(null,condition,0,1,null,tableName);       if(list != null && list.size()>0){return list.get(0);} 
           return null;
   }
   @Override
   public Integer getCount(String field,LinkedHashMap<String, String> condition,int offset,int limit){
       return this.getCount(field,condition,offset,limit,null,tableName);

   }
   @Override
   public Integer getCount(String field,LinkedHashMap<String, String> condition){
       return this.getCount(field,condition,0,0,null,tableName);
   }
   @Override
   public void insertList(List<T> list){
        this.insertList(list,tableName);
   }
   @Override
   public void insert(final T entity){
        this.insertTo(entity,tableName);
   }
   @Override
   public int updateBatch(List<T> list,String field,LinkedHashMap<String, String> condition){
       return this.updateBatch(list,field,condition,tableName);
   }

   @Override
   public int updateBatch(List<T> list,LinkedHashMap<String, String> condition){
       return this.updateBatch(list,null,condition,tableName);
   }

   @Override
   public int updateBatch(List<T> list){
       return this.updateBatchById(list,null,tableName);
   }

   @Override
   public int update(final T entity,String field,LinkedHashMap<String, String> condition){
       return this.update(entity,field,condition,tableName);
   }

   @Override
   public int update(final T entity,LinkedHashMap<String, String> condition){
       return this.update(entity,null,condition,tableName);
   }

   @Override
   public int update(final T entity){
       return this.updateById(entity,null,tableName);
   }

/** 下面为内部方式无需调用 可以根据下面方法自定义新的 */

   @Override
   public List<T> getAll(String field,LinkedHashMap<String, String> condition,int offset , int limit,String order,String tableName){
      return this.getMapper().getAll(field,condition,offset,limit,order,tableName);
   }


   @Override
   public java.lang.Integer getCount(String field,LinkedHashMap<String, String> condition,int offset , int limit,String order,String tableName){
      return this.getMapper().getCount(field,condition,offset,limit,order,tableName);
   }


   @Override
   public void insertList(List<T> list, String tableName){
       this.getMapper().insertList(list,tableName);
   }
   @Override
   public void insertTo(final T entity, String tableName){
       this.getMapper().insertTo(entity,tableName);
   }
   @Override
   public int updateBatch(List<T> list,String field,LinkedHashMap<String, String> condition,String tableName){
      return this.getMapper().updateBatch(list,field,condition,tableName);
   }


   @Override
   public int update(final T entity, String field,LinkedHashMap<String, String> condition,  String tableName){
      return this.getMapper().update(entity,field,condition,tableName);
   }


   @Override
   public int updateBatchById(List<T> list,String field,String tableName){
      return this.getMapper().updateBatchById(list,field,tableName);
   }


   @Override
   public int updateById(final T entity, String field, String tableName){
      return this.getMapper().updateById(entity,field,tableName);
   }


}
