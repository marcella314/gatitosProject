let lista = [];

// Pega lista de imagens do servlet
fetch("listaGatos")
  .then(res => res.json())
  .then(data => {
      lista = data;
      console.log("Imagens carregadas:", lista.length);
  })
  .catch(err => console.error("Erro ao buscar lista:", err));

function mostrarGato() {
    if (lista.length === 0) {
        alert("Nenhuma imagem encontrada!");
        return;
    }

    const i = Math.floor(Math.random() * lista.length);
    const nome = lista[i];

    const img = document.getElementById("imgGato");
    img.classList.remove("show"); // tira fade

    // espera a imagem carregar antes de aplicar o efeito
    img.onload = () => img.classList.add("show");

    img.src = "cats_in_the_cradle/" + nome;
}
