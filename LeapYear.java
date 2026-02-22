

public class LeapYear {
    public static void main(String agrs[]){
        int year = 2000;
        if(year%4==0){
            if(year%400==0){
                if(year%100==0)
                    System.out.println("its a leap year:");
                else
                    System.out.println("Its not a leap year:");
                }
            else
                System.out.println("Its a leap year:");
        }
        else
            System.out.println("Its not a leap year:");
        

    }
}


// logic 2

// public class LeapYear {
//     public static void main(String agrs[]){
//         int year = 2000;
//         if((year%400==0)&&(year%100==0))
//             System.out.println("Its a leap year:");
//         else
//             System.out.println("Its not a leap year:");
//         }
//     }
