import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =  sc.nextInt();
        System.out.println("Enter second number");
        int num2 =  sc.nextInt();
        System.out.println("1 - addtion");
        System.out.println("2 - subtraction ");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("5 - to find the remainder");

        System.out.println("Please choose the operator");
        int operator = sc.nextInt();

        if(operator == 1){
            System.out.printf("%d + %d = %d", num1,num2,num1+num2).println();

        }
        else if( operator == 2){
            System.out.printf("%d - %d = %d", num1,num2,num1-num2).println();
        }
        else if(operator == 3){
            System.out.printf("%d x %d = %d", num1,num2,num1*num2);
        }
        else if (operator == 4 ){
            System.out.printf("%d ÷ %d = %d", num1,num2,num1/num2);
        }
        else if (operator == 5){
            System.out.printf("Remainder after division of %d ÷ %d = %d", num1,num2,num1%num2);
        }
        else {
            System.out.println("Invalid operator Dummy!!");
        }





    }
}
