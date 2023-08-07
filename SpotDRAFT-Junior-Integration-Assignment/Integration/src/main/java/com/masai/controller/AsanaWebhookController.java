package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.AsanaTask;
import com.masai.service.AirtableService;

@RestController
public class AsanaWebhookController {

    private final AirtableService airtableService;

    @Autowired
    public AsanaWebhookController(AirtableService airtableService) {
        this.airtableService = airtableService;
    }

    @PostMapping("/asana-webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody String payload) {
        AsanaTask task = parseTask(payload);

        // Send the task data to Airtable
        airtableService.createRecord(task);

        return ResponseEntity.ok("Webhook received");
    }

    private AsanaTask parseTask(String payload) {
        // Implement parsing logic to extract task data from the payload
        // and create an AsanaTask object
        // For demonstration purposes, let's assume you parse the payload manually
        AsanaTask task = new AsanaTask();
        task.setTaskId("123");
        task.setName("Sample Task");
        task.setAssignee("Vivek Patel");
        task.setDueDate("2023-08-15");
        task.setDescription("This is a sample task description.");
        return task;
    }
}
