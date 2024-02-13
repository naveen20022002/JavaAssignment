//Problem based on Functional Interface
import java.util.*;

class UserInterface{
    //Method to find the sum of the divisors
    public static int findingDivisorsTotal(int num){
        int i = 1;
        int divisorsTotal = 0;
        while(i <= (num / 2)){
            if(num % i == 0){
                divisorsTotal += i;
            }
            i++;
        }
        return divisorsTotal;
    }
    //method to find the reverse of a number
    public static int reverseNumber(int num, int digit){
        if(num == 0){
            return num;
        }
        return (int) ((num % 10) * (Math.pow(10, digit)) + reverseNumber(num / 10, --digit));
    }
    //Lambda expression
    public static NumberCategory checkAmicable = (int a, int b) -> {

        //Finding the sum of divisors of the first number
        int firstTotal = findingDivisorsTotal(a);

        //Finding the sum of divisors of the second number
        int secondTotal = findingDivisorsTotal(b);

        if(firstTotal == b && secondTotal == a){
            return true;
        }
        else{
            return false;
        }
    };
    //Lambda expression
    public static NumberCategory checkPalindrome = (int a, int b) -> {
        int multiple = a * b;
        //we have to cast it to string to find the digit of the number
        String s = Integer.toString(multiple);
        int reverse = reverseNumber(multiple, s.length() - 1);
        if(multiple == reverse){
            return true;
        }
        else{
            return false;
        }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("enter the second number :");
        int num2 = sc.nextInt();
        sc.close();
        if(checkAmicable.checkNumberCategory(num1, num2)){
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        }
        else{
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }
        if(checkPalindrome.checkNumberCategory(num1, num2)){
            System.out.println("Their Product " + num1*num2 + " produces a palindrome");
        }
        else{
            System.out.println("Their Product " + num1*num2 + " does not produce a palindrome");
        }
    }
}
interface NumberCategory{
    public boolean checkNumberCategory(int num1, int num2);
}