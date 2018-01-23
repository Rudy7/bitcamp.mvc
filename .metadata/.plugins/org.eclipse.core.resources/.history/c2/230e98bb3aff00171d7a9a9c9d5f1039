package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.enums.DDLEnum;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDAO dao;
	
	public static AdminService getInstance() {
		return new AdminServiceImpl();
	}
	private AdminServiceImpl() {	
	}

	@Override
	public ResultMap createTable(Command cmd) {
		System.out.println("================관리자 서비스임플 진입==============");
		String sql ="";
		switch (cmd.getData()) {
		case "member":
			sql = DDLEnum.CREATE_TABLE_MEMBER.toString();
			break;
		case "attend":
			sql = DDLEnum.CREATE_TABLE_ATTEND.toString();
			break;
		case "bank":
			sql = DDLEnum.CREATE_TABLE_BANK.toString();
			break;
		case "mobile":
			System.out.println("-------------------skTelecom 진입 : ------------------");
			sql = DDLEnum.CREATE_TABLE_MOBILE.toString();
			break;
		default:
			break;
		}
		dao.makeTable(cmd);
		return null;
	}

	

}	