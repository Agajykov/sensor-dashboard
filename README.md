Sensor Dashboard

A full-stack web application for managing sensor data.

Backend: Java + JAX-RS (Jersey) + MySQL

Frontend: React.js

The application allows you to:

  Import sensor data from CSV into a MySQL database.
  
  Serve sensor data via a RESTful API.
  
  View sensor data in a React web interface.


Table of Contents

  Features
  
  Project Structure
  
  Backend Setup
  
  Database Setup
  
  Frontend Setup
  
  API Endpoints
  
  Usage
  
  CORS Configuration

Features

  CSV import for sensor data.
  
  REST API to fetch all sensors.
  
  React frontend to display sensor data in a table.
  
  Handles duplicate CSV entries.
  
  Supports modern Java date/time (LocalDateTime) with Jackson.
  
  Configured CORS to allow frontend-backend communication.
  
Project Structure
  <img width="297" height="428" alt="image" src="https://github.com/user-attachments/assets/1fa06c32-3124-4545-8b39-8a7c25e716c8" />

Backend Setup

  Install Java 17+ and Maven.
  
  Navigate to backend/ and build the WAR file:
  
    mvn clean package
    
  Deploy the generated WAR to Apache Tomcat (e.g., webapps/ folder).
  
  Configure MySQL database and update DatabaseUtil.java with credentials.

Database Setup
  Create the sensors database:
    CREATE DATABASE sensors;
    USE sensors;
  Create the sensor table:
    CREATE TABLE sensor (
      id BIGINT AUTO_INCREMENT PRIMARY KEY,
      sensor_id BIGINT NOT NULL,
      timestamp DATETIME NOT NULL,
      leitfaehigkeit DOUBLE,
      systemdruck DOUBLE,
      frequenz_inv2 DOUBLE,
      frequenz_inv3 DOUBLE,
      voltage_drv2 DOUBLE,
      voltage_drv3 DOUBLE,
      water_today_in DOUBLE,
      water_today_pro DOUBLE,
      water_total_in DOUBLE,
      water_total_pro DOUBLE,
      temp_drv2 DOUBLE,
      temp_drv3 DOUBLE,
      valves_flush TINYINT(1),
      valves_cip TINYINT(1),
      machine_id INT
    );
Verify table structure:
  DESCRIBE sensor;

Notes

  Make sure backend and frontend run on different ports (8080 and 3000) and that CORS is properly configured.
  
  Use sensor.id as the React table key to avoid duplicate key warnings.
  
  CSV files should match the database schema.

  for sensor-frontend project and its installation visit: 
    https://github.com/Hassan-Mroue/sensor-dashboard.git
