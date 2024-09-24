//https://leetcode.com/problems/powx-n/?envType=problem-list-v2&envId=recursion
public class Pow {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }

        if(n<0){
            return 1/(x*myPow(x,-n-1));
        }

        if (n % 2 == 0) {
            return myPow(x * x,(n/ 2));
        } 
       
       return x * myPow(x,n-1); 
    }

    public static void main(String[] args) {
        int n=10;
        Double x=2.00000;
        System.out.println(myPow(x,n));
    }
}
