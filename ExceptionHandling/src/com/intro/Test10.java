package com.intro;

import java.util.ArrayList;
import java.util.List;



class StudentNotFoundException extends Exception{
	private String message;
	public StudentNotFoundException(String msg) {
		this.message = msg;
	}
	public String getMessage(){
		return this.message;
	}
}

class Student{
	private int studentId;
	private String studentName;
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
}
class DB{
	 static List<Student> students = new ArrayList<>();
	 static{
		 students.add(new Student(101,"Ankit"));
		 students.add(new Student(102,"Yogesh"));
		 students.add(new Student(103,"Harsh"));
		 students.add(new Student(104,"Rahul"));
		 students.add(new Student(105,"Anup"));
		 students.add(new Student(106,"Vivek"));
		 students.add(new Student(107,"Vishal"));
	 }
	  
	 public static List<Student> getStudents(){
		 return students;
	 }
	 
	 public static Student getById(int id){
		 Student studentObj=null;
		 for(Student student:students){
			 if(student.getStudentId()==id){
				 studentObj =  student;
			 }
		 }
		 return studentObj;
	 }
	 
	 
}

public class Test10 {
    public static void getStudentData(int id){
    	boolean flag = false;
    	for(Student student:DB.getStudents()){
    		if(student.getStudentId()==id){
    			flag=true;
    			break;
    		}
    	}
    	if(flag){
    		System.out.println(DB.getById(id));
    	}else{
    		try {
				throw new StudentNotFoundException("Id doesn't match");
			} catch (StudentNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
    	}
    	
    }
	public static void main(String[] args) {
		getStudentData(105);

	}

}
