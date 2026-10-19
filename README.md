# Hangman-game
# 🎮 Hangman Game (Java)

A classic **Hangman game**, built in Java for the console, guess the word one letter at a time before the drawing is complete!

Words are pulled from an external text file and picked at random, so no two playthroughs are quite the same.


## ✨ What It Does

- 📂 **Reads a word list from a `.txt` file** using `BufferedReader` and `FileReader`
- 🎲 **Picks a random word** from that list using `Random`
- ⌨️ **Takes one letter guess at a time** from the player via `Scanner`
- ✅ Reveals correctly guessed letters in the word
- ❌ Tracks wrong guesses and draws the hangman a little more with each mistake
- 🏆 **You win** if you complete the word before running out of guesses
- 💀 **You lose** : if you hit 6 wrong guesses, the full hangman is drawn and the word is revealed
- 🔁 **Play again** : asks if you'd like another round after each game

## 🎬 How It Works

1. The game reads all the words from a text file and stores them in a list
2. A random word is picked, and it's displayed as a row of blanks (`_ _ _ _ _`)
3. On each turn, you guess a letter:
   - If it's in the word, every matching blank is filled in
   - If it's not, a wrong guess is counted, and the hangman drawing progresses
4. The game continues until either:
   - You reveal the whole word → **You Win!** 🎉
   - You reach 6 wrong guesses → **Game Over** 💀
5. At the end, you're asked if you want to play again (`Y`/`N`)

---

## 🖼️ Hangman Art Progression

**Code**

<img width="655" height="649" alt="1" src="https://github.com/user-attachments/assets/7155223a-f1b9-4e46-a1ea-adcc466924fa" />

<img width="585" height="561" alt="2" src="https://github.com/user-attachments/assets/efc92a22-1198-4162-8692-d72fa6beee01" />


The game draws the hangman step-by-step using a `switch` statement, one stage per wrong guess, from an empty gallows (0 wrong guesses) to the fully drawn figure (6 wrong guesses).

<img width="500" height="602" alt="3" src="https://github.com/user-attachments/assets/42b3027f-9ceb-4eba-8e00-ce5ead174b83" />

<img width="286" height="198" alt="4" src="https://github.com/user-attachments/assets/7745bb28-c894-4261-8ab6-fbce338f58d2" />



## 📸 Screenshots / Demo

**Video walkthrough**

https://github.com/user-attachments/assets/191ac0b7-f8db-4f29-9997-6b9bcf323c1f


**txt file provided**

<img width="289" height="274" alt="image" src="https://github.com/user-attachments/assets/b64cce3a-a424-49e2-8d77-17be11f8733d" />

## 🛠️ Concepts Used

| Concept | Where It's Used |

| File I/O | `BufferedReader` + `FileReader` to load words from a `.txt` file |
| Random | Picking a random word from the word list |
| Scanner | Reading the player's letter guesses |
| ArrayLists | Storing the word list and tracking the current word's revealed state |
| While & For Loops | Running the game loop and building the blank word display |
| If-Else Statements | Checking correct vs incorrect guesses |
| Switch Statements | Rendering the hangman drawing based on wrong guess count |

## 📁 Project Structure

```
 Hangman.java     # Contains the full game logic, word loading, and hangman art
```

## 🚀 Getting Started

**Prerequisites:** Java JDK installed on your machine

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/<repo-name>.git

# 2. Navigate into the project folder
cd <repo-name>

# 3. Compile the file
javac Hangman.java

# 4. Run the game
java Hangman
```

## 🔮 Future Improvements

- 📌 Use a relative file path (or bundle the word list with the project) instead of a hardcoded absolute path
- 🎯 Add difficulty levels (word length, category-based word lists)
- 🔤 Handle invalid/duplicate letter guesses more gracefully
- 🖥️ Build a GUI version
- 🏅 Add a scoring or streak system

## 🤝 Contributing

This is a learning project suggestions and feedback are always welcome! Feel free to open an issue or fork the repo.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
