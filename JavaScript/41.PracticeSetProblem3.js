let num = 0;
let randomNumber = Math.ceil(Math.random() * 10);
while (true) {
  let num = prompt(`Please enter the first number: `);
  if (num == randomNumber) {
    alert(`Number Matched`);
    break;
  } else {
    if (num < randomNumber) {
      alert(`Your guess is too low! Try again.`);
    } else {
      alert(`Your guess is too high! Try again.`);
    }
  }
}
