// let string1 = prompt(`Please enter the first string: `);
let string1 = `Please give Rs 1000`;
let string2 = prompt(`Enter which word you find`);
let findstring = string1.includes(string2);
if (findstring == true) {
  alert(`${string2}`);
} else {
  alert(`It is not present in string`);
}
