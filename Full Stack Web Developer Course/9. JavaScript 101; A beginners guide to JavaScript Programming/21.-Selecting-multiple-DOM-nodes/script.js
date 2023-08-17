const elements = document.querySelectorAll("li");

elements.forEach(node => {
    node.innerText = "This is changed!";
});

elements.forEach((node, index) => {
    node.innerText = `Hello this is item ${index + 1}`;
});

elements.forEach(node => {
    node.classList.add("custom-class", "second-class");
});