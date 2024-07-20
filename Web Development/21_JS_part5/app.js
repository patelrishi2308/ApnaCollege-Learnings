// Qs1. Create a program that generates a random number representing a dice roll. [The number should be between 1 and 6].
// Ans 1
let dice = Math.floor(Math.random() * 6) + 1;
console.log(dice);


// Qs2. Create an object representing a car that stores the following properties for the car: name, model, color. Print the car’s name.
// Ans 2
const car = {
    name: "Maruti Suzuki",
    model: "Maruti Suzuki Dzire",
    color: "white",
};
console.log(car.name);


// Qs3. Create an object Person with their name, age, and city. Edit their city's original value to change it to “New York”. Add a new property country and set it to the United States.
// Ans 3
const Person = {
    name: "Jane Doe",
    age: 21,
    city: "New Jersey",
};
Person.city = "New York";
Person.country = "United States";
console.log(Person);