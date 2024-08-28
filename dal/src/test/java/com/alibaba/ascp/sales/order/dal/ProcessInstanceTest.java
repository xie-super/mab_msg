package com.alibaba.ascp.sales.order.dal;

import com.java3y.austin.entity.ErpInputEventDO;
import com.java3y.austin.mapper.ErpInputEventMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/process_test.xml")
public class ProcessInstanceTest {
    @Autowired
    private ErpInputEventMapper erpInputEventMapper;

    @Test
    public void test_erpInput_select() {
        ErpInputEventDO erpInputEventDO = erpInputEventMapper.selectByPrimaryKey(115018L);
        Assert.assertNotNull(erpInputEventDO);
    }
}
