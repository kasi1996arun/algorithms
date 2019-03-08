import java.util.*;
class BubbleSort
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
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		boolean swapped;
		for(int i=0;i<n;i++)
		{
			swapped = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1]){
					swapped = true;
					swap(a,j,j+1);
				}
			}
			if(!swapped)
				break;
		}
		System.out.println("Sorted array : "+ Arrays.toString(a));
	}
}