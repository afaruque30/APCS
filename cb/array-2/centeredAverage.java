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
  if ((nums.length)%2==1){
    return nums[nums.length/2];
  }
  else {
    return (nums[nums.length/2-1] + nums[nums.length/2]) / 2;
  }
}


public static void main(String[] args){
	System.out.println(centeredAverage([1,2,6]);
	System.out.println(centeredAverage([6,1,2]);
	System.out.println(centeredAverage([1,2,3]);
}
