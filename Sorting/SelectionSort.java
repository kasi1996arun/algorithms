import java.util.Scanner;
import java.util.Arrays;
class SelectionSort
{
	public static void swap(int[] a, int x, int y)
	{
		int t1 = a[x];
		int t2 = a[y];
		a[x] = t2;
		a[y] = t1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int minIndex = i;
			int j = i+1;
			for(int k=j;k<n;k++)
			{
				if (a[minIndex]>a[k]) {
					minIndex = k;
				}
			}
			swap(a, minIndex, i);
		}
		System.out.print(Arrays.toString(a));
	}
}