// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class centeredAverage{



public int centeredAverage(int[] nums) {
  while (!ordered(nums)){
  for(int i=0;i<nums.length-1;i++){
    if ((nums[i]>=nums[i+1]) && (nums[i]!=nums[i+1])){
      int temp = nums[i+1];
      nums[i+1]=nums[i];
      nums[i]=temp;
    }
  }
  }
 
  if ((nums.length)%2==1){
    return nums[nums.length/2];
  }
  else {
    return (nums[nums.length/2-1] + nums[nums.length/2]) / 2;
  }
}

public boolean ordered(int [] nums){
  for (int i=0;i<nums.length-1;i++){
    if (nums[i]>nums[i+1]) return false;
  }
  return true;
}

public static void main(String[] args) {
        System.out.println(centeredAverage(new int[] {1, 2, 3, 4, 100})); // 3
        System.out.println(centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7})); // 5
        System.out.println(centeredAverage(new int[] {-10, -4, -2, -4, -2, 0})); // -3
    }
