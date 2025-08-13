fetch("http://localhost:8081/api/products")
    .then(res => res.json())
    .then(data => {
        const container = document.getElementById("products");
        data.forEach(p => {
            const div = document.createElement("div");
            div.className = "product";
            div.innerHTML = `<h3>${p.name}</h3><p>Price: $${p.price}</p>`;
            container.appendChild(div);
        });
    });
