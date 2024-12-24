# generative-ai-java-spring

A quick-start project demonstrating how to integrate Generative AI capabilities into Java applications using the Spring AI framework. Includes examples for OpenAI's chat and image generation APIs, showcasing real-world applications of Generative AI in Java.

## Getting Started

### Prerequisites
- **JDK 17+** installed
- An IDE (e.g., IntelliJ, Eclipse, or VS Code)
- OpenAI API Key (You can get one by signing up at [OpenAI](https://openai.com))

### Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/generative-ai-java-spring.git
   cd generative-ai-java-spring
   ```

2. Open the project in your IDE.

3. Configure the OpenAI API key:
    - Set the API key as an environment variable:
      ```bash
      export OPENAI_API_KEY=your_openai_api_key
      ```
    - Alternatively, set the key in `application.properties`:
      ```properties
      spring.ai.openai.api-key=your_openai_api_key
      ```

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## Features

- Integrates Generative AI into Java applications using the Spring AI framework.
- Demonstrates OpenAI API usage for:
    - **Image Generation**
    - **Chat Model Interaction**
- Simple configuration of OpenAI API keys for secure access.
- Example applications showcasing real-world use cases of Generative AI.

---

## Endpoints

### 1. Image Generation
Generate images using OpenAI's DALL-E model.

- **Endpoint**: `/imagegen`
- **Method**: `GET`
- **Request Body**:
  ```json
  {
    "prompt": "A futuristic cityscape with flying cars"
  }
  ```
- **Response**: Redirects to the generated image's URL.

### 2. Chat Model
Interact with OpenAI's chat model.

- **Endpoint**: `/chatgen`
- **Method**: `GET`
- **Request Body**:
  ```json
  {
    "prompt": "Explain the basics of Generative AI"
  }
  ```
- **Response**: Returns the AI-generated response.

---

## Technologies Used

- **Spring Boot** 3.3.x
- **Java** 17
- **Maven**/Gradle (build tools)
- **OpenAI API** (DALL-E for image generation, GPT for chat model)

---

## Project Structure

```plaintext
src/main/java/com/shashi/learn/
├── controller/
│   ├── GenAIImageModelController.java
│   └── GenAIChatController.java
├── request/
│   ├── ImageGenRequest.java
│   └── ChatGenRequest.java
└── GenAiSpringOpenAIApplication.java
```

---

## How It Works

### Key Concepts

- **Models**: Algorithms used to generate images and chat responses.
- **Prompts**: Text inputs guiding the AI model.
- **Prompt Templates**: Templates for creating effective prompts with user inputs.
- **Embeddings**: Represent text as numeric data for processing by AI models.
- **Tokens**: Units of text processed by the AI model.

---
