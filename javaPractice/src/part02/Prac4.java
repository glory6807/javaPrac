package part02;

public class Prac4 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0; i <3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 10;
		arr1[2] = 10;
		for(int i = 0; i <3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i <3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i <3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i <3; i++) {
			System.out.println("arr1[" + i + "]" + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i <3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
		
	}//END main

}//END Prac4
