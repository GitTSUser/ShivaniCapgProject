package com.capgemini.hcs.bean;
//import java.time.LocalDateTime;
import java.util.ArrayList;

//myclass
public class DiagnosticCenter {
	
	    private static int cstart=1; 
	    private String centerId;

		private String centerName;
	    
	    public String getCenterId() {
			return centerId;
		}
	    
		public String getCenterName() {
			return centerName;
		}

		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}
		
		public ArrayList<Test> listOfTests=new ArrayList<>(); //for storing the list of tests
		public ArrayList<Appointment> appointmentList=new ArrayList<>();//for displaying appointment list
		
	    
	    public DiagnosticCenter(String centerName){
	    	//Test t=new Test(centerName);
	    	listOfTests.add(new Test("Blood Group"));
	        listOfTests.add(new Test("Blood Sugar"));
	        listOfTests.add(new Test("Blood Pressure"));
	        
	        this.centerName=centerName;
	        this.centerId=Integer.toString(cstart++);

	    }

		
	}


