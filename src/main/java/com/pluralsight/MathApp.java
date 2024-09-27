package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {


/* Question 1: Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...") */

// declare variables here
        int bobSalary = 50000;
        int garySalary = 70000;
// then code solution
        int highestSalary = Math.max(bobSalary,garySalary);
// then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary);


/* Question 2: Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want */
// declare variables here
        double carPrice = 42023.53;
        double truckPrice = 82923.23;

// then code solution
        double smallerCost = Math.min(carPrice,truckPrice);
// then use System.out.println() to display results
    System.out.println( "The smaller amount is " + smallerCost);


// Question 3: Find and display the area of a circle whose radius is 7.25
// declare variables here
        double radius = 7.25;
// then code solution
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
// then use System.out.println() to display results
    System.out.println("The radius of the circle is " + areaOfCircle);


// Question 4:Find and display the square root a variable after it is set to 5.0
// declare variables here
        double number = 5.0;
// then code solution
        double squareRoot = Math.sqrt(number);
// then use System.out.println() to display results
    System.out.println("The square root of "+ number + " is " + squareRoot);


// Question 5: Find and display the distance between the points (5, 10) and (85, 50)
// declare variables here
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
// then code solution
        double firstPart = Math.pow((x2 - x1),2);
        double secondPart = Math.pow((y2 - y1),2);
        double distance = Math.sqrt((firstPart + secondPart));
// then use System.out.println() to display results
    System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);

// Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.
// declare variables here
        double value = -3.8;
// then code solution
        double absoluteValue = Math.abs(value);
// then use System.out.println() to display results
    System.out.println("The absolute value of " + value + " is " + absoluteValue);


// Question 7: Find and display a random number between 0 and 1
// declare variables here
        double randomNumber = Math.random();
// then code solution
// then use System.out.println() to display results
        System.out.println("Here is a random number: " + randomNumber);

    }
}
