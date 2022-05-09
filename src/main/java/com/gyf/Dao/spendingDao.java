package com.gyf.Dao;

import com.gyf.Domain.HotComsumption;
import com.gyf.Domain.spending;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface spendingDao {
    //获取编号
    Integer getNum(@Param("name") String name);

    //增加消费类型
    void addKind(@Param("name") String name);
    //修改消费类型
    void alertKind(@Param("name1") String name1,@Param("name2") String name2);
    //删除消费类型
    void deleteKind(@Param("name") String name);
    //查看有哪些消费类型
    List<String> selectKind();
    //查看今日各个清单的消费热度
    List<HotComsumption> selectHotOfDay(@Param("year") int year, @Param("month") int month, @Param("day") int day);
    //查看今月消费热度
    List<HotComsumption> selectHotOfMonth(@Param("year") int year,@Param("month") int month);
    //增加消费清单
    void addSpending(@Param("spend") spending spend,@Param("num") int num);
    //查看一个月的消费清单
    List<spending> selectOfMonth(@Param("year") int year,@Param("month") int month);
    //查看总消费清单
    List<spending> selectOfAll();
    //查看本月总收益
    List<Integer> selectGainOfMonth(@Param("year") int year,@Param("month") int month);
    //查看今日总收益，今日利润，今日消费人数
    List<Integer> selectGainOfDay(@Param("year") int year,@Param("month") int month,@Param("day")int day);
}
