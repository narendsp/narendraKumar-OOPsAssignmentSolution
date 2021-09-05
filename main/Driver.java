package com.greatlearning.main;

import com.greatlearning.department.*;

public class Driver
{

	public static void main(String[] args)
	{

		AdminDepartment adm = new AdminDepartment();
		HrDepartment hr = new HrDepartment();	
		TechDepartment tech = new TechDepartment();	
		
		
		((AdminDepartment) adm).AdminDepartment();
		System.out.println("     ");
		((HrDepartment) hr).HrDepartment();
		System.out.println("     ");
		((TechDepartment) tech).TechDepartment();

	}

}
