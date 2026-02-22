import java.util.Scanner;
public class OddEven{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int i = 1;
        int SumOdd = 0;
        int SumEven = 0;
        
        System.out.println("Odd Number: ");
        while(i <= num){
            if(i % 2 != 0){
                System.out.println(i + "");
                SumOdd = SumOdd + i;
            }
            i++;
        }
        i = 1;

        System.out.println("Even Number: ");
        while(i <= num){
            if(i % 2 == 0){
                System.out.println(i + "");
                SumEven = SumEven + i;
            }
            i++;
        }

        System.out.println("Sum of Odd Numbers: " +SumOdd);
        System.out.println("Sum of Even Numbers: " +SumEven);

    }

} 