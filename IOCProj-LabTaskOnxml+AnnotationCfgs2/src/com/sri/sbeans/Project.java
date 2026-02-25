package com.sri.sbeans;

public class Project {

	private String projectId;
	private String projectName;
	
	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}
	
	public String showProjectDetails() {
		return "project id: "+projectId+", project name:";
	}
}
