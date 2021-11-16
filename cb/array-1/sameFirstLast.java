// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW28: PPMP
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class sameFirstLast{



public boolean sameFirstLast(int[] nums) {
  if (nums.length==0){
    return false;
  }
    if(nums[0]== nums[nums.length-1]){
    return true;
  }
  return false;
}


public static void main(String[] args){
	System.out.println(sameFirstLast([1,2,6]);
	System.out.println(sameFirstLast([6,1,6]);
	System.out.println(sameFirstLast([]);
}
