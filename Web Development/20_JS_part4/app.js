// Qs1. Write a JS program to delete all occurrences of element num in a given array. Example: if arr=[1, 2, 3, 4, 5, 6, 2, 3] & num=2, the result should be arr=[1, 3, 4, 5, 6, 3].
// Ans 1
let arr1 = [1, 2, 3, 4, 5, 6, 2, 3];
let num = 2;
for (let i = 0; i < arr1.length; i++) {
    if (arr1[i] == num) {
        arr1.splice(i, 1);
    }
}
console.log(arr1);


// Qs2. Write a JS program to find the number of digits in a number. Example: if number=287152, count=6.
// Ans 2
let number2 = 287152;
let count = 0;
let copy2 = number2;
while (copy2 > 0) {
    count++;
    copy2 = Math.floor(copy2 / 10);
}
console.log(count);


// Qs3. Write a JS program to find the sum of digits in a number. Example: if number=287152, sum=25.
// Ans 3
let number = 287152;
let sum = 0;
let copy = number;
while (copy > 0) {
    digit = copy % 10;
    sum += digit;
    copy = Math.floor(copy / 10);
}
console.log(sum);


// Qs4. Print the factorial of a number n. [Factorial of a number n is the product of all positive integers less than or equal to a given positive integer and denoted by that integer.] 
// Example:
// 7! (factorial of 7) = 1 x 2 x 3 x 4 x 5 x 6 x 7 = 5040
// 5! (factorial of 5) = 1 x 2 x 3 x 4 x 5 = 120
// 3! (factorial of 3) = 1 x 2 x 3 = 6
// 0! is always 1
// Ans 4
let n = 5;
let factorial = 1;
for (let i = 1; i <= n; i++) {
    factorial *= i;
}
console.log(`factorial of ${n} is ${factorial}`);


// Qs5. Find the largest number in an array with only positive numbers.
// Ans 5
let arr = [2, 5, 10, 4, 2, 7, 1, 9];
let largest = 0;
for (let i = 0; i < arr.length; i++) {
    if (largest < arr[i]) {
        largest = arr[i];
    }
}
console.log(largest);