package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_project")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectId;
	private String projectName;
	
	@ManyToMany
	private List<Employee> employee;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Project(int projectId, String projectName, List<Employee> employee) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employee=" + employee + "]";
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
}
