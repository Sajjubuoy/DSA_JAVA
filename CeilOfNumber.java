public class Main
{
	public static void main(String[] args) {
	int arr[]={2,5,8,9,14,66,89,100};
	int target=67;
	int ans=CeilNumber(arr,target);
	System.out.print("Index:-"+ans);
	}
	
	static int CeilNumber(int arr[],int target){
	    int start=0;
	    int end=arr.length;
	    
	    while(start<=end)
	    {
	        int mid=start+(end-end)/2;
	        
	        if(target<arr[mid])
	        {
	            end=mid-1;
	        }
	        else if(target>arr[mid])
	        {
	            start=mid+1;     
	        }
	        else
	        {
	            return mid;    
	        }
	    }
	    return start;
	}
}
