package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.capgemini.hcs.dao.DiagnosticCenterDaoImpl;
import com.capgemini.hcs.exception.CenterListException;
import com.capgemini.hcs.exception.InvalidChoiceException;
import com.capgemini.hcs.repository.DiagnosticCenterRepository;
import com.capgemini.hcs.service.DiagnosticCenterServiceImpl;

public class MainController
{
    public static void main(String args[]){
    	
    	DiagnosticCenterServiceImpl h=new DiagnosticCenterServiceImpl();
    	DiagnosticCenterRepository dr=new DiagnosticCenterRepository();
    	
    	boolean result=false;
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Boolean outerExit=false;
            do{
            	System.out.println("*******************Welcome to Health Care System*****************");
            	System.out.println();
                System.out.println("Enter 1 for Admin");
                System.out.println("Enter 2 for Exit");
                char ch=br.readLine().charAt(0);
                DiagnosticCenterDaoImpl hsdao=new DiagnosticCenterDaoImpl();
                switch(ch){
                    case '1':
                    	Boolean exit=false;
                        do{
                        	System.out.println("----------ADMIN---------");
                        	System.out.println("Enter 1 for Add Center");
                            System.out.println("Enter 2 for Remove Center");
                            System.out.println("Enter 3 for Exiting from Admin Account");
                            char ch1=br.readLine().charAt(0);
                            switch(ch1){
                            	case '1':System.out.println("Add center -");
                            			 result=h.addCenter();
                                         System.out.println(result);
                                         break;
                                         
                                case '2':System.out.println("Remove center -");
                                		 if(hsdao.centers.size()!=0) {
                                			 result=h.removeCenter();
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
                            break;
                            
                    case '2':System.out.println("-----------EXIT------------");
                            System.out.println("Exiting From The System \nThankyou.");
                            outerExit=true;
                            break;
                            
                    default:
                            throw new InvalidChoiceException();
                		}
                }while(!outerExit);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
