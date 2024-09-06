//https://leetcode.com/problems/longest-consecutive-sequence/
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numset=new HashSet<>();
        for(int num: nums){
            numset.add(num);
        }
        int longest=0;

        for(int num:nums){
            if(!numset.contains(num-1)){
                int length=1;

                while(numset.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
