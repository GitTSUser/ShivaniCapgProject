package com.capgemini.hcs.repository;

import java.util.ArrayList;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;

public class DiagnosticCenterRepository {
	static DiagnosticCenterDaoImpl hsdao=new DiagnosticCenterDaoImpl();
	
	
	static{
		hsdao.getCenters().add(new DiagnosticCenter("Kmc"));
		hsdao.getCenters().add(new DiagnosticCenter("Kulwanti"));
		hsdao.getCenters().add(new DiagnosticCenter("Regency"));
		hsdao.getCenters().add(new DiagnosticCenter("Apc Hospital"));
		hsdao.getCenters().add(new DiagnosticCenter("Apollo"));
	}
	static public ArrayList<DiagnosticCenter> get(){
		return hsdao.getCenters();
	}
	
}
