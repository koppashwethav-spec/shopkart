# 🛒 ShopKart - E-Commerce Web Application

A full-stack Flipkart-style e-commerce platform built with **Spring Boot**, **PostgreSQL**, and **HTML/CSS/JS**.

🔗 **Live Demo:** https://shopkart-etg6.onrender.com

---

## 📸 Features

- 🏠 Homepage with hero slider, flash deals, and product grid
- 🔍 Advanced search with filters (category, price, rating)
- 🛍️ Product detail page with reviews and similar products
- 🛒 Shopping cart with sidebar
- 💳 Checkout with payment options
- 👤 User registration and login
- 👨‍💼 Admin dashboard with charts, product and order management
- 📱 Fully responsive mobile design

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Spring Boot 3.5, Java 17 |
| Database | PostgreSQL (Render) |
| Frontend | HTML, CSS, JavaScript |
| ORM | Spring Data JPA / Hibernate |
| Deployment | Render.com (Docker) |

---

## 🚀 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | Get all products |
| POST | /api/products | Add new product |
| GET | /api/products/{id} | Get product by ID |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |
| GET | /api/orders | Get all orders |
| POST | /api/orders | Place new order |
| POST | /api/users/register | Register user |
| POST | /api/users/login | Login user |
| POST | /api/reviews | Add review |

---

## 🏃 Run Locally

```bash
git clone https://github.com/koppashwethav-spec/shopkart.git
cd shopkart
.\mvnw.cmd spring-boot:run
```

Open browser: `http://localhost:8081`

---

## 👩‍💻 Developer

**Shwetha V Koppa**
- GitHub: [@koppashwethav-spec](https://github.com/koppashwethav-spec)
