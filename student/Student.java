package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		String SN = "Amu";
		System.out.println("Student Name is " + SN);
	}
	
	public void studentDept() {
		System.out.println("Student Department - ECE");
		}
	
	public void studentId()
	{
		int id = 2311;
		System.out.println("Student ID IS "+ id);
	}
	
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		s1.deptName();
		s1.studentName();
		s1.studentDept();
		s1.studentId();
	}
}
