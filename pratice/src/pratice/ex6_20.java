package pratice;

public class ex6_20 {

	public static int[] shuffle(int arr[])
	{
		if(arr == null || arr.length == 0)
			return arr;
		
		for(int k=0; k<arr.length*2;k++)
		{
			int i = (int)(Math.random()*arr.length);
			int j = (int)(Math.random()*arr.length);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int result[] = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
