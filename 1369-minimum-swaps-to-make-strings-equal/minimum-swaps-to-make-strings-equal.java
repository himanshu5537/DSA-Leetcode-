class Solution {
    public int minimumSwap(String s1, String s2) {
        int count1=0;
        int count2=0;
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)=='x' && s2.charAt(i)=='y') count1++; 
            else if(s1.charAt(i)=='y' && s2.charAt(i)=='x') count2++;
        }
        if((count1+count2)%2==1) return -1;
        else if((count1)%2==0 && (count2)%2==0) return ((count1)/2 + (count2)/2);
        else{
          return (2 + (count1)/2 + (count2)/2);
        }
    }
}