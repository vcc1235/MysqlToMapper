package com.vcc.im.common;
import java.util.LinkedHashMap;
import java.io.Serializable;
import java.util.List;


/**
 * @author 123
 */
public interface IServiceOperations<T extends Serializable> extends IOperations<T> {

   List<T> getList(String field, LinkedHashMap<String, String> condition,int offset,int limit,String order);

   List<T> getList(LinkedHashMap<String, String> condition,int offset,int limit,String order);

   List<T> getList(LinkedHashMap<String, String> condition,int offset,int limit);

   List<T> getAll(String field, LinkedHashMap<String, String> condition);

   List<T> getAll(String field, LinkedHashMap<String, String> condition,String order);

   List<T> getAll(LinkedHashMap<String, String> condition);

   List<T> getAll(LinkedHashMap<String, String> condition , String order);

   T getOne(LinkedHashMap<String, String> condition);

   Integer getCount(String field,LinkedHashMap<String, String> condition,int offset,int limit);

   Integer getCount(String field,LinkedHashMap<String, String> condition);

   void insertList(List<T> list);

   void insert(final T entity);

   int updateBatch(List<T> list,String field,LinkedHashMap<String, String> condition);

   int updateBatch(List<T> list,LinkedHashMap<String, String> condition);

   int updateBatch(List<T> list);

   int update(final T entity,String field,LinkedHashMap<String, String> condition);

   int update(final T entity,LinkedHashMap<String, String> condition);

   int update(final T entity);

}
