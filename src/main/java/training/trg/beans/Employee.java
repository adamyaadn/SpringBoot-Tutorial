package training.trg.beans;

import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private Department dept;
	private int salary;
	
	List<String> technologies;
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary
				+ ", technologies=" + technologies + "]";
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void beanCreate() {
		System.out.println("Bean " + empId + " created");
	}
	
	public void beanDestroy() {
		System.out.println("Bean " + empId + " destroyed");
	}
}
