package Advanced_DSA.Arrays;

public class Print_BoundaryOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        BoudaryValueMatrix(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }
    }
    public static void BoudaryValueMatrix(int arr[][])
    {
        int n=arr.length;
        int i=0;
        int j=0;
        for(int k=1;k<=n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            j++;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            i++;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            j--;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            i--;
        }
    }
}
