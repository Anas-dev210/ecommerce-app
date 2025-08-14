# 🛒 Simple E-Commerce Store

A **3-tier application** running entirely with **Docker Compose**:

- **Frontend:** React (served via Nginx)
- **Backend:** Spring Boot REST API
- **Database:** PostgreSQL

---

## 📂 Project Structure

.
├── backend/ # Spring Boot REST API

├── frontend/ # React app served via Nginx

├── database/ # PostgreSQL

├── docker-compose.yml

└── README.md

---

## ⚙️ Prerequisites

Make sure you have:

- [Docker](https://docs.docker.com/get-docker/) installed  
- [Docker Compose](https://docs.docker.com/compose/install/) installed  
- At least **2GB RAM** free for containers

---

## 🔑 Configuration

🚀 Running Locally

Clone this repository

git clone https://github.com/Anas-dev210/ecommerce-app.git

cd ecommerce-app

Start the application

docker compose up --build

Access the app

Frontend → http://localhost:3000

Backend API → http://localhost:8080/api/products

PostgreSQL → localhost:5432

🗃 Accessing the Database

To open a psql shell inside the database container:

docker exec -it ecommerce_db psql -U myuser -d mydb

Example query:

SELECT * FROM products;

📡 API Endpoints

Method	Endpoint	Description

GET	/api/products	List all products


GET	/api/products/{id}	Get product by ID

POST	/api/products	Create a product

PUT	/api/products/{id}	Update a product

DELETE	/api/products/{id}	Delete a product

🛑 Stopping the Application

docker compose down

To remove volumes (clear database data):

docker compose down -v

🛠 Development Notes

Frontend is served by Nginx from the frontend/build directory

Backend is a Spring Boot JAR running on OpenJDK 17

PostgreSQL data persists in a local Docker volume
