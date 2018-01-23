package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.daoImpl.CommonDAOImpl;
import com.kabank.mvc.service.CommonService;
import com.kabank.mvc.service.MobileService;

public class CommonServiceImpl implements CommonService{
	public static CommonService getInstance() {
		return new CommonServiceImpl();
	}
	private CommonServiceImpl() {}

	@Override
	public ResultMap countTable(Command cmd) {
		CommonDAOImpl.getInstance().selectTableCount(cmd);
	return null;
				
			
	}
	

}
