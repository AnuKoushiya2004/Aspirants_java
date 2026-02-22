public class Armstrong {
    static boolean isArmstrong(int num){
        int original = num;
        int count = 0;
        int sum = 0;

        int temp = num;
        while(temp != 0){
            count++;
            temp = temp / 10;
        }

        temp = num;
        while(temp != 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit,count);
            temp = temp / 10;
        }
        return sum == original;

    } 
    public static void main(String args[]){
        int num = 153;
        
        if(isArmstrong(num))
            System.out.println("Its a armstrong");
        else
            System.out.println("Its not a armstrong");
    }
}
