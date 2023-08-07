# Integration between Asana and Airtable

This project provides a seamless integration between Asana and Airtable, allowing tasks created in Asana to be automatically copied to an Airtable table.

## Table of Contents

- [Project Overview](#project-overview)
- [Setup](#setup)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [Contact](#contact)

## Project Overview

This project aims to provide an integration solution between Asana and Airtable. The integration is designed to automatically copy tasks created in Asana to an Airtable table named "Asana Tasks." The copied tasks will be stored as new rows in the Airtable table, including the required columns: Task ID, Name, Assignee, Due Date, and Description.

## Setup

### Prerequisites

Before you begin, ensure you have:

- Java JDK 8 or later installed
- Spring Boot installed
- An Airtable account and API key
- An Asana account and personal access token

### Configuration

1. Clone the GitHub repository: [Repository Link](https://github.com/MrVivek30/SpotDRAFT-Junior-Integration-Assignment).
2. Open the project in your preferred Java IDE.

#### Configuration for Asana

1. Obtain your Asana personal access token from your Asana account settings.
2. Update `application.properties` with your Asana personal access token:
   ```properties
   asana.api.token=YOUR_ASANA_PERSONAL_ACCESS_TOKEN

### Contact


Email: vivekchaudhary538@gmail.com <br>
GitHub:https://github.com/MrVivek30
