import java.util.*;
public class BinarySearch{
    public static int binarysearch(int nums[],int key){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key){
                start = mid+1;
            }
           // else{
           //     end = mid-1;
          //  }
          if(nums[mid]>key){
            end = mid-1;
          }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key"    +binarysearch(nums,key));
    }
}