//BackTracking on array
import java.util.*;
public class Backtracking{
    public static void changearr(int arr[],int i,int val){
        if(i==arr.length-1){
           printarr(arr);
            return;
       }
        arr[i] = val;
        changearr(arr,i+1,val+1);//function call
        arr[i] = arr[i]-2;//Backtracking step 
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        changearr(arr,0,1);
        printarr(arr);
    }
}