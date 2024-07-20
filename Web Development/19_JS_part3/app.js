// Qs1. Write a JavaScript program to get the first n elements of an array. [n can be any positive number]. For example: for array [7, 9, 0, -2] and n=3 print [7, 9, 0].
// Ans 1
let arr1 = [7, 9, 0, -2];
let n = 3;
let ans = arr1.slice(0, n);
console.log(ans);


// Qs2. Write a JavaScript program to get the last n elements of an array. [n can be any positive number]. For example: for array [7, 9, 0, -2] and n=3 print [9, 0, -2].
// Ans 2
let arr2 = [7, 9, 0, -2];
let n2 = 3;
let ans2 = arr.slice(arr2.length - n2);
console.log(ans2);


// Qs3. Write a JavaScript program to check whether a string is blank or not.
// Ans 3
let str3 = prompt("please enter a string");
if (str3.length == 0) {
    console.log("string is empty");
} else {
    console.log("string is not empty");
}


// Qs4. Write a JavaScript program to test whether the character at the given (character) index is lowercase.
// Ans 4
let str4 = "ApNaCoLlEgE";
let idx = 3;
if (str4[idx] == str4[idx].toLowerCase()) {
    console.log("character is lowercase");
} else {
    console.log("character is not lowercase");
}


// Qs5. Write a JavaScript program to strip leading and trailing spaces from a string.
// Ans 5
let str = prompt("please enter a string");
console.log(`original string = ${str}`);
console.log(`string without spaces = ${str.trim()}`);


// Qs6. Write a JavaScript program to check if an element exists in an array or not.
// Ans 6
let arr = ["hello", 'a', 23, 64, 99, -6];
let item = 64;
if (arr.indexOf(item) != -1) {
    console.log("element exists in array");
} else {
    console.log("element doesn't exist in array");
}
