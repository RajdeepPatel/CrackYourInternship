//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
import java.util.HashMap;

public class FrequenciesOfLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P) {
            // do modify in the given array
             HashMap<Integer,Integer> map = new HashMap<>();
             for(int i=0; i<arr.length;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
                }else{
                   int feq = map.get(arr[i]);
                    map.put(arr[i],feq+1);
                }
             }
    
             for(int i = 0;i<arr.length;i++){
            if (map.containsKey(i+1)) {
                arr[i] = map.get(i+1);
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n=5,p=5;
        int[] arr={2,3,2,3,5};
        frequencyCount(arr, n, p);
        for(int i : arr){
            System.out.print(i);
        }
    }
}
