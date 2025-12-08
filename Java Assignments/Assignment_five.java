class Assignment_five{
    public static void main(String args[]){
        int arr[] = {1,3,4,6,8,9,10};
        int start = 0 , end = arr.length-1;
        int target = 3,mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
    }
}