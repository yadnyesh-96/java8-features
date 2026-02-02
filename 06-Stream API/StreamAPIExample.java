
/*
Example: WAP to create a collection and store 5 employee data in it and fetch employee data whose salary is greater than 10000.
*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee{
	private int id;
	private int sal;
	private String name;
	
	public Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setSal(int sal){
		this.sal=sal;
	}
	
	public int getSal(){
		return sal;
	}
}


public class StreamAPIExample{
	public static void main(String x[]){
		
		Employee e1=new Employee(11,"ABC",15000);
		Employee e2=new Employee(15,"PQR",18000);
		Employee e3=new Employee(12,"EWS",9800);
		Employee e4=new Employee(13,"MNO",17500);
		Employee e5=new Employee(14,"SUV",14920);
		
		List<Employee> ls =List.of(e1,e2,e3,e4,e5);
		Stream<Employee> s1 = ls.stream();
		Predicate<Employee> p = new Predicate<Employee>(){
			public boolean test(Employee v){
				return v.getSal()>10000;
			}
		};
		Stream<Employee> s2 = s1.filter(p);
		s2.forEach((e)->System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()));
		
	}
}