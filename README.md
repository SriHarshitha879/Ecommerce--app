# E-Commerce Application

A full-stack e-commerce application with Spring Boot backend and modern frontend.

## 📁 Project Structure

```
ecommerce-app/
├── backend/          # Spring Boot API
├── frontend/         # Frontend application
└── README.md
```

## 🛠 Tech Stack

**Backend:** Java 21, Spring Boot, Spring Data JPA, MySQL  
**Frontend:** React

## ✅ Prerequisites

- Java JDK 21
- Node.js 22.20.0
- MySQL 8.0.43
- Maven 4.0.0

## 🚀 Quick Start

### Backend
```bash
cd backend

# Configure database in src/main/resources/application.properties
# spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
# spring.datasource.username=your_username
# spring.datasource.password=your_password

# Run
./mvnw spring-boot:run
```

Backend runs on **http://localhost:8080**

### Frontend
```bash
cd frontend

# Install dependencies
npm install

# Create .env file
echo "REACT_APP_API_URL=http://localhost:8080/api" > .env

# Run
npm start
```

Frontend runs on **http://localhost:3000**

## 📚 API Endpoints


**Products**
- `GET /api/products` - Get all products
- `GET /api/products/search?query={query}` - Search products
- `POST /api/product` - Create product 
- `PUT /api/product` - Update the product
- `Delete /api/product`- Delete the product



## ✨ Features

- 🛍️ Product catalog with search
- 📱 Responsive design

## 🐛 Troubleshooting

**Backend won't start?**
- Check if port 8080 is free
- Verify database is running and credentials are correct

**Frontend won't start?**
- Run `rm -rf node_modules && npm install`
- Check if port 3000 is available

## 👤 Author

**SriHarshitha879** - [@SriHarshitha879](https://github.com/SriHarshitha879)

---

⭐ Star this repo if you find it helpful!
