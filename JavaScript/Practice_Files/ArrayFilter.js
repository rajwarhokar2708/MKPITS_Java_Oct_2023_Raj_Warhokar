arr = [1, 2, 3, 4, 5, 6, 7];
// newArr = arr.filter((value) => value > 5);
// console.log(newArr);   //This is a way

newArr = arr.filter(greater_than);
function greater_than(num) {
  return num > 5;
}
console.log(newArr);
