package com.greatlearning.department;
public class HrDepartment extends SuperDepartment
{
    String HR;
    
	public String departmentName(){
		return "Hr Department" ;
		
		
	}
	
	public String getTodaysWork(){
		return "Fill today’s worksheet and mark your attendance" ;
		
		
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD  " ;
		
		
	}
	
	public String doActivity (){
		return "team Lunch " ;
		
		
	}
	
	public void HrDepartment()
	{
		HrDepartment name = new HrDepartment();
		System.out.println(" Welcome to " + name.departmentName());
		System.out.println(doActivity ());
		HrDepartment work = new HrDepartment();
        System.out.println( work.getTodaysWork());
        HrDepartment deadline =  new HrDepartment();
		System.out.println( deadline.getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}
	
	
}
