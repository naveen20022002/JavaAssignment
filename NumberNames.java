import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println(convertToWords(number));
        sc.close();
    }
    public static String convertToWords(int number) {
        String[] values = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = "";
        while (number > 0) {
            int digit = number % 10;
            result = values[digit] + " " + result;
            number = number / 10;
        }
        return result;
    }
}
