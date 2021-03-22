package com.jspiders.libs;

//Bean
class Employee extends Object
{
	private int    empno;
	private String ename;
	private double sal;
	private String job;

	public Employee() 
	{

	}

	public Employee(int empno, String ename, double sal, String job) 
	{
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public int hashCode() 
	{
		return empno;
	}
	
	@Override
	public String toString() 
	{
	  return "Name : "+ename+" Empno : "+empno+" Job : "+job;	
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.hashCode() == obj.hashCode();
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
       Employee e1 = new Employee();
       e1.setEmpno(200);
       e1.setEname("Smith");
       
       Employee e2 = new Employee();
       e2.setEmpno(200);
       e2.setEname("Smith");
      
       int h1 = e1.hashCode();
       System.out.println(h1);
       
       System.out.println(e1);
       System.out.println(e2);
       
       boolean b1 = e1.equals(e2);
       System.out.println(b1);
	}
}














