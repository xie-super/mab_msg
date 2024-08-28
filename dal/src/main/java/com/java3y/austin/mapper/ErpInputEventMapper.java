package com.java3y.austin.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpInputEventMapper  extends BaseErpInputMapper{

    /**
     * 更新状态
     *
     * @param shardingKey 分库分表键
     * @param uniqueCode  唯一键
     * @return 影响行数
     */
    int updateStatus(@Param("shardingKey") String shardingKey, @Param("uniqueCode") String uniqueCode, @Param("processNode") String processNode, @Param("status") Integer status, @Param("errorCode") String errorCode, @Param("errorMsg") String errorMsg);
}