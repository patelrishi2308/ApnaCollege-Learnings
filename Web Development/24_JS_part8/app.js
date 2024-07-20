// Qs1: Square and sum the array elements using the arrow function and then find the average of the array.
let nums = [1, 2, 3, 4, 5];
// Square the elements of the array
const square = nums.map((num) => num * num);
console.log(square);
// Sum the squared elements
let sum = square.reduce((acc, cur) => acc + cur, 0);
// Calculate the average of the squared elements
let avg = sum / nums.length;
console.log(avg);



// Qs2: Create a new array using the map function whose each element is equal to the original element plus 5.
let init = [1,2,3,4,5]
let newint = init.map((el) => el + 5);
console.log(newint);



// Qs3: Create a new array whose elements are in uppercase of words present in the original array.
let strings = ["adam", "bob", "catlyn", "donald", "eve"];
// Convert each string in the array to uppercase
const upperCaseStrings = strings.map((string) => string.toUpperCase());
// Output the result
console.log(upperCaseStrings);



// Qs4: Write a function called doubleAndReturnArgs which accepts an array and a variable number of arguments. The function should return a new array with the original array values and all of the additional arguments doubled.
const doubleAndReturnArgs = (arr, ...args) => [
    ...arr,
    ...args.map((v) => v * 2),
  ];
  // Example usage
  console.log(doubleAndReturnArgs([1, 2, 3], 4, 4)); // [1, 2, 3, 8, 8]
  console.log(doubleAndReturnArgs([2], 10, 4));      // [2, 20, 8]
  

  
// Qs5: Write a function called mergeObjects that accepts two objects and returns a new object which contains all the keys and values of the first object and second object.
const mergeObjects = (obj1, obj2) => ({...obj1,...obj2});
  // Example usage
  console.log(mergeObjects({ a: 1, b: 2 }, { c: 3, d: 4 })); // {a:1, b:2, c:3, d:4}
  