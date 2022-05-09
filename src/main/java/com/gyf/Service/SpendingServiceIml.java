package com.gyf.Service;

import com.gyf.Dao.spendingDao;
import com.gyf.Domain.HotComsumption;
import com.gyf.Domain.spending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SpendingServiceIml implements spendingService {
    @Autowired
    spendingDao Dao;

    @Override
    public void addKind(String name) {
        Dao.addKind(name);
    }

    @Override
    public void alertKind(String name1, String name2) {
        Dao.alertKind(name1,name2);
    }

    @Override
    public void deleteKind(String name) {
        Dao.deleteKind(name);
    }

    @Override
    public List<String> selectKind() {
        List<String> array =  Dao.selectKind();
        return array;
    }

    @Override
    public List<HotComsumption> selectHotOfDay(int year, int month, int day) {
        List<HotComsumption> array = Dao.selectHotOfDay(year,month,day);
        return array;
    }

    @Override
    public List<HotComsumption> selectHotOfMonth(int year, int month) {
        List<HotComsumption> array=Dao.selectHotOfMonth(year,month);
        return array;
    }

    @Override
    public void addSpending(spending spend) {
        int num = Dao.getNum(spend.kind);
        Dao.addSpending(spend,num);
    }

    @Override
    public List<spending> selectOfMonth(int year, int month) {
        List<spending> array = Dao.selectOfMonth(year,month);
        return array;
    }

    @Override
    public List<spending> selectOfAll() {
    List<spending> array = Dao.selectOfAll();
    return array;
    }

    @Override
    public List<Integer> selectGainOfMonth(int year, int month) {
        List<Integer> array = Dao.selectGainOfMonth(year,month);
        return  array;
    }

    @Override
    public List<Integer> selectGainOfDay(int year, int month, int day) {
        List<Integer> array = Dao.selectGainOfDay(year, month, day);
        return array;
    }
}
