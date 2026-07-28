# 🛒 Gibi Wear & Orderflow - Sistema de E-commerce Geek

Este repositório contém a solução completa de um sistema de e-commerce voltado para o nicho geek e retrô (**Gibi Wear**), integrado a uma API REST robusta de gerenciamento de pedidos (**Orderflow**). O projeto contempla tanto o desenvolvimento do **Back-end** quanto do **Front-end**.

---

## 🛠️ Tecnologias Utilizadas

### Back-end (API)
* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco de dados em memória)
* **Maven**

### Front-end (Interface Web)
* **HTML5 & CSS3** (Design responsivo e estilização temática Pop Art / HQ)
* **JavaScript (ES6+)** (Consumo da API, carrinho de compras dinâmico, animações fluidas e fluxo de checkout)

---

## 🚀 Funcionalidades do Sistema

1. **Catálogo Interativo:** Exibição de camisetas com personagens clássicos (Snoopy, Scooby-Doo, Garfield, She-Ra, He-Man, etc.), opções dinâmicas de tamanhos (P, M, G, GG) e múltiplas cores.
2. **Banner Animado:** Personagens clássicos flutuando suavemente com efeitos visuais em camadas.
3. **Carrinho de Compras Completo:** Adição, remoção de itens, seleção de formas de pagamento (PIX, Cartão, Boleto) e cálculo de valores em tempo real.
4. **Integração com a API (Back-end):** Os pedidos finalizados no Front-end são enviados via requisições `POST` diretamente para os endpoints da API Spring Boot.

---

## 🔗 Endpoints da API (Back-end)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/pedidos` | Lista todos os pedidos cadastrados |
| **POST** | `/pedidos` | Cadastra um novo pedido enviado pela loja |

---

## 📂 Estrutura do Projeto

```text
com.quelen.orderflow/
├── controller/   # Endpoints HTTP da API
├── service/      # Regras de negócio
├── repository/   # Comunicação com o banco de dados (JPA)
└── model/        # Entidades do sistema

src/main/resources/static/
└── index.html    # Interface Front-end da Loja (Gibi Wear)
