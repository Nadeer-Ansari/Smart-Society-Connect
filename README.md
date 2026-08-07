# 🏢 Smart Society Connect

### Integrated Resident Engagement Platform

**Smart Society Connect** is a full-stack residential society management platform that centralizes day-to-day society operations through secure, role-based workflows for administrators, secretaries, residents, security personnel, and accountants.

> **Status:** Completed Full-Stack Academic Project  
> **Program:** PGCP-AC — Post Graduate Certificate Programme in Advanced Computing  
> **Team Size:** 5

---

## ✨ Key Features

- 🔐 JWT authentication and role-based authorization
- ✉️ Email OTP verification and administrator user approval
- 🏠 Resident, flat, family-member and document management
- 🚪 Visitor pre-approval, check-in and check-out workflows
- 📝 Complaint creation, tracking and resolution
- 💳 Billing, payment history, dues and Razorpay integration
- 📊 Role-specific dashboards
- 📅 Meeting scheduling, attendance and minutes
- 📢 Announcements and notifications
- 📂 Society and staff document management
- 📚 Swagger / OpenAPI documentation
- 🌗 Light and dark UI themes

---

## 👥 User Roles

| Role | Main Responsibilities |
|---|---|
| **ADMIN** | User approvals, society administration, residents, complaints, meetings and announcements |
| **SECRETARY** | Society operations, meetings, announcements and resident coordination |
| **RESIDENT** | Profile, visitors, complaints, bills, meetings and documents |
| **SECURITY** | Visitor approval workflow, check-in and check-out |
| **ACCOUNTANT** | Billing, payments, dues and financial dashboard |

---

## 🛠️ Technology Stack

**Frontend:** React.js, Vite, JavaScript, Tailwind CSS, Axios, React Router  
**Backend:** Java 17+, Spring Boot 3, Spring Security, Spring Data JPA, Hibernate, JWT, Maven  
**Database:** MySQL 8  
**Integrations:** Gmail SMTP / JavaMail, Razorpay  
**DevOps:** Git, GitHub, Docker, Nginx, Vercel/Netlify and cloud deployment

---

## 🏗️ System Architecture

```text
React + Vite Frontend
        │
        │ REST API / JSON
        ▼
Spring Security + JWT + OTP + CORS
        │
        ▼
Spring Boot Controllers
        │
        ▼
Business / Service Layer
        │
        ▼
Spring Data JPA / Repository Layer
        │
        ▼
MySQL 8
```

---

## 📦 Main Modules

1. **Authentication & User Management** — registration, OTP, login, JWT, profiles, roles and approvals.
2. **Resident & Flat Management** — residents, flats, ownership/tenant data, family members and documents.
3. **Visitor Management** — requests, approvals, check-in/check-out and security workflows.
4. **Complaint Management** — complaint creation, priority/category tracking, status updates and resolution.
5. **Billing & Payments** — bill generation, payment history, dues, payment status and Razorpay.
6. **Dashboard** — role-specific KPIs and operational summaries.
7. **Meeting Management** — meetings, scheduling, attendance and minutes.

Additional functionality includes announcements, notifications, society documents and staff documents.

---

## 📁 Repository Structure

```text
Smart-Society-Connect/
├── backend/
│   ├── src/
│   ├── database/
│   ├── pom.xml
│   ├── mvnw
│   └── mvnw.cmd
├── frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   ├── vite.config.js
│   ├── Dockerfile
│   └── nginx.conf
├── docs/
│   └── screenshots/
│       ├── White/
│       └── Black/
├── .gitignore
└── README.md
```

---

# 📸 Project Screenshots

The application supports both **Light (White)** and **Dark (Black)** themes.

## ☀️ Light / White Theme

<table>
<tr>
<td width="50%"><b>Accountant</b><br><img src="docs/screenshots/White/Accountant.png" alt="Accountant - White theme" width="100%"></td>
<td width="50%"><b>Admin</b><br><img src="docs/screenshots/White/Admin.png" alt="Admin - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Announcements</b><br><img src="docs/screenshots/White/Announcements.png" alt="Announcements - White theme" width="100%"></td>
<td width="50%"><b>Billing</b><br><img src="docs/screenshots/White/Billing.png" alt="Billing - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Complaint</b><br><img src="docs/screenshots/White/Complaint.png" alt="Complaint - White theme" width="100%"></td>
<td width="50%"><b>Documents</b><br><img src="docs/screenshots/White/Documents.png" alt="Documents - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Login</b><br><img src="docs/screenshots/White/Login.png" alt="Login - White theme" width="100%"></td>
<td width="50%"><b>Meetings</b><br><img src="docs/screenshots/White/Meetings.png" alt="Meetings - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>My Profile</b><br><img src="docs/screenshots/White/My%20Profile.png" alt="My Profile - White theme" width="100%"></td>
<td width="50%"><b>Registration</b><br><img src="docs/screenshots/White/Registration.png" alt="Registration - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Resident & Flats</b><br><img src="docs/screenshots/White/Resident%20&%20Flats.png" alt="Resident & Flats - White theme" width="100%"></td>
<td width="50%"><b>Residents</b><br><img src="docs/screenshots/White/Residents.png" alt="Residents - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Secretary</b><br><img src="docs/screenshots/White/Secretary.png" alt="Secretary - White theme" width="100%"></td>
<td width="50%"><b>Security Guard</b><br><img src="docs/screenshots/White/Security%20Guard.png" alt="Security Guard - White theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>User Approvals</b><br><img src="docs/screenshots/White/User%20Approvals.png" alt="User Approvals - White theme" width="100%"></td>
<td width="50%"><b>Visitors</b><br><img src="docs/screenshots/White/Visitors.png" alt="Visitors - White theme" width="100%"></td>
</tr>
</table>

## 🌙 Dark / Black Theme

<table>
<tr>
<td width="50%"><b>Accountant</b><br><img src="docs/screenshots/Black/Accountant.png" alt="Accountant - Black theme" width="100%"></td>
<td width="50%"><b>Admin</b><br><img src="docs/screenshots/Black/Admin.png" alt="Admin - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Announcement</b><br><img src="docs/screenshots/Black/Announcement.png" alt="Announcement - Black theme" width="100%"></td>
<td width="50%"><b>Billing</b><br><img src="docs/screenshots/Black/Billing.png" alt="Billing - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Complaints</b><br><img src="docs/screenshots/Black/Complaints.png" alt="Complaints - Black theme" width="100%"></td>
<td width="50%"><b>Documents</b><br><img src="docs/screenshots/Black/Documents.png" alt="Documents - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Login</b><br><img src="docs/screenshots/Black/Login.png" alt="Login - Black theme" width="100%"></td>
<td width="50%"><b>Meetings</b><br><img src="docs/screenshots/Black/Meetings.png" alt="Meetings - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>My Profile</b><br><img src="docs/screenshots/Black/My%20Profile.png" alt="My Profile - Black theme" width="100%"></td>
<td width="50%"><b>Registration</b><br><img src="docs/screenshots/Black/Registration.png" alt="Registration - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Resident & Flats</b><br><img src="docs/screenshots/Black/Resident%20&%20Flats.png" alt="Resident & Flats - Black theme" width="100%"></td>
<td width="50%"><b>Resident</b><br><img src="docs/screenshots/Black/Resident.png" alt="Resident - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>Secretary</b><br><img src="docs/screenshots/Black/Secretary.png" alt="Secretary - Black theme" width="100%"></td>
<td width="50%"><b>Security Guard</b><br><img src="docs/screenshots/Black/Security%20Guard.png" alt="Security Guard - Black theme" width="100%"></td>
</tr>
<tr>
<td width="50%"><b>User Approvals</b><br><img src="docs/screenshots/Black/User%20Approvals.png" alt="User Approvals - Black theme" width="100%"></td>
<td width="50%"><b>Visitors</b><br><img src="docs/screenshots/Black/Visitors.png" alt="Visitors - Black theme" width="100%"></td>
</tr>
</table>

---

## ⚙️ Environment Configuration

Deployment-sensitive values are supplied through environment variables:

```text
DB_URL
DB_USERNAME
DB_PASSWORD
APP_JWT_SECRET
APP_CORS_ALLOWED_ORIGINS
MAIL_HOST
MAIL_PORT
MAIL_USERNAME
MAIL_PASSWORD
RAZORPAY_KEY_ID
RAZORPAY_KEY_SECRET
RAZORPAY_WEBHOOK_SECRET
```

Use `frontend/.env.example` as the frontend configuration template.

> **Security:** Never commit real `.env` files, database passwords, Gmail app passwords, JWT secrets, Razorpay secrets or private keys.

---

## ▶️ Run Locally

### Prerequisites

Java 17+, Node.js/npm, MySQL 8 and Git.

### Backend

```bash
cd backend
```

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Backend: `http://localhost:8080`  
Swagger UI: `http://localhost:8080/swagger-ui.html`

### Frontend

```bash
cd frontend
npm install
npm run dev
```

Frontend: `http://localhost:5173`

---

## 🗄️ Database

Schema and migrations are stored under:

```text
backend/database/
```

Default local database:

```text
smart_society_connect_db
```

Configure database credentials using environment variables before starting the backend.

---

## 🔒 Security

- BCrypt password hashing
- JWT authentication
- OTP email verification
- Role-based authorization
- Administrator user approval
- CORS configuration
- Protected REST endpoints
- Environment-based secret management

---

## 🐳 Deployment Roadmap

```text
GitHub
   ↓
Docker / Containerization
   ↓
Cloud MySQL Database
   ↓
Spring Boot Backend Deployment
   ↓
React Frontend Deployment
   ↓
Production CORS + API Configuration
   ↓
Live Demo Testing
```

---

## 👨‍💻 Project Team

**Team Leader:** Nadeer Ansari

**Team Members**
- Nadeer Ansari
- Riddhi Shinde
- Pratiksha
- Nikhil
- *Add the fifth team member's exact name*

---

## 🎓 Academic Project

Developed as part of the **PGCP-AC (Post Graduate Certificate Programme in Advanced Computing)** academic project.

Smart Society Connect aims to provide a centralized, secure and user-friendly digital platform for residential society operations and communication.

---

## 📌 Project Status

✅ Backend implemented  
✅ Frontend implemented  
✅ Role-based workflows integrated  
✅ Database schema available  
✅ Payment integration implemented  
🔄 GitHub, Docker and cloud deployment preparation in progress

---

## 📄 License

This repository is intended primarily for educational, academic and demonstration purposes.

---

## ⭐ Smart Society Connect

If you find the project useful, consider starring the repository.
