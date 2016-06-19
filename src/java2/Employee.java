package java2;
import java.io.*;
public class Employee {
	
String name;
int age;
String Designation;
int Salary;
 public Employee(String name){
	 this.name=name;
 }
public void empage(int empage){
	age=empage;
}
 
public void empdesig(String empdesig){
	Designation=empdesig;
}
 public void empsalary(int empsalary ){
	 Salary=empsalary;
 }
 public void printEmployee(){
	 System.out.println("Employee Name is:" +name);
	 System.out.println("Employee age is:" +age);
	 System.out.println("Employee Designation is:" +Designation);
	 System.out.println("Employee Salary is:" +Salary);
	 System.out.println("Employee Name is: Khan and he is not a terrorist");
	 
	 
 }
}
