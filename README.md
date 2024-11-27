# Calorie Calculator

This is a simple Java-based Calorie Calculator program that calculates your Basal Metabolic Rate (BMR) and daily calorie needs based on your input. The calculation considers your gender, age, weight, height, and activity level to determine how many calories you need per day to maintain your current weight.

## Features

- **Gender Input**: Choose between Male (M) or Female (F).
- **Age Input**: Input your age to calculate your BMR.
- **Weight Input**: Enter your weight in kilograms to help calculate your BMR.
- **Height Input**: Enter your height in centimeters.
- **Activity Level**: Choose from three activity levels:
  - Sedentary (little to no exercise)
  - Moderately active (moderate exercise or sports)
  - Very active (hard exercise, physical job, or training)

## How It Works

1. The program first prompts you for basic information:
   - Gender (M/F)
   - Age (in years)
   - Weight (in kg)
   - Height (in cm)
   - Activity level (sedentary/moderate/active)
   
2. It then calculates your **Basal Metabolic Rate (BMR)** using the Harris-Benedict formula:
   - For males: `BMR = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age)`
   - For females: `BMR = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age)`

3. The program uses your activity level to adjust your BMR to estimate your **daily calorie needs**:
   - Sedentary: BMR * 1.2
   - Moderately active: BMR * 1.55
   - Very active: BMR * 1.725

4. Finally, the program displays your **BMR** and **estimated daily calorie needs**.

## Requirements

- Java 8 or higher installed on your machine.

## Running the Program

1. Clone or download the project repository.
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ, or NetBeans).
3. Compile and run the `CalorieCalculator.java` file.
4. Follow the on-screen prompts to input your information.
5. The program will display your **BMR** and **calorie needs** based on the information you provided.

## Example

**Sample Output**:

Calorie Calculator:

- Gender (M/F): M
- Enter your age: 25
- Your weight in kg: 70
- Your height in centimeters: 175
- Activity Level (sedentary/moderate/active): moderate

Your Basal Metabolic Rate (BMR) is: 1676 calories per day.

Your estimated daily calorie needs are: 2597 calories per day.
