package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AsanaTask {

	  private String taskId;
	    private String name;
	    private String assignee;
	    private String dueDate;
	    private String description;


    // Getters and setters
}