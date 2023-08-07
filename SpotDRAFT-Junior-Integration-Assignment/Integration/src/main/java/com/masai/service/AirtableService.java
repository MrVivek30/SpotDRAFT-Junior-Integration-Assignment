package com.masai.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masai.exception.AirtableIntegrationException;
import com.masai.model.AsanaTask;

@Service
public class AirtableService {

 private final RestTemplate restTemplate;
 private final String airtableApiUrl;
 private final String airtableApiKey;

 public AirtableService(RestTemplate restTemplate,
                        @Value("${airtable.api.url}") String airtableApiUrl,
                        @Value("${airtable.api.key}") String airtableApiKey) {
     this.restTemplate = restTemplate;
     this.airtableApiUrl = airtableApiUrl;
     this.airtableApiKey = airtableApiKey;
 }

 public void createRecordInAirtable(AsanaTask task) {
     try {
         // Build Airtable record and make API call using restTemplate
     } catch (Exception e) {
         throw new AirtableIntegrationException("Error creating record in Airtable");
     }
 }
}
