# 📦 Orderflow - API REST de Gerenciamento de Pedidos

O **Orderflow** é uma API REST desenvolvida em **Java 21** e **Spring Boot** para gerenciamento e controle de fluxo de pedidos, organizada na arquitetura em camadas (Model, Repository, Service e Controller).

---

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (Banco de dados em memória)
- **Maven**

---

## 📌 Endpoints da API

| Método | Endpoint  | Descrição                    |
|--------|-----------|------------------------------|
| `GET`  | `/pedidos`| Lista todos os pedidos       |
| `POST` | `/pedidos`| Cadastra um novo pedido      |

---

## 📋 Estrutura do Projeto
```text
com.quelen.orderflow/
├── controller/   # Endpoints HTTP da API
├── service/      # Regras de negócio
├── repository/   # Comunicação com o banco de dados (JPA)
└── model/        # Entidades do sistema
