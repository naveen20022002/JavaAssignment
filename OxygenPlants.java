import java.util.Scanner;
public class OxygenPlants {
    public static void calculateOxygenProduction(int length, int breadth, int plantArea){
        double roomArea = length * breadth;
        double ans =  ( roomArea / plantArea ) * 100 * 100;
        int oxygenProduction = (int)ans;
        int num = oxygenProduction % 10;
        int roundAns = oxygenProduction - num;
        double TotaloxygenProduction = roundAns * 0.9;
        System.out.printf("Total oxygen production is %.2f litres\n", TotaloxygenProduction);
    }
    public static void main(String[] args){
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        if(length <= 0){
            System.out.println("invalid length");
            return;
        }
        System.out.println("enter the breadth :");
        int breadth = sc.nextInt();
        if(breadth <= 0){
            System.out.println("invalid breadth");
            return;
        }
        System.out.println("enter the plant area");
        int plantArea = sc.nextInt();
        if(plantArea <= 0){
            System.out.println("invalid plant area");
            return;
        }
        calculateOxygenProduction(length, breadth, plantArea);
        sc.close();
    }
}
