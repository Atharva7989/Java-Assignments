import java.util.*;
class Assignment_three{
    public static void main(String args[]){
        int arr[] = {2,3,1,5};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
        
    }
}