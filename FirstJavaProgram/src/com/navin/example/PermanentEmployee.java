package com.navin.example;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void calculateSalary()
	{
		double variableComp;
		if(experience<3)
		{
			variableComp=0*basicPay;
		}
		else if(experience>=3 && experience<5)
		{
			variableComp=(5/100.0)*basicPay;
		}
		else if(experience>=5 && experience<10)
		{
			variableComp=(7/100.0)*basicPay;
		}
		else
		{
			variableComp=(12/100.0)*basicPay;
		}
		double salary= variableComp+basicPay+hra;
		System.out.println("Permanent Employee: "+salary);
		
		
	}

}
