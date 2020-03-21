package com.capgemini.hcs.service;

import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;

public class DiagnosticCenterServiceImpl implements IDiagnosticCenterService{
	
	private static DiagnosticCenterDaoImpl healthSystemDao;
	
	public DiagnosticCenterServiceImpl() {
		if(healthSystemDao==null) {
			healthSystemDao=new DiagnosticCenterDaoImpl();
		}
	}
	
	@Override
    public boolean addCenter(){
        boolean flag=healthSystemDao.addCenter();
        return flag;
    }
	
    @Override
    public boolean removeCenter(){
    	boolean flag=healthSystemDao.removeCenter();
        return flag;
}
}
