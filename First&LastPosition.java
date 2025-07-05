public class Main
{
	public static void main(String[] args) {
	int arr[]={1,2,4,5,6,6,6,6,6,7,8,9};
	int target=6;
	int ans=first(arr,target);
	int ans2=second(arr,target);
	System.out.println(ans);
	System.out.print(ans2);
	}
	
	static int first(int arr[], int target){
	    int start=0;
	    int end =arr.length-1;
	    int index=-1;
	    
	    while(start<=end)
	    {
	        int mid=start+(end-start)/2;
	        
	        if(arr[mid]==target)
	        {
	            index=mid;
	            end=mid-1;
	        }
	        else if (arr[mid]>target)
	        {
	            end=mid-1;
	        }
	        else
	        {
	            start=mid+1;
	        }
	    }
	    return index;
	}
	
    static int second(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int index2=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target)
            {
                index2=mid;
                start=mid+1;
            }    
            else if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else
                    {
                      end=mid-1;
                    }
        }
     
     
       return index2;
    }
}
