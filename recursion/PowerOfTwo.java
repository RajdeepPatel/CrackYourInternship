//https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=recursion
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        else if(n%2!=0||n==0){
            return false;
        }
        else{
            return isPowerOfTwo(n/2);
        }
    }

    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
}
