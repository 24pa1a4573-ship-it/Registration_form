// Variables in Javascript

let name = "karthik";
const pi = 3.14;
var age = 20;
console.log(name, pi, age);

    //Conditional Statements in Javascript

// If Statement
let x = 10;
if (x > 5) {
  console.log("x is greater than 5");
}
// If-Else Statement
let y = 10;
if (y > 20) {
  console.log("x is greater than 20");
} else {
  console.log("x is less than or equal to 20");
}
// else-if Statement
let z = 10;
if (z > 20) {
  console.log("z is greater than 20");
} else if (z === 10) {
  console.log("z is equal to 10");
} else {
  console.log("z is less than 10");
}
// Switch Statement
let day = "Monday";
switch (day) {
  case "Monday":
    console.log("Today is Monday");
    break;
  case "Tuesday":
    console.log("Today is Tuesday");
    break;
  default:
    console.log("Today is not Monday or Tuesday");
}
// Ternary Operator
let p = 10;
let answer = p > 5 ? "p is greater than 5" : "p is less than or equal to 5";
console.log(answer);

    // Arrays in Javascript

let fruits = ["Apple", "Banana", "Mango"];
console.log(fruits[0]); // Apple
fruits.push("Orange"); // Add new item
console.log(fruits);

    // Loops in Javascript

// For Loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}
// While Loop
let n = 0;
while (n < 5) {
  console.log(n);
  n++;
}
// Do-While Loop
let i = 0;
do {
  console.log(i);
  i++;
} while (i < 5);

  //Functions in Javascript

// Function definition
function addNumbers(a, b) {
  let sum = a + b;        // Calculate sum
  return sum;             // Return the result
}
// Function call
let result = addNumbers(5, 3);

console.log("The sum is: " + result);  // Output: The sum is: 8

  // Objects in javascript

// Object creation
const person = {
  name: "Rahul",
  age: 22,
  city: "Hyderabad",
// Method (function inside an object)
  greet: function() {
    console.log("Hello, my name is " + this.name);
  }
};
// Accessing object values
console.log(person.name);     // Output: Rahul
console.log(person.age);      // Output: 22
// Calling the method
person.greet();               // Output: Hello, my name is Rahul