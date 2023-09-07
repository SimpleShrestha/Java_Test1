import java.util.Scanner;

public class Log_In {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        if (username.equals("simple") && password.equals("simple123")) {

            System.out.println("Choose a program: ");
            System.out.println("1: Greatest Number Among 3");
            System.out.println("2: Calculator");
            System.out.println("3: Result Calculator With 3 Grades");
            System.out.println("4: Guessing game");

            int Selection = sc.nextInt();


            if (Selection == 1) {
                System.out.println("Enter First Number");
                int num1 = sc.nextInt();
                System.out.println("Enter Second Number");
                int num2 = sc.nextInt();
                System.out.println("Enter Third Number: ");
                int num3 = sc.nextInt();
                if (num1 >= num2 && num2 > num3) {
                    System.out.println("Number 1 is greater");
                } else if (num1 <= num2 && num2 <= num3) {
                    System.out.println("Number 2 is greater");
                } else {
                    System.out.println("Number 3 is greater");
                }
            } else if (Selection == 2) {
                System.out.println("Enter first number: ");
                float firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                float secondNumber = sc.nextInt();
                System.out.println("Select an operator (+, -, *, /)");
                String operator = sc.next();
                System.out.println("Your result is: ");
                switch (operator) {
                    case "+":
                        System.out.println(firstNumber + secondNumber);
                        break;
                    case "-":
                        System.out.println(firstNumber - secondNumber);
                        break;
                    case "*":
                        System.out.println(firstNumber * secondNumber);
                        break;
                    case "/":
                        System.out.println(firstNumber / secondNumber);
                        break;
                    default:
                        System.out.println("Invalid Request ");
                }
            } else if (Selection == 3) {
                System.out.println("Enter marks of Computer");
                float computer = sc.nextFloat();
                System.out.println("Enter marks of History");
                float history = sc.nextFloat();
                System.out.println("Enter marks of English");
                float english = sc.nextFloat();

                float percentage = ((computer + history + english) / 300) * 100;
                System.out.println(percentage + "%");

                if (percentage > 90) {
                    System.out.println("A+");
                } else if (percentage > 85) {
                    System.out.println("A");
                } else if (percentage > 70) {
                    System.out.println("B+");
                } else if (percentage > 55) {
                    System.out.println("B");
                } else if (percentage > 40) {
                    System.out.println("C+");
                } else if (percentage > 30) {
                    System.out.println("NG");
                }

            } else if (Selection == 4) {
                System.out.println("Enter your guess from 1 to 7");
                int guess = sc.nextInt();
                int random = (int) (Math.random() * 8);

                if (random == guess) {
                    System.out.println("Your Guess Is CORRECT");
                } else {
                    System.out.println("SORRY! Your Guess Is INCORRECT!, It should have been"+ random);
                }
            }
        }else if (username.equals("simple")){
            System.out.println("Wrong password");
        }else{
            System.out.println("Wrong username and password");
        }
    }
}
