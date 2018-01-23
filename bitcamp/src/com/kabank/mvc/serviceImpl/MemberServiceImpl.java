package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;
	
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}

	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	
	@Override
	public ResultMap findMemberById(Command cmd) {
		return dao.selectMemberById(cmd);
	}
	
	@Override
	public ResultMap make(Command cmd) {
		System.out.println("================MemberServiceImpl  joinMember 진입================");
		dao.insertMember(cmd);
		return null;
	}

	@Override
	public ResultMap login(Command cmd) {
		return MemberDAOImpl.getInstance().login(cmd);
	}

	@Override
	public ResultMap joinMember(Command cmd) {
		return null;
	}

	@Override
	public ResultMap changePass(Command cmd) {
		MemberDAOImpl.getInstance().updatePass(cmd);
		return null;
	}

	@Override
	public ResultMap newPass_update(Command cmd) {
		dao.newPass_alter(cmd);
		return null;
		
	}

	@Override
	public ResultMap nowIdDelete(Command cmd) {
		dao.nowId_leave(cmd);
		return null;
		
	}

	@Override
	public ResultMap memberInfo(Command cmd) {
		dao.memberTuple(cmd);
		return null;
		
	}

	
}


