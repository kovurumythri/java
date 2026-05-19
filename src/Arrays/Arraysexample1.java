package Arrays;

public class Arraysexample1 {
	public static void main(String[]args) {
		int[]arr=new int[5];
		System.out.println("zero index value:"+arr[0]);
		System.out.println("first index value:"+arr[1]);
		System.out.println("second index value:"+arr[2]);
		System.out.println("thirdd index value:"+arr[3]);
		System.out.println("fourth index value:"+arr[4]);
		
		System.out.println("---------------------");
		arr[0]=34;
		arr[4]=43;
		
		System.out.println("zero index value:"+arr[0]);
		System.out.println("first index value:"+arr[1]);
		System.out.println("second index value:"+arr[2]);
		System.out.println("third index value:"+arr[3]);
		System.out.println("fourth index value:"+arr[4]);
		System.out.println("---------------------");
		System.out.println(arr.length);
		
		
		
		
	}

}
