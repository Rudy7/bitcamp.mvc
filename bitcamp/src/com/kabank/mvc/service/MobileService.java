package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface MobileService {

	public ResultMap openingNum(Command cmd);

	/*MemberBean findMobileById(String id);*/
	
	public ResultMap findMobileById(Command cmd);
}
