import java.util.Scanner;
class NumberPlay{
    public static void numberPuzzle(int num){
        if(num < 10 || num > 99){
            System.out.println("Invaid number");
        }
        else{
            int num1 = num / 10;
            int num2 = num % 10;
            if(num > 50){
                int ans = num1 - num2;
                System.out.println(ans);
            }
            else{
                int ans = num2 - num1;
                System.out.println(ans);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numberPuzzle(num);
        sc.close();
    }
}