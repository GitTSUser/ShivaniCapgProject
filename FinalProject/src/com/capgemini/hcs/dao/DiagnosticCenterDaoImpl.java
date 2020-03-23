package com.capgemini.hcs.dao;

import java.util.ArrayList;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.exception.CenterIdException;
import com.capgemini.hcs.repository.DiagnosticCenterRepository;

public class DiagnosticCenterDaoImpl implements IDiagnosticCenterDao{
	
	DiagnosticCenterRepository dr=new DiagnosticCenterRepository();
	private static ArrayList<DiagnosticCenter> centers;
	
	public ArrayList<DiagnosticCenter> getCenters() {
		return centers;
	}
	
	public DiagnosticCenterDaoImpl() {
		if (getCenters()==null) {
			centers = new ArrayList<DiagnosticCenter>();
		}
	}
	
	@Override
	public boolean addCenter(String cName) {
		boolean flag=false;
        getCenters().add(new DiagnosticCenter(cName));
        flag=true;
        return flag;
	}

	
	@Override
	public boolean removeCenter(String id){
		boolean flag=false;
		try {
			int found=0;
			for(DiagnosticCenter dc:getCenters()){
				if (dc.getCenterId().equals(id)){ //centerid
					getCenters().remove(dc);
					found=1;
					flag=true;
					break;
				 }
              }
              if (found==0){
                 //if the Center Id does not matches the Center Id present in the list it throws exception.
                 throw new CenterIdException();
               }
		}catch(Exception e) {
			System.out.println(e);
		}
       return flag;
      }
}
