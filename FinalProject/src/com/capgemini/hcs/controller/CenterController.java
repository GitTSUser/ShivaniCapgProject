package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.capgemini.hcs.bean.Appointment;
import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.Test;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;
import com.capgemini.hcs.exception.CenterNameException;
import com.capgemini.hcs.service.DiagnosticCenterServiceImpl;

public class CenterController {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	DiagnosticCenterServiceImpl centerService= new DiagnosticCenterServiceImpl();
	DiagnosticCenterDaoImpl centerDao=new DiagnosticCenterDaoImpl();
	
	public boolean addCenter() {
		boolean result=false;
		try {
            System.out.println("Enter The Center Name to be Added");
            System.out.println("Enter the valid name with the first letter as capital.");
            String cName=br.readLine();
            if (cName.length()!=0){
            	result=centerService.addCenter(cName);
            	if(result==true) {
            		System.out.println("Center Added Succesfully");}
            	}
            else if(cName.length()==0){
            	//if the center name is blank, then it throws the exception.
                throw new CenterNameException(cName);
              }
		 }catch (Exception e) {
	           System.out.println(e);
	        }
		return result;
	}
	
	public boolean removeCenter() {
		boolean result=false;
		try {
            System.out.println("The Centers Are:");
            for(DiagnosticCenter a: centerDao.getCenters()){
        	
            	System.out.print("\nCenter Id- "+a.getCenterId()+"\t"); //centerid
            	System.out.println("Center Name-"+a.getCenterName());
            	for(Test test:a.listOfTests){
            		System.out.print("Test Id-"+test.getTestId()+"\t");
            		System.out.println("Test Name-"+test.getTestName());              
                 }
            	for(Appointment a1: a.appointmentList){
            		
            		System.out.println("Appointment Id       : " +a1.getAppId());
            		System.out.println("Name                 : " +a1.getUser().getUserName());
            		System.out.println("Test                 : " +a1.getTest().getTestName());
            		System.out.println("Appointment Schedule : " +a1.getDate());
            		System.out.println();
            	}
            }
            	 System.out.println("Enter The Center ID");
                 String id=br.readLine();
                 result=centerService.removeCenter(id);
                 if(result==true) {
                	 System.out.println("Center Removed Succesfully!");
                 }
		
		}catch (Exception e) {
            System.out.println(e);
        }
	return result;
}
}
