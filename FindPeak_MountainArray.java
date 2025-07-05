public class Main
{
	public static void main(String[] args) {
	int arr[]={1,2,4,5,6,6,6,6,6,7,8,9,10,44,33,22,11,10,9,8,7,6};

	int ans=peak(arr);
	System.out.print(arr[ans]);
}
    static int peak(int arr[]){
        int start=0;
        int end=arr.length-1;
       
        
        while(start<end)
        {
             int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
        }
        return start;
    }
}
