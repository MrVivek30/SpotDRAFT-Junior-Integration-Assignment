package com.masai.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public void createRecord(AsanaTask task) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(airtableApiKey);

        HttpEntity<AsanaTask> requestEntity = new HttpEntity<>(task, headers);
        restTemplate.postForEntity(airtableApiUrl, requestEntity, String.class);
    }
}
