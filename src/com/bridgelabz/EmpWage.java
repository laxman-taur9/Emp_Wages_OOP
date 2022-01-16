package com.bridgelabz;

public class EmpWage {
	public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;
	int empHrs = 0;
	int totalEmpHrs = 0;
	int totalWorkingDays=0;
	public void emp() {
	while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
		totalWorkingDays++;

int empCheck =(int) Math.floor(Math.random()*10)%3;
 switch(empCheck) {
 case IS_PART_TIME:
	 empHrs = 4;
	 break;
 case IS_FULL_TIME:	 
 empHrs = 8;
 break;
 default:
	 empHrs = 0;
 }	
		
	 totalEmpHrs = empHrs * EMP_RATE_PER_HOUR;
	 System.out.println("Day#: "+totalWorkingDays+"Emp Hrs:"+empHrs);
	}
	int totalEmpWage = totalEmpHrs* EMP_RATE_PER_HOUR;
	System.out.println("Total Emp Wage"+totalEmpWage);
	 }
	public static void main(String[] args) {
		EmpWage em= new EmpWage();
		em.emp();
		
	}
}
