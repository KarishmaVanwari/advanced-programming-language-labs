package list;

public class Sum {
    public int array_sum(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}
