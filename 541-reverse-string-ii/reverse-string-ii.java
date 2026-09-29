class Solution {
    public void reverse(char[]arr,int left,int right){
        while(left<=right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        char[]arr=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            if(n-i<k){
                reverse(arr,i,n-1);
                break;
            }
            else if(n-i>k && n-i<2*k){
                reverse(arr,i,i+k-1);
                break;
            }
            reverse(arr,i,i+k-1);
        }
        return new String(arr);
    }
}