package com.capgemini.hcs.dao.test;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;

public class DaoTesting {
	
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
	public boolean validSize(String cName){
		boolean res=true;
		if(cName.length()==0) {
			res=false;
		}
		return res;
	}
		
	//Testing method
	public boolean checkName(String cName) {
			boolean res=true;
			char ch=cName.charAt(0);
			if(!(ch>=65 && ch<=90) || !(ch>=97 && ch<=122)){
				res=false;
			}
			return res;
		}
	//Testing method	
	public boolean checkId(String centerId) {		
			boolean flag=false;
			for(DiagnosticCenter cd: healthSystemDao.centers) {
				if(cd.getCenterId().equals(centerId)) {
					flag=true;
					break;
				}
			}
			return flag;
		}
		
}
