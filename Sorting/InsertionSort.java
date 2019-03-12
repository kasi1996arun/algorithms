import java.util.*;
class InsertionSort
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		for(int i=1;i<n;i++)
		{
			int curr = a[i];
			int j= i-1;
			while(j>=0)
			{
				if(curr >= a[j])
				{
					break;
				}
				a[j+1] = a[j]; 
				j--;
			}
			// System.out.println(Arrays.toString(a));
			a[j+1] = curr;
		}
		System.out.println(Arrays.toString(a));
	}
}