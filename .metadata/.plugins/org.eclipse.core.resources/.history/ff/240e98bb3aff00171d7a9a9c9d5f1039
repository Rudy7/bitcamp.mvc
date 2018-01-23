package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.daoImpl.MobileDAOImpl;
import com.kabank.mvc.service.MobileService;

public class MobileServiceImpl implements MobileService{

	public static MobileService getInstance() {
		return new MobileServiceImpl();
	}
	private MobileServiceImpl() {
		
	}
	@Override
	public ResultMap openingNum(Command cmd) {
		String rs = String.valueOf((int)(Math.random()*8899+1000)+"-"+(int)(Math.random()*8999+1000));     
		System.out.println("핸드폰번호 :" +rs);
		MobileDAOImpl.getInstance().openingPhone(cmd);
		return null;
	}
	@Override
	public ResultMap findMobileById(Command cmd) {
		return null;
	}



	
	
}
