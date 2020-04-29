package com.vcc.im.common;
import java.util.LinkedHashMap;
import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * @author 123
 */


public interface IOperations<T extends Serializable> {

   List<T> getAll(@Param("field") String field,@Param("condition") LinkedHashMap<String, String> condition,@Param("offset") int offset , @Param("limit") int limit,@Param("order") String order,@Param("tableName") String tableName);


   java.lang.Integer getCount(@Param("field") String field,@Param("condition") LinkedHashMap<String, String> condition,@Param("offset") int offset , @Param("limit") int limit,@Param("order") String order,@Param("tableName") String tableName);


   void insertList(@Param("list") List<T> list, @Param("tableName") String tableName);


   void insertTo(@Param("entity") final T entity, @Param("tableName") String tableName);


   int updateBatch(@Param("list") List<T> list,@Param("field") String field,@Param("condition") LinkedHashMap<String, String> condition,  @Param("tableName") String tableName);


   int update(@Param("entity") final T entity, @Param("field") String field,@Param("condition") LinkedHashMap<String, String> condition,  @Param("tableName") String tableName);


   int updateBatchById(@Param("list") List<T> list,@Param("field") String field, @Param("tableName") String tableName);


   int updateById(@Param("entity") final T entity, @Param("field") String field, @Param("tableName") String tableName);


}
