package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.OracleEnum;
import java.sql.*;
public class AdminDAOImpl implements AdminDAO {

	public static AdminDAO getInstance() {
		return new AdminDAOImpl();
	}
	private AdminDAOImpl() {
		
	}


	@Override
	public ResultMap makeTable(Command cmd) {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.value);
			Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
					  OracleEnum.ORACLE_USERNAME.value, 
					  OracleEnum.ORACLE_PASSWORD.value);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(cmd.getData());
			System.out.println("넘어온 sql :" +cmd.getData());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}