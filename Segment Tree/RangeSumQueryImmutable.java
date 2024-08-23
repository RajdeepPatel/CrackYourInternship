import java.util.ArrayList;

class RangeSumQueryImmutable{
    int[] nums;
    public RangeSumQueryImmutable(int[] nums) {
      for(int i=1;i<nums.length;i++){
        nums[i] += nums[i-1];
      } 
      this.nums  = nums;
    }
  
    public int sumRange(int left, int right) {
      if(left == 0){
        return nums[right];
      }else{
        return nums[right] - nums[left-1];
       }
    }


    public static void main(String[] args) {
    int[] num = { -2, 0, 3, -5, 2, -1 };
    ArrayList<Integer> list = new ArrayList<>();
    RangeSumQueryImmutable sRangeSumQuery = new RangeSumQueryImmutable(num);
    list.add(sRangeSumQuery.sumRange(0, 2));
    list.add(sRangeSumQuery.sumRange(2, 5));
    list.add(sRangeSumQuery.sumRange(0, 5));
    System.out.println(list);    
    }
}