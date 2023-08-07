package com.masai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.AsanaTask;
import com.masai.service.AsanaService;

@RestController
public class AsanaWebhookController {

 private final AsanaService asanaService;

 public AsanaWebhookController(AsanaService asanaService) {
     this.asanaService = asanaService;
 }

 @PostMapping("/asana/webhook")
 public ResponseEntity<String> handleAsanaWebhook(@RequestBody AsanaTask task) {
     asanaService.processWebhookPayload(task);
     return ResponseEntity.ok("Webhook payload received and processed.");
 }
}
