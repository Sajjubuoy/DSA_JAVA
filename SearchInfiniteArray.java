public class Main
{
	public static void main(String[] args) {
	int arr[]={1,2,4,5,6,6,6,6,6,7,8,9,10,44,55,66,77,88,99,200,400,500,600,700,800,900};
	int target=500;
	int ans=find(arr,target);
	System.out.print(ans);
}

    static int find(int arr[],int target){
        int start=0;
        int end=1;
        
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr, start, end,target);
    }       
            
    static int binarySearch(int arr[],int start,int end,int target){
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else if(arr[mid]>target)
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
