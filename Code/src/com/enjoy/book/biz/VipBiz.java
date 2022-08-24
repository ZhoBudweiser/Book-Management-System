package com.enjoy.book.biz;

import com.enjoy.book.bean.Vip;
import com.enjoy.book.dao.ClientDao;
import com.enjoy.book.dao.VipDao;

import java.sql.SQLException;
import java.util.List;

public class VipBiz {
    VipDao dao = new VipDao();
    public List<Vip> getAll(){
        try {
            return dao.getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
    public int add(String  name, double  deposit, double  rentDiscount, double  sellDiscount, long    borrowNum,
                   long    renew, long    borrowDate, long    time, double  overdue, double  damage, double  lose)
    {
        int count =0;
        try {
            count=dao.add(name, deposit, rentDiscount, sellDiscount, borrowNum, renew,
                    borrowDate, time, overdue, damage, lose);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }
    public int remove(String id) throws Exception {
        //如果有子项，是不能删除
        ClientDao clientDao = new ClientDao();
        int count =0;
        try {
            List<Vip> vips = clientDao.getByVipId(id);
            if(vips.size()>0){
                //不能删除
                throw new Exception("删除的类型有子信息，删除失败");
            }
            count=dao.remove(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;


    }
    public Vip getById(String id){
        Vip vip = null;

        try {
            vip = dao.getById(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return vip;
    }
    public int modify(String  name, double  deposit, double  rentDiscount, double  sellDiscount, long    borrowNum,
                      long    renew, long    borrowDate, long    time, double  overdue, double  damage, double  lose){
        int count =0;
        try {
            count=dao.modify(name, deposit, rentDiscount, sellDiscount, borrowNum, renew,
                    borrowDate, time, overdue, damage, lose);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }
}
