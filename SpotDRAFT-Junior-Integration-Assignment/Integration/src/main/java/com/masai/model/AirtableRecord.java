package com.masai.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirtableRecord {

    private Map<String, Object> fields;

    // Getters and setters
}