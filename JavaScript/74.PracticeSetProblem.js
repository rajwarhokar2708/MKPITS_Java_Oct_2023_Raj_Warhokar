arr = [2, 3, 4, 5];
// newarr = arr.reduce(factorial);

// function factorial(num1, num2) {
//   newnum=num1 * (num1 - 1);
//     return newnum;
// }
// console.log(newarr); // Output: [0, 2, 6, 24, 120]</s>

var array = [];

function factor(num) {
  for (i = 1; i <= num; i++) {
    array.push(i);
  }
  array.reduce(function (a, b) {
    return a * b;
  });
}

console.log(factor(5));
