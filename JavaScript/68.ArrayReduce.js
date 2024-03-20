arr = [1, 2, 3, 4, 5, 6, 7];

newArr = arr.reduce(add);

function add(num1, num2) {
  return num1 + num2;
}
console.log(newArr);
