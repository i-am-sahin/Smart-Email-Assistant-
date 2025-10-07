# Email Writer

A Spring Boot application that generates email content with customizable tone using AI (Gemini API).

## Features

- Generate email content based on user input
- Select tone (e.g., professional, friendly)
- REST API endpoints for integration

## Technologies

- Java
- Spring Boot
- Maven
- Jackson (for JSON processing)
- Lombok

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Setup

1. Clone the repository:
   ```
   git clone <your-repo-url>
   cd email-writer
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

### API Usage

#### Generate Email

- **Endpoint:** `/generate-email`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "emailContent": "Your message here",
    "tone": "professional"
  }
  ```
- **Response:** Generated email text

## Project Structure

- `src/main/java/com/sahin/email_writer/`
  - `EmailGeneratorController.java` - REST controller
  - `EmailGeneratorService.java` - Business logic
  - `EmailRequest.java` - Request model
  - `EmailWriterApplication.java` - Main class




