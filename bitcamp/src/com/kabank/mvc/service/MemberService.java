package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface MemberService {

	public ResultMap findMemberById(Command cmd);
	public ResultMap joinMember(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap make(Command cmd);
	public ResultMap changePass(Command cmd);
	public ResultMap newPass_update(Command cmd);
	public ResultMap nowIdDelete(Command cmd);
	public ResultMap memberInfo(Command cmd);

}

