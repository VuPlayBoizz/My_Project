# Mock Project

## Giới thiệu

Dự án này là một hệ thống microservices bao gồm các thành phần chính sau:

- **API Gateway**: Điều phối các request giữa client và các service backend.
- **Backend Service**: Xử lý logic nghiệp vụ chính của hệ thống.
- **Database Service**: Tương tác với cơ sở dữ liệu.
- **UI Service**: Giao diện người dùng ReactJS.
- **MongoDB**: Cơ sở dữ liệu NoSQL được sử dụng trong dự án.

## Cấu trúc dự án

```
Mock-Project/
├── api-gateway/       # API Gateway (Spring Boot)
├── backend-service/   # Backend Service (Spring Boot)
├── database-service/  # Database Service (Spring Boot)
├── ui-service/        # Frontend (ReactJS)
├── mongodb-data/      # Dữ liệu MongoDB
├── docker-compose.yml # File cấu hình Docker Compose
└── .env               # Cấu hình biến môi trường
```

## Yêu cầu hệ thống

Trước khi chạy dự án, bạn cần cài đặt:

- [Node.js](https://nodejs.org/) (cho UI Service)
- [Java 17](https://adoptopenjdk.net/) (cho các service backend)
- [Docker & Docker Compose](https://www.docker.com/) (nếu muốn chạy bằng container)

## Sử dụng Docker để chạy toàn bộ hệ thống

Nếu bạn muốn chạy toàn bộ hệ thống bằng Docker, hãy sử dụng lệnh:

```sh
docker-compose up --build
```

Dự án sẽ tự động khởi động các container cho API Gateway, Backend, Database Service, UI Service và MongoDB.

## Nếu bạn muốn chạy dự án trên local phải sửa các url ở phần api-gateway và ui-service

