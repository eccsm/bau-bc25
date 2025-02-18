# Bootcamp: Financial & Insurance Business Projects Simulation

**Duration:** 1 Hour

## Agenda
- **5 Minutes:** Introduction & Overview
- **10 Minutes:** Design Patterns Overview
    - Singleton Pattern (`SagaConfig`)
    - Strategy Pattern (Payment Strategies)
    - Saga Pattern (Distributed Transaction Management)
- **15 Minutes:** Code Walkthrough
    - Detailed explanation of the provided code sample
    - Discussion on error handling, logging, and compensation mechanisms
- **20 Minutes:** Hands-On Exercise
    - Modify the simulation to integrate a new payment method
    - Explore compensation mechanisms and discuss different strategies
- **10 Minutes:** Q&A & Wrap-Up

## Prerequisites & Installations
Before the session, please ensure you have the following installed:

1. **Git:**
    - [Download Git](https://git-scm.com/downloads)
    - Verify installation:
      ```bash
      git --version
      ```

2. **Java Development Kit (JDK):**
    - Install JDK 11 or later (available from [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/))
    - Verify installation:
      ```bash
      java -version
      ```

3. **IDE (Integrated Development Environment):**
    - Recommended: IntelliJ IDEA, Eclipse, or Visual Studio Code
    - Ensure your IDE is configured for Java development

4. **GitHub Account:**
    - Create an account at [GitHub](https://github.com/) if you don’t have one
    - We will share the project repository during the session

## During the Session
- **Clone the Repository:**  
  You will receive a GitHub repository URL. Clone the project using:
  ```bash
  git clone https://github.com/eccsm/bau-bc25
  ```
- **Open the Project:**

    Import the project into your IDE (as a Maven/Gradle project if needed) and ensure it compiles.

- **Run the Application:**

  Locate and run the OrderSaga main class in the com.ndbs.service package to observe the saga simulation.

## Additional Resources
- Java Design Patterns (Singleton, Strategy, Saga)
- Distributed Transactions and Compensation Mechanisms
- Advanced Logging Frameworks (e.g., SLF4J, Logback)
