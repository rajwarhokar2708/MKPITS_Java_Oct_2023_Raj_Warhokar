range = parseInt(prompt(`Enter Array Range`));
let myarr = [];
for (let index = 0; index < range; index++) {
  let arr = prompt(`Enter ${index + 1} array`);
  myarr.push(arr);
}
newMyArr = myarr.filter((value) => value % 10 == 0);
alert(`${newMyArr}`);
