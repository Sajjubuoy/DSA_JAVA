public class Main
{
	public static void main(String[] args) {
	char arr[]={'c','d','f','i','k','p'};
	char target='q';
	char ans=CharNumber(arr,target);
	System.out.print(ans);
	}
	
	static char CharNumber(char arr[],char target){
	    int start=0;
	    int end=arr.length-1;
	    
	    while(start<=end)
	    {
	        int mid=start+(end-end)/2;
	        
	        if(target<arr[mid])
	        {
	            end=mid-1;
	        }
	        else 
	        {
	            start=mid+1;     
	        }
	       
	    }
	    return arr[start%arr.length];
	}
}
