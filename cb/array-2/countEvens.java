// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class countEvens{



public int countEvens(int[] nums) {
  int evens = 0;
  for(int i=0;i<nums.length;i++) {
    if (nums[i]%2==0){
      evens=evens+1;
    }
  }
  return evens;
}

public static void main(String[] args){
	System.out.println(countEvens([1,2,6]);
	System.out.println(countEvens([6,1,2]);
	System.out.println(countEvens([1,2,3]);
}
