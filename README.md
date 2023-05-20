# BMI Calculator

A simple BMI (Body Mass Index) calculator implemented in Kotlin.

## Description

The BMI Calculator is a command-line program that calculates the Body Mass Index based on user input for weight and height. It then determines the weight category (underweight, normal, overweight, or obese) based on the calculated BMI value.

## Features

- Accepts user input for weight (in kilograms) and height (in meters).
- Calculates the BMI using the weight and height values.
- Determines the weight category based on the calculated BMI.
- Displays the calculated BMI value and weight category to the user.

## Usage

1. Make sure you have Kotlin installed on your system.

2. Clone the repository or download the source code files.

3. Open a terminal or command prompt and navigate to the project directory.

4. Compile the Kotlin source file:

   ```bash
   kotlinc -include-runtime -d bmi-calculator.jar Main.kt
   ```

5. Run the program:

   ```bash
   kotlin bmi-calculator.jar
   ```

6. Follow the prompts to enter your weight and height.

7. The program will calculate your BMI and display the result along with the weight category.

## Example

```
--- BMI Calculator ---
Welcome to the BMI Calculator.
Please enter your weight in kilograms: 70
Please enter your height in meters: 1.75
Your BMI is 22.9, meaning you're normal.
----------------------
```

## License

This project is licensed under the [MIT License](LICENSE).