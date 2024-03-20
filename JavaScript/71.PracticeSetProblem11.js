// range = parseInt(prompt(`Enter Array Range`));
// alert(`${range}`);
let myarr = [];
for (let index = 0; ; index++) {
  let arr = prompt(`Enter ${index + 1} array`);

  if (!(arr == 0)) {
    myarr.push(arr);
  } else {
    alert(`0 is added Lopp is break`);
    break;
  }
}
alert(`${myarr}`);
