public class Fibonocii {
    public static void main(String args[]){
        int n = 5;
        int a = 0;int b = 1;int c = 0;
        System.out.print(a+" "+b+" ");
        int i = 2;
        while(i < n){
            c = a +b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
        }
    }
}
