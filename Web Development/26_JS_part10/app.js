document.addEventListener('DOMContentLoaded', (event) => {
    // Qs 1. Try out the following events in Event Listener on your own:
    // mouseout
    // keypress
    // scroll
    // load
    // (Use MDN for help)

    // mouseout event
    document.getElementById('testButton').addEventListener('mouseout', () => {
        alert('Mouse out event triggered!');
    });

    // keypress event
    document.getElementById('keypressInput').addEventListener('keypress', () => {
        console.log('Key pressed!');
    });

    // scroll event
    window.addEventListener('scroll', () => {
        console.log('Page is scrolling!');
    });

    // load event
    window.addEventListener('load', () => {
        console.log('Page has loaded!');
    });

    // Qs 2. Create a button on the page using JavaScript. Add an event listener to the button that changes the button’s color to green 
    // when it is clicked.
    // Create a button
    const button = document.createElement('button');
    button.textContent = 'Click me';
    document.getElementById('buttonContainer').appendChild(button);

    // Add event listener to change color to green on click
    button.addEventListener('click', () => {
        button.style.backgroundColor = 'green';
    });

    // Qs 3. Create an input element on the page with a placeholder “enter your name” and an H2 heading on the page inside HTML. 
    // The purpose of this input element is to enter a user’s name so it should only input letters from a-z, A-Z, and space 
    // (all other characters should not be detected). Whenever the user inputs their name, their input should be dynamically 
    // visible inside the heading. [Please note that no other character apart from the allowed characters should be visible 
    // in the heading]
    const input = document.querySelector('#nameInput');
    const heading = document.querySelector('#displayName');

    input.addEventListener('input', function () {
        let value = input.value;
        value = value.replace(/[^a-zA-Z\s]/g, '');
        heading.textContent = value;
    });
});
