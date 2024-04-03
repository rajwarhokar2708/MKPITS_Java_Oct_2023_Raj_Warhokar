let gameOver = false;
let currentNumber = 1;
let timerInterval;
let timeElapsed = 0;

function generateMatrix() {
  const matrixSize = 10; // 10x10 matrix
  const matrixContainer = document.getElementById("matrix");
  const message = document.getElementById("message");
  const timerDisplay = document.getElementById("timer");

  matrixContainer.innerHTML = "";
  message.textContent = "";

  gameOver = false;
  currentNumber = 1;
  timeElapsed = 0;
  updateTimerDisplay(timerDisplay);

  const numbers = Array.from({ length: 100 }, (_, i) => i + 1);
  shuffleArray(numbers);

  for (let i = 0; i < matrixSize; i++) {
    for (let j = 0; j < matrixSize; j++) {
      const cell = document.createElement("div");
      cell.classList.add("cell");
      cell.textContent = numbers[i * matrixSize + j];
      cell.dataset.number = numbers[i * matrixSize + j]; // Store the expected number in a data attribute

      cell.addEventListener("click", function () {
        if (!gameOver) {
          const selectedNumber = parseInt(cell.textContent);
          const expectedNumber = parseInt(cell.dataset.number);
          if (selectedNumber === currentNumber) {
            cell.classList.add("selected");
            currentNumber++;
            if (currentNumber === 101) {
              message.textContent = alert("Congratulations! You Won the Game");
              gameOver = true;
              clearInterval(timerInterval); // Stop the timer when the game is completed
            }
          } else {
            cell.classList.add("wrong");
            message.textContent =alert ("Game Over. You selected the wrong number.");
            gameOver = true;
            clearInterval(timerInterval); // Stop the timer when the game ends
          }
        }
      });

      matrixContainer.appendChild(cell);
    }
  }

  // Start the timer
  timerInterval = setInterval(function () {
    timeElapsed++;
    updateTimerDisplay(timerDisplay);
  }, 1000);
}

function shuffleArray(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
}

function updateTimerDisplay(timerDisplay) {
  const minutes = Math.floor(timeElapsed / 60);
  const seconds = timeElapsed % 60;
  timerDisplay.textContent = `Time: ${minutes
    .toString()
    .padStart(2, "0")}:${seconds.toString().padStart(2, "0")}`;
}
