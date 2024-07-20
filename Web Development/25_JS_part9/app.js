// Qs1: Create a new input and button element on the page using JavaScript only. Set the text of the button to “Click me”.

// Qs2: Add the following attributes to the elements:
//      Change the placeholder value of the input to “username”.
//      Change the id of the button to “btn”.

// Qs3: Access the button using the querySelector and button id. Change the button background color to blue and text color to white.

// Qs4: Create an h1 element on the page and set its text to “DOM Practice” underlined. Change its color to purple.

// Qs5: Create a p tag on the page and set its text to “Apna College Delta Practice”, where Delta is bold.

// Ans 1
let button = document.createElement("button");
let input = document.createElement("input");
button.innerText = "Click me";
document.querySelector("body").append(input);
document.querySelector("body").append(button);

// Ans 2
button.setAttribute("id", "btn");
input.setAttribute("placeholder", "username");

// Ans 3
let btn = document.querySelector("#btn");
btn.style.backgroundColor = "blue";
btn.style.color = "white";

// Ans 4
let h1 = document.createElement("h1");
h1.innerHTML = "<u>DOM Practice</u>";
h1.style.color = "purple";
document.querySelector("body").append(h1);

// Ans 5
let p = document.createElement("p");
p.innerHTML = "Apna College <b>Delta</b> Practice";
document.querySelector("body").append(p);
