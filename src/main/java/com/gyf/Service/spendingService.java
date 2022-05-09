package com.gyf.Service;

import com.gyf.Domain.spending;

import java.util.List;

public interface spendingService {
    //增加消费类型
    void addKind(String name);
    //修改消费类型
    void alertKind(String name1,String name2);
    //删除消费类型
    void deleteKind(String name);
    //查看有哪些消费类型
    List<String> selectKind();
    //查看今日各个清单的消费热度
    List<List<String>> selectHotOfDay(int year,int month,int day);
    //查看今月消费热度
    List<List<String>> selectHotOfMonth(int year,int month);
    //增加消费清单
    void addSpending(spending spend);
    //查看一个月的消费清单
    List<spending> selectOfMonth(int year,int month);
    //查看总消费清单
    List<spending> selectOfAll();
    //查看本月总收益
    List<Integer> selectGainOfMonth(int year,int month);
    //查看今日总收益，今日利润，今日消费人数
    List<Integer> selectGainOfDay(int year,int month,int day);
}
