package com.capgemini.hcs.service.test;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;

public class ServiceTesting {
	DiagnosticCenterDaoImpl healthSystemDao=new DiagnosticCenterDaoImpl();
	
	//Testing method
	public boolean validCenterName(String cName) {
		boolean res=true;
		if(!(cName.charAt(0)>=65 && cName.charAt(0)<=90)) {
			res=false;
		}
		return res;
	}
	//Testing method
	public boolean checkId(String centerId) {		
		boolean flag=false;
		for(DiagnosticCenter cd: healthSystemDao.getCenters()) {
			if(cd.getCenterId().equals(centerId)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
