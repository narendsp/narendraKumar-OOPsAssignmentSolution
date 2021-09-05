package com.greatlearning.department;
public class TechDepartment extends SuperDepartment
{

	
	public String departmentName(){
		return " Tech Department " ;
		
		
	}
	
	public String getTodaysWork(){
		return "Complete coding of module 1" ;
		
		
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD " ;
		
		
	}
	
	public String getTechStackInformation (){
		return " core Java " ;
		
		
	}
	
	
	public void TechDepartment()
	{
		TechDepartment name = new TechDepartment();
		System.out.println(" Welcome to " + name.departmentName());
		TechDepartment work = new TechDepartment();
        System.out.println( work.getTodaysWork());
        TechDepartment deadline =  new TechDepartment();
		System.out.println( deadline.getWorkDeadline());
		System.out.println(getTechStackInformation ());
		System.out.println(isTodayAHoliday());
		
	}
	
	
	
	
	
}
