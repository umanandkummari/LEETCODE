package Arrays;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scn.nextInt();
        }
        int ans = maxArea(arr);
        System.out.println(ans);
    }
    public static  int maxArea(int[] arr){

        int left =0;
        int right= arr.length-1;
        int maxWater = Integer.MIN_VALUE;

        while( left < right ){
            int minHeight = Math.min(arr[left], arr[right]);
            int distane = right-left;
            int storedWater = minHeight*distane;

            maxWater = Math.max(maxWater, storedWater);

            if(arr[left] <= arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
