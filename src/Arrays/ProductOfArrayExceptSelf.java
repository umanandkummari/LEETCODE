package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         arr = productExceptSelf(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] productExceptSelf(int[] nums) {
          if(nums.length==0){
              return nums;
          }
          int[] ansArr = new int[nums.length];

          int rp =1;
          //left pass
          for(int i=0; i<nums.length; i++){
              ansArr[i] =rp;
              rp =rp*nums[i];
          }

          rp =1;
          // right pass
          for(int i= nums.length-1; i>=0; i--){
              ansArr[i] = ansArr[i]*rp;
              rp = rp*nums[i];
          }
          return ansArr;
    }
}
