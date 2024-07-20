// [Note - Some questions might take more time to solve as it will take time for any coding beginner to build logic for approaching such programming problems. These questions are based on programming logic, not on development. So, please don’t hesitate to look at the solution and try to understand the approach used.]

// Qs1. Write a JavaScript function that returns array elements larger than a number.
// Ans 1
let arr = [8, 9, 10, 1, 2, 3, 4, 5, 6, 7];
let num = 5;
function getElements(arr, num) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > num) {
            console.log(arr[i]);
        }
    }
}
getElements(arr, num);


// Qs2. Write a JavaScript function to extract unique characters from a string. Example: str = "abcdabcdefgggh", ans = "abcdefgh".
// Ans 2
let str2 = "abcdabcdefgggh";
function getUnique(str2) {
    let ans = "";
    for (let i = 0; i < str2.length; i++) {
        let currChar = str2[i];
        if (ans.indexOf(currChar) == -1) {
            // if current character is not added, then add it in ans.
            // Otherwise it is a duplicate.
            ans += currChar;
        }
    }
    return ans;
}
console.log(getUnique(str));


// Qs3. Write a JavaScript function that accepts a list of country names as input and returns the longest country name as output. Example: country = ["Australia", "Germany", "United States of America"], output: "United States of America".
// Ans 3
let country = ["Australia", "Germany", "United States of America"];
function longestName(country) {
    let ansIdx = 0;
    for (let i = 0; i < country.length; i++) {
        let ansLen = country[ansIdx].length;
        let currLen = country[i].length;
        if (currLen > ansLen) {
            ansIdx = i;
        }
    }
    return country[ansIdx];
}
console.log(longestName(country));


// Qs4. Write a JavaScript function to count the number of vowels in a string argument.
// Ans 4
let str = "apnacollege";
function countVowels(str) {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) == "a" || str.charAt(i) == "e" || str.charAt(i) == "i" || str.charAt(i) == "o" || str.charAt(i) == "u") {
            count++;
        }
    }
    return count;
}
console.log(countVowels(str));


// Qs5. Write a JavaScript function to generate a random number within a range (start, end).
// Ans 5
let start = 100;
let end = 200;
function generateRandom(start, end) {
    let diff = end - start;
    return Math.floor(Math.random() * diff) + start;
}
console.log(generateRandom(start, end));