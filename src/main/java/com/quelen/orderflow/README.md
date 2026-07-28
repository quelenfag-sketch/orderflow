# 🛒 Gibi Wear & Orderflow - Sistema de E-commerce Geek & Retrô

Este repositório contém a solução completa de um sistema de e-commerce voltado para o nicho geek e retrô (**Gibi Wear**), integrado a uma API REST robusta de gerenciamento de pedidos (**Orderflow**). O projeto contempla o desenvolvimento completo do Back-end e do Front-end.

---

## 🛠️ Tecnologias Utilizadas

### Back-end (API)
* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco de dados em memória)
* **Maven**

### Front-end (Interface Web)
* **HTML5 & CSS3** (Design responsivo, estilização temática Pop Art / HQ e fontes customizadas)
* **JavaScript (ES6+)** (Consumo da API, carrinho de compras dinâmico, animações fluidas e fluxo completo de checkout)
* **API ViaCEP** (Autocompletar endereço em tempo real)
* **QRCode.js** (Geração de QR Code dinâmico e real para pagamentos via PIX)

---

## 🚀 Funcionalidades do Sistema

* **Catálogo Interativo:** Exibição de camisetas com personagens clássicos (Snoopy, Scooby-Doo, Garfield, Cavalo de Fogo, She-Ra, Pantera Cor de Rosa, He-Man e Caverna do Dragão), opções dinâmicas de tamanhos (`P`, `M`, `G`, `GG`) e múltiplas opções de cores.
* **Banner Animado Interativo:** Personagens flutuando suavemente em camadas com efeitos visuais e responsivos.
* **Carrinho de Compras Dinâmico:** 
  * Adição e remoção de itens com cálculo de total em tempo real.
  * Validação de **Cupons de Desconto**.
  * **Endereço de Entrega Separado:** Preenchimento automático de Rua e Bairro ao digitar o **CEP**.
  * **Múltiplas Formas de Pagamento:**
    * **PIX:** Gera o **QR Code real na tela** e opção de "Copia e Cola".
    * **Cartão de Crédito:** Campos para dados do cartão e parcelamento customizado de **1x até 12x**.
    * **Boleto Bancário:** Instruções e geração automática.
* **Painel de Acompanhamento (Rastreio de Pedido):** Após finalizar a compra, o cliente visualiza uma linha do tempo detalhada (*Pagamento Aprovado ➔ Separando no Estoque ➔ Com a Transportadora ➔ Saiu para Entrega*) para rastrear o pacote até a sua casa.
* **Integração com a API (Back-end):** Os pedidos finalizados no Front-end são salvos e enviados via requisições assíncronas `POST` diretamente para os endpoints da API Spring Boot.

---

## 🔗 Endpoints da API (Back-end)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/pedidos` | Lista todos os pedidos cadastrados no sistema |
| **POST** | `/pedidos` | Cadastra um novo pedido enviado pelo e-commerce |

---

## 📂 Estrutura do Projeto

```text
src/main/java/com/quelen/orderflow/
├── controller/   # Endpoints HTTP da API REST
├── service/      # Regras de negócio da aplicação
├── repository/   # Comunicação e persistência de dados (Spring Data JPA)
└── model/        # Entidades do sistema

src/main/resources/static/
└── index.html    # Interface Front-end completa da Loja (Gibi Wear)