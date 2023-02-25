package Arrays;

import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scn.nextInt();
        }
        arr = sortArrayByParity(arr);
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums){

        int left=0;
        int right = nums.length-1;

        while(left< right){
            if(nums[left]%2!=0 ){
                int tem = nums[left];
                nums[left] =nums[right];
                nums[right] = tem;

                right--;
            }else{
                left++;
            }
        }
        return nums;
    }
}
