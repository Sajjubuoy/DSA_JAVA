public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target=1;
		int ans=binarysearch(arr,target);
		System.out.print("Index is:-"+ans+" "+"Number is:- "+arr[ans]);
	}
	
	static int binarysearch(int arr[],int target)
	{
	    int start=0;
	    int end=arr.length;
	    
	    while(start<=end)
	    {
	        int mid=start+(end-start)/2;
	        
	        if(target>arr[mid])
	        {
	            start=mid+1;
	        }
	        else if(target<arr[mid])
	        {
	            end=mid-1;
	        }
	        else
	        {
	            return mid;    
	        }
	    }
	    return -1;
	}
}
