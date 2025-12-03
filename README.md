🐱 Gerador de Gatitos

Um mini-projeto web em Java + Tomcat que exibe fotos aleatórias de gatos ao som de Cats in the Cradle. Desenvolvido para melhorar o entendimento sobre os conceitos aprendidos na disciplina de Programação para Internet.

📌 Descrição

Este projeto é uma aplicação web simples que:

- Lê automaticamente todas as imagens da pasta src/main/webapp/cats_in_the_cradle/
- Lista esses arquivos em formato JSON através de um Servlet Java (ListaGatosServlet)

O arquivo gatitos.html:

- Carrega a lista via JavaScript
- Exibe um botão "Veja um gato"
- Mostra aleatoriamente uma das imagens da pasta
- Toca a música “Cats in the Cradle” através de um iframe do YouTube
- Usa CSS em tons de preto, branco e cinza para um visual elegante
- O JavaScript (gatitosGato.js) faz o sorteio e atualiza a imagem exibida na tela.

🧩 Como funciona a aplicação

✔ Servlet (Java)

O servlet ListaGatosServlet percorre a pasta cats_in_the_cradle dentro do webapp e retorna algo como: ["gato1.jpg", "gato2.png", "gato3.jpeg"]

Esse endpoint fica disponível em: /listaGatos

✔ HTML + CSS

O arquivo gatitos.html:
- Carrega a música via iframe
- Mostra o botão “Veja um gato”
- Exibe a imagem selecionada
- Aplica um tema escuro estiloso

✔ JavaScript

O arquivo gatitosGato.js:
- Chama o servlet via fetch("listaGatos")
- Salva os nomes das imagens em uma lista
- Sorteia uma imagem a cada clique
- Atualiza automaticamente o <img> na tela

📂 Estrutura do projeto

gatitosProject/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── gatitos/
│       │       └── ListaGatosServlet.java
│       └── webapp/
│           ├── cats_in_the_cradle/
│           │   └── (todas as imagens dos gatos)
│           ├── gatitos.html
│           ├── gatitosGato.js
│           └── WEB-INF/
│               └── web.xml


🚀 Como executar

- Importe o projeto no Eclipse
- Certifique-se de que o Tomcat está configurado como Targeted Runtime
- Inicie o Tomcat através do painel Servers
- Acesse no navegador: http://localhost:8080/gatitosProject/gatitos.html
- Clique em "Veja um gato" e aproveite 😺🎵

🎉 Tecnologias utilizadas

- Java Servlet (Tomcat)
- HTML5
- CSS
- JavaScript
- Servidor Apache Tomcat 9
