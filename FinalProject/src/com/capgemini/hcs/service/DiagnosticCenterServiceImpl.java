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
    public boolean addCenter(String cName){
        boolean flag=healthSystemDao.addCenter(cName);
        return flag;
    }
	
    @Override
    public boolean removeCenter(String id){
    	boolean flag=healthSystemDao.removeCenter(id);
        return flag;
}
}
