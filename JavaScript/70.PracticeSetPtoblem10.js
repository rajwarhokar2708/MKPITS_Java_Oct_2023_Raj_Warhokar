range = parseInt(prompt(`Enter Array Range`));
// alert(`${range}`);
let myarr = [];
for (let index = 0; index < range; index++) {
  let arr = prompt(`Enter ${index + 1} array`);
  myarr.push(arr);
}
alert(`${myarr}`);
console.log(myarr);
// let arr =[ prompt(`Enter Array range`)];
