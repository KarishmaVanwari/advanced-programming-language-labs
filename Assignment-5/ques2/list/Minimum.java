package list;


import java.math.*;
public class Minimum {
    public int min_is(int a[],int n)
    {
        int minNo = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            minNo = Math.min(minNo, a[i]);
        }
            return minNo;

    }
}
