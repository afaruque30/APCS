// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class bigDiff{



public int bigDiff(int[] nums) {
  int big = 0;
  int small = 10;
  if (nums.length == 1) return 0;
  for(int i = 0; i < nums.length-1; i++){
    if (Math.max(nums[i],nums[i+1]) > big){
      big = (Math.max(nums[i],nums[i+1]));
    }
    if (Math.min(nums[i],nums[i+1]) < small){
      small = (Math.min(nums[i],nums[i+1]));
    }
  }
  return big-small;
}


public static void main(String[] args){
	System.out.println(bigDiff([1,2,6]);
	System.out.println(bigDiff([6,1,2]);
	System.out.println(bigDiff([1,2,3]);
}
