package dsa.arrays;
//You are given an array of integers ARR[] of size N consisting of zeros and ones.
// You have to select a subset and flip bits of that subset.
// You have to return the count of maximum one's that you can obtain by flipping
// chosen sub-array at most once.
//A flip operation is one in which you turn 1 into 0 and 0 into 1.

public class flipbits {
    public static void main(String[] args) {
    int arr[] = {1,0,0,1,1,0};
    int sum = 0;
    int max = 0;
    int count1=0;

    for(int i = 0 ; i<arr.length; i++)
    {
        if (arr[i]==1)
        {
            arr[i]=-1;
            count1++;
        }
        if(arr[i]==0)
        {
            arr[i]=1;
        }
        sum = sum + arr[i];
        max = Math.max(sum, max);
        if (sum < 0)
        {
            sum = 0 ;
        }
        if (max < 0)
        {
            max = 0;
        }


    }
        System.out.println(max+count1);

    }
}
