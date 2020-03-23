package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;
import com.capgemini.hcs.exception.CenterListException;
import com.capgemini.hcs.exception.InvalidChoiceException;

public class AdminController {
	boolean result=false;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	CenterController centerController=new CenterController();
	DiagnosticCenterDaoImpl centerDao=new DiagnosticCenterDaoImpl();

	public void healthSystem(){
		//DiagnosticCenterRepository dr=new DiagnosticCenterRepository();
		try {
		Boolean exit=false;
        do{
        	System.out.println("----------ADMIN---------");
        	System.out.println("Enter 1 for Add Center");
            System.out.println("Enter 2 for Remove Center");
            System.out.println("Enter 3 for Exiting from Admin Account");
            char ch1=br.readLine().charAt(0);
            switch(ch1){
            	case '1':System.out.println("Add center -");
            			 result=centerController.addCenter();
                         System.out.println(result);
                         break;
                         
                case '2':System.out.println("Remove center -");
                		 if(centerDao.getCenters().size()!=0) {
                			 result=centerController.removeCenter();
                			 System.out.println(result);
                			 }
                         else {
                        	//Exception is thrown when the center list is empty and no element means nothing can be removed.
                        	 throw new CenterListException();
                         }
                		 
                         break;
                         
                case '3':System.out.println("Exiting from Admin Account");
                         exit=true;
                         break;
                         
                default:
                		 throw new InvalidChoiceException();
                		 }
            }while(!exit);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
