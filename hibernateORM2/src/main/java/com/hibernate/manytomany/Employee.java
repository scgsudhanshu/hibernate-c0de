package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tbl_employee")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String employeeDept;
	
	@ManyToMany
	private List<Project> project;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", project=" + project + "]";
	}
	public Employee(int employeeId, String employeeName, String employeeDept, List<Project> project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
