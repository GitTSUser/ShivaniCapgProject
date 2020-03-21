package com.capgemini.hcs.repository;

import java.util.ArrayList;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;

public class DiagnosticCenterRepository {
	static DiagnosticCenterDaoImpl hsdao=new DiagnosticCenterDaoImpl();
	
	
	static{
		hsdao.centers.add(new DiagnosticCenter("Kmc"));
		hsdao.centers.add(new DiagnosticCenter("Kulwanti"));
		hsdao.centers.add(new DiagnosticCenter("Regency"));
		hsdao.centers.add(new DiagnosticCenter("Apc Hospital"));
		hsdao.centers.add(new DiagnosticCenter("Apollo"));
	}
	static public ArrayList<DiagnosticCenter> get(){
		return hsdao.centers;
	}
	
}
