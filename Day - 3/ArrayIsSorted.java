import java.util.*;
public class ArrayIsSorted {

  public static void arrayIsSorted(int[] arr, int n)
  {

    int flag = 0;
    for (int i = 0;i<arr.length;i++) {
      if(arr[i] > arr[i+1]) {
        flag = 1;
      }
    }
    if(flag == 0){
      System.out.println("Sorted");
    } else {
      System.out.println("Not Sorted");
    }

  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] arr=new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    arrayIsSorted(arr, n);
    for(int i: arr)
    {
      System.out.println(i);
    }
  }
}

