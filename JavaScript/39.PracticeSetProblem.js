let studentMarks = {
  harry: 98,
  rohan: 70,
  akash: 7,
};
for (let index = 0; index < Object.keys(studentMarks).length; index++) {
 let key = Object.keys(studentMarks)[index];
  console.log(`${key} : ${studentMarks[key]}`);
}


