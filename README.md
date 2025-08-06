# 📄 searchReplace – Java Command Line String Search & Replace

## 🔍 Description
`searchReplace` is a simple **Java command-line program** that allows users to **search for a substring** within a larger string and **replace it recursively** with another substring. It uses **recursion** to perform the search and replace operation throughout the string, replacing **every occurrence** of the target substring.

This is a **console-based tool** – you run it through your terminal or command prompt, interactively entering your input via the keyboard.

---

## 💡 Features
- Fully command-line based.
- Uses recursion for elegant logic.
- Replaces **all** instances of a target substring.
- Interactive input and output via the terminal.

---

## 🖥️ How to Use

1. **Compile the program:**

   ```bash
   javac searchReplace.java
2. **Run the program:**

```
java searchReplace
```

### Follow the prompts:
Please enter a string: hello world, hello user!
Please enter the substring you wish to find: hello
Please enter a string to replace the given substring: hi
Your new string is: hi world, hi user!
📦 What’s in the Code?
main() handles user input using a Scanner wrapped in a try-with-resources block.

### searchAndReplace() is a recursive method that:

Checks if the string contains the target substring.

Finds the first occurrence.

Replaces it with the desired string.

Recursively processes the remainder of the string.
