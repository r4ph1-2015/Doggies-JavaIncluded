window.onload = function() {
    fetch("/api/profile")
        .then(response => response.json())
        .then(data => {
            document.getElementById("dog-name").innerText = data.name;
            document.getElementById("dog-breed").innerText = data.breed;
            document.getElementById("dog-age").innerText = data.age;
            document.getElementById("dog-health").innerText = data.health;
            document.getElementById("dog-image").src = data.image;
        })
        .catch(error => console.error('Error fetching dog profile:', error));
};
