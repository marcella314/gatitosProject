🐱 Gerador de Gatitos

Um mini-projeto web em Java + Tomcat que exibe fotos aleatórias de gatos ao som de Cats in the Cradle.

📌 Descrição

Este projeto é uma aplicação web simples que:

Lê automaticamente todas as imagens da pasta
src/main/webapp/cats_in_the_cradle/

Lista esses arquivos em formato JSON através de um Servlet Java (ListaGatosServlet)

O arquivo gatitos.html:

Carrega a lista via JavaScript

Exibe um botão "Veja um gato"

Mostra aleatoriamente uma das imagens da pasta

Toca a música “Cats in the Cradle” através de um iframe do YouTube

Usa CSS em tons de preto, branco e cinza para um visual elegante

O JavaScript (gatitosGato.js) faz o sorteio e atualiza a imagem exibida na tela.

🧩 Como funciona a aplicação
✔ Servlet (Java)

O servlet ListaGatosServlet percorre a pasta cats_in_the_cradle dentro do webapp e retorna algo como:

["gato1.jpg", "gato2.png", "gato3.jpeg"]


Esse endpoint fica disponível em:

/listaGatos

✔ HTML + CSS

O arquivo gatitos.html:

carrega a música via iframe

mostra o botão “Veja um gato”

exibe a imagem selecionada

aplica um tema escuro estiloso

✔ JavaScript

O arquivo gatitosGato.js:

chama o servlet via fetch("listaGatos")

salva os nomes das imagens em uma lista

sorteia uma imagem a cada clique

atualiza automaticamente o <img> na tela
