package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.daoImpl.AccountDAOImpl;
import com.kabank.mvc.service.AccountService;

public class AccountServiceImpl implements AccountService{
	
	public static AccountService getInstance() {
		return new AccountServiceImpl();
	}
	public AccountServiceImpl() {
	}
	
	@Override
	public ResultMap openAccount(Command cmd) {
		String r = String.valueOf((int)(Math.random()*8899+1000)+"-"+(int)(Math.random()*8999+1000)+"-"+(int)(Math.random()*8999+1000));       
		System.out.println("계좌번호 :" +r);
		return AccountDAOImpl.getInstance().insertAccount(cmd);
	}
	
	@Override
	public ResultMap findAccountById(Command cmd) {
		return AccountDAOImpl.getInstance().selectAccountById(cmd);
	}
	@Override
	public ResultMap findMobileById(Command cmd) {
		return null;
	}
	@Override
	public ResultMap findKakaoById(Command cmd) {
		return null;
	}


}




