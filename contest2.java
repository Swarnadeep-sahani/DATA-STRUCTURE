import java.util.*;
class contest2 {
    public static int minimum_difference(int n, String[] words) {
        int sum=0,pos=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for (int j = i+1; j < n-1; j++) {
                for (int j2 = 0; j2 < words[i].length(); j2++) {
                    pos=Math.abs(words[i].charAt(j2)-words[j].charAt(j2));
                    sum+=pos;
                }
            }
            if(sum>ans) ans=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        String []words={"ab","ab","ab"};
       int data= minimum_difference( 5,words);
       System.out.println(data);
    }
}
