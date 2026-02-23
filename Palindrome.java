public class Palindrome {
    static int rev_number(int x){
        int rev1 = 0;
        while(x > 0){
            int digit  = x % 10;
            rev1 = rev1 * 10 + digit;
            x = x / 10;
        }
        return rev1;
    }
    public static void main(String args[]){
        int n =123;
        int rev = rev_number(n);
    
        if(n == rev)
            System.out.print("its a palindrome");
        else
            System.out.print("its not palindrome");
    } 
    
}




// public class Reverse {
//     public static void main(String args[]){
//         int x = 1234;
//         int rev = 0;
//         while(x > 0){
//             int d = x%10;
//             rev = rev*10+d;
//             x=x/10;
//         }
        
//         System.out.print(rev);
//     }
// }