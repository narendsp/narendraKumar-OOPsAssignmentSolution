package com.greatlearning.department;
public class AdminDepartment extends SuperDepartment
{
	

	 public String departmentName(){
		return "Admin Department" ;
		
		
	}
	
	public String getTodaysWork(){
		return "Complete your documents Submission" ;
		
		
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD " ;
		
		
	}


	public void AdminDepartment()
	{
		AdminDepartment name = new AdminDepartment();
		System.out.println(" Welcome to " + name.departmentName());
        AdminDepartment work = new AdminDepartment();
        System.out.println( work.getTodaysWork());
		AdminDepartment deadline =  new AdminDepartment();
		System.out.println( deadline.getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}
		
	
	
	
	}
