package com.amazon.v2.arrays;

public class TestCase {
	private String taskName;
	private String taskStatus;

	TestCase(String s1, String s2) {
		this.setTaskName(s1);
		this.setTaskStatus(s2);
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
}
