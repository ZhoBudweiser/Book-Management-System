package com.enjoy.book.biz;

import com.enjoy.book.bean.Client;
import com.enjoy.book.dao.ClientDao;
import com.enjoy.book.dao.VipDao;

import java.sql.SQLException;
import java.util.List;

public class ClientBiz {
  ClientDao  clientDao = new ClientDao();
  VipDao vipdao = new VipDao();
  public int add(String phone, String name, String sex, String grade, double balance, String Status, long borrorwNum){
    int count = 0;
    try {
      count = clientDao.add(phone,name,sex,grade,balance,Status,borrorwNum);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return count;
  }
  public int modify(String phone, String name, String sex, String grade){
    int count = 0;
    try {
      count = clientDao.modify(phone,name,sex,grade);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return count;
  }
  public int remove(String id) throws Exception {
    //账号余额 >0
    Client member = getById(id);
    if(member.getClientStatus().equals("注销")){
      throw new Exception("该账户已经被注销");
    }
    if(member.getClientBalance()>0){
      throw new Exception("此会员消费金额大于0,注销失败");
    }
//    //有外键不能删除
//    if(clientDao.exits(id)){
//      throw new Exception("此会员有借阅记录,注销失败");
//    }
    if(member.getClientStatus().equals("冻结")){
      throw new Exception("该账户冻结中,注销失败");
    }
    //删除
    int count =0;
    try {
      count = clientDao.remove(id);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return count;

  }
  public int activate(String id) throws Exception {
    Client member = getById(id);
    if(member.getClientStatus().equals("正常")){
      throw new Exception("该账户已经被激活");
    }
    int count =0;
    try {
      count = clientDao.activate(id);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return count;

  }
  public int modifyBalance(String idNumber,double amount){
    int count = 0;
    try {
      count = clientDao.modifyBalance(idNumber,amount);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return count;
  }
  public List<Client> getAll(){
    List<Client> members = null;
    try {
      members =  clientDao.getAll();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return members;

  }
  public Client getById(String id){
    Client member = null;
    try {
      member = clientDao.getById(id);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return member;
  }

  /**
   * 会员信息+会员对应的类型信息
   * @param idNumber
   * @return
   */
  public Client getByIdNumber(String idNumber){
    Client member = null;
    try {
      member = clientDao.getById(idNumber);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return member;
  }
}
