-----

### **Simple Employee Management System**

A full-stack mini-project to manage employee records, built using Java with Spring Boot for the backend and plain HTML, CSS, and JavaScript for the frontend.

### **Project Description**

This application provides a basic interface for performing **CRUD** (Create, Read, Update, Delete) operations on employee data. The project is designed to be beginner-friendly, demonstrating how to connect a Java backend API to a static HTML frontend. It uses an in-memory list to store data, keeping the setup simple without requiring a database.

### **Features**

  * **View Employees:** Displays a table of all existing employees with their name, department, and salary.
  * **Add New Employee:** A simple form to add new employee records to the system.
  * **Delete Employee:** A "Delete" button next to each employee record to remove it from the list.
  * **Edit Employee:** A basic placeholder for future functionality to update employee details.

### **Technologies Used**

  * **Backend:**
      * **Java**: The core programming language.
      * **Spring Boot**: Used to quickly set up a RESTful API.
      * **RESTful API**: Handles all data operations (GET, POST, DELETE).
  * **Frontend:**
      * **HTML5**: Provides the structure of the web page.
      * **CSS3**: Styles the user interface for a clean and readable layout.
      * **JavaScript (ES6+)**: Handles all frontend logic, including making asynchronous API calls to the backend and dynamically updating the page content.

-----

### **How to Run the Project**

Follow these simple steps to get the application running on your local machine.

#### **Prerequisites**

  * **Java Development Kit (JDK) 8 or higher**
  * **Apache Maven or Gradle** (to manage dependencies for the Spring Boot project)
  * **Git** (to clone the repository)

#### **1. Clone the Repository**

First, clone the project from GitHub to your local machine using the command line:

```bash
git clone https://github.com/your-username/employee-management-system.git
```

#### **2. Run the Backend**

1.  Navigate into the project directory: `cd employee-management-system`.

2.  Run the Spring Boot application using your IDE (e.g., IntelliJ, Eclipse) by finding and running the main application class. Alternatively, use Maven from the command line:

    ```bash
    mvn spring-boot:run
    ```

The backend server will start on `http://localhost:8080`.

#### **3. Run the Frontend**

1.  Open the `index.html` file located in `src/main/resources/static/` in your favorite web browser.
2.  The frontend page will automatically load and begin communicating with the backend API.

You can now use the application to manage employee records.
