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

## Gemini API Integration

To connect your application to the Gemini API:

1. **Obtain Gemini API Key:**
   - Sign up and get your API key from the Gemini developer portal.

2. **Configure API Key:**
   - Add your API key to `src/main/resources/application.properties`:
     ```properties
     gemini.api.key=YOUR_GEMINI_API_KEY
     gemini.api.url=https://generativelanguage.googleapis.com
     ```

3. **Usage in Code:**
   - Inject the API key and URL from properties in your service class.
   - Use these values to authenticate requests to the Gemini API.



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
