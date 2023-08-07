package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.model.AsanaTask;

@Service
public class AsanaService {

 public void processWebhookPayload(AsanaTask task) {
     // Process Asana webhook payload and call AirtableService
 }
}
