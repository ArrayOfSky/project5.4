package com.gyf.service;

import com.gyf.Config.SpringConfig;
import com.gyf.Domain.spending;
import com.gyf.Service.SpendingServiceIml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DaoTest {
    @Autowired
    private com.gyf.Domain.spending spending;
    @Autowired
    private SpendingServiceIml service;
    @Test
    public void testAddSpending(){
        spending spend = new spending(1000.1,"采购",2022,5,8,21,42,30);
        service.addSpending(spend);
    }
    @Test
    public void testAddKind(){
        service.addKind("采购");
    }
    @Test
    public void alertKind(){
        service.alertKind("采购","不正经产品");
    }
    @Test
    public void deleteKind(){
        service.deleteKind("采购");
    }
    @Test
    public void selectKind(){
        System.out.println( service.selectKind());
    }
    @Test
    public void selectHotOfDay(){
        System.out.println(service.selectHotOfDay(2022,5,8));
    }
}
