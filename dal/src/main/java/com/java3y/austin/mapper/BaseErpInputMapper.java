package com.java3y.austin.mapper;

import com.java3y.austin.entity.ErpInputEventDO;

public interface BaseErpInputMapper {
    /**
     * 根据主键查询
     * @param id
     * @return
     *
     * @mbg.generated
     */
    ErpInputEventDO selectByPrimaryKey(Long id);
}
