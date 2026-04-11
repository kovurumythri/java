package example;

public class Example1 {
	public static int sub1=85,sub2=90,sub=80;
	private static int sub3;
	public static void totalmarks() {
		System.out.println("total marks="+ (sub1+sub2+sub3));
	}
	public static void averagemarks() {
		int avg=(sub1+sub2+sub3)/2;
		System.out.println("average marks="+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalmarks();
		averagemarks();

	}

}
