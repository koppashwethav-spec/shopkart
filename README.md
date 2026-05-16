# 🛒 ShopKart - E-Commerce Web Application

> A production-ready **Flipkart-style e-commerce platform** with a powerful admin dashboard, built with modern tech stack.

[![Live Demo](https://img.shields.io/badge/Live%20Demo-View%20Here-blue?style=for-the-badge)](https://shopkart-etg6.onrender.com)
[![GitHub Stars](https://img.shields.io/github/stars/koppashwethav-spec/shopkart?style=for-the-badge)](https://github.com/koppashwethav-spec/shopkart/stargazers)
[![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-green?style=flat-square)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-blue?style=flat-square)](https://www.postgresql.org/)

---

## ✨ Key Features

### 🛍️ **Customer Experience**
- 🏠 Interactive **homepage with hero slider** and flash deals
- 🔍 **Advanced product search** with real-time filters (category, price, rating, brands)
- 📄 **Detailed product pages** with customer reviews, ratings, and similar products
- 🛒 **Smart shopping cart** with persistent storage
- 💳 **Multi-payment checkout** system with order confirmation
- ⭐ **Review & rating system** for products
- 📱 **Fully responsive design** (mobile, tablet, desktop)

### 👨‍💼 **Admin Dashboard**
- 📊 **Analytics & Charts** - Sales trends, revenue insights, order statistics
- 📦 **Product Management** - Add, edit, delete, and manage inventory
- 📋 **Order Management** - Track orders, update statuses, manage deliveries
- 👥 **User Management** - Monitor registered users and customer accounts
- 📈 **Real-time Insights** - Dashboard with key metrics and KPIs

### 🔐 **Security & Authentication**
- User registration and secure login
- Role-based access control (Admin/User)
- Password encryption and session management

---

## 🏗️ Architecture

```
┌─────────────────────────────────────────────┐
│         Frontend (HTML/CSS/JavaScript)      │
│  - Responsive UI, Real-time Interactions    │
└──────────────────┬──────────────────────────┘
                   │ HTTP/REST API
┌──────────────────▼──────────────────────────┐
│     Spring Boot Backend (Java 17)           │
│  - RESTful APIs, Business Logic             │
│  - Spring Security, JPA/Hibernate ORM       │
└──────────────────┬──────────────────────────┘
                   │ JDBC
┌──────────────────▼──────────────────────────┐
│    PostgreSQL Database                      │
│  - Relational Data, ACID Compliance         │
└─────────────────────────────────────────────┘
```

---

## 🛠️ Tech Stack

| Layer | Technology | Purpose |
|-------|-----------|---------|
| **Backend** | Spring Boot 3.5 | Web framework & REST APIs |
| **Language** | Java 17 | Backend development |
| **Database** | PostgreSQL | Data persistence |
| **ORM** | Spring Data JPA + Hibernate | Database abstraction |
| **Frontend** | HTML5/CSS3/JavaScript | User interface |
| **Deployment** | Render.com + Docker | Cloud hosting |
| **API Documentation** | RESTful design | API standards |

---

## 🚀 API Endpoints

### Products
```
GET    /api/products              # Get all products with filters
POST   /api/products              # Add new product (Admin)
GET    /api/products/{id}         # Get product details
PUT    /api/products/{id}         # Update product (Admin)
DELETE /api/products/{id}         # Delete product (Admin)
```

### Orders
```
GET    /api/orders                # Get user's orders
POST   /api/orders                # Place new order
GET    /api/orders/{id}           # Get order details
PUT    /api/orders/{id}/status    # Update order status (Admin)
```

### Users & Auth
```
POST   /api/users/register        # User registration
POST   /api/users/login           # User login
GET    /api/users/profile         # Get user profile
PUT    /api/users/profile         # Update profile
```

### Reviews
```
POST   /api/reviews               # Add product review
GET    /api/products/{id}/reviews # Get product reviews
DELETE /api/reviews/{id}          # Delete review (Admin)
```

---

## 🎯 Quick Start

### Prerequisites
- Java 17+
- Maven 3.6+
- PostgreSQL 12+
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/koppashwethav-spec/shopkart.git
   cd shopkart
   ```

2. **Configure database** (Create `.env` or update `application.properties`)
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/shopkart
   spring.datasource.username=your_db_user
   spring.datasource.password=your_db_password
   ```

3. **Build and run**
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

4. **Access the application**
   - Frontend: http://localhost:8081
   - Admin Panel: http://localhost:8081/admin

---

## 📊 Project Statistics

- ✅ **Full-Stack Application** - Frontend & Backend
- 📦 **10+ API Endpoints** - RESTful design
- 💾 **PostgreSQL Database** - Production-ready
- 🎨 **Responsive UI** - Mobile-first design
- 🔒 **Authentication & Authorization** - Secure access
- 📈 **Admin Analytics** - Business insights
- 🌐 **Live Deployment** - Production-ready

---

## 🖼️ Screenshots & Features

### User Features
- ✅ Browse products with advanced filtering
- ✅ Add/remove items from cart
- ✅ Secure checkout process
- ✅ Order tracking and history
- ✅ Product reviews and ratings
- ✅ User profile management

### Admin Features
- ✅ Dashboard with analytics
- ✅ Inventory management
- ✅ Order management & tracking
- ✅ Customer insights
- ✅ Sales reports

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

### Ideas to Contribute
- Add payment gateway integration (Stripe, PayPal)
- Implement wishlist feature
- Add email notifications
- Improve UI/UX design
- Add more filters and sorting options
- Performance optimizations

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Shwetha V Koppa**
- 🔗 GitHub: [@koppashwethav-spec](https://github.com/koppashwethav-spec)
- 💼 LinkedIn: [Your LinkedIn Profile]
- 📧 Email: [Your Email]

---

## ⭐ Show Your Support

If you found this project helpful, please consider:
- ⭐ **Star this repository** to show your support
- 🔄 **Fork and contribute** with improvements
- 💬 **Share feedback** in issues and discussions
- 📢 **Share** this project with your network

---

## 📞 Support & Feedback

Have questions or suggestions? Feel free to:
- 📝 Open an [Issue](https://github.com/koppashwethav-spec/shopkart/issues)
- 💬 Start a [Discussion](https://github.com/koppashwethav-spec/shopkart/discussions)
- 📧 Contact me directly

---

<div align="center">

Made with ❤️ by [Shwetha V Koppa](https://github.com/koppashwethav-spec)

**[⬆ back to top](#shopkart---e-commerce-web-application)**

</div>
