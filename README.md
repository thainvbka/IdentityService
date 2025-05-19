# 🛡️ Identity Service

Dự án backend RESTful cung cấp dịch vụ xác thực và phân quyền người dùng, được xây dựng bằng Java và Spring Boot.

## 🚀 Tính năng chính

- Đăng ký / Đăng nhập người dùng
- Phân quyền truy cập dựa trên vai trò (role-based access control)
- Xác thực bằng JWT (JSON Web Token)
- Quản lý và cập nhật thông tin người dùng (CRUD)
- Bảo vệ API bằng Spring Security

## 🔗 Các API chính

### 🔐 Authentication

| Method | Endpoint         | Mô tả                                       |
|--------|------------------|---------------------------------------------|
| POST   | /auth/token      | Xác thực thông tin đăng nhập, trả về JWT    |
| POST   | /auth/introspect | Kiểm tra và giải mã token, trả về thông tin |

### 👤 User Management

| Method | Endpoint           | Mô tả                                |
|--------|--------------------|--------------------------------------|
| POST   | /users             | Tạo người dùng mới                   |
| GET    | /users             | Lấy danh sách toàn bộ người dùng     |
| GET    | /users/{userId}    | Lấy thông tin người dùng cụ thể      |
| PUT    | /users/{userId}    | Cập nhật thông tin người dùng        |
| DELETE | /users/{userId}    | Xoá người dùng                       |



