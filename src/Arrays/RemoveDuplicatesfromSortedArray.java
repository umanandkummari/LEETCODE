package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int ans =deleteDummy(nums);
        System.out.print(ans);
    }
    public static int deleteDummy(int[] nums) {

        int count=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[count] = nums[i+1];
                count++;
            }
        }
        return count;
    }
}
