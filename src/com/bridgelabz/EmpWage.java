package com.bridgelabz;

public class EmpWage {
	int IS_FULL_TIME = 2;
    int IS_PART_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	
	public void emp() {
	
double empCheck = Math.floor(Math.random()*10)%3;
 if(empCheck == IS_PART_TIME)
	 empHrs = 4;
 else if(empCheck==IS_FULL_TIME)
		 empHrs = 8;
	 else
		 empHrs = 0;
	 empWage = empHrs * EMP_RATE_PER_HOUR;
	 System.out.println("Emp Wage: "+empWage);
	 }
	public static void main(String[] args) {
		EmpWage em= new EmpWage();
		em.emp();
		
	}
}
