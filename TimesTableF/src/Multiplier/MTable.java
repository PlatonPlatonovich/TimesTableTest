
package Multiplier;
import java.util.Scanner;

public class MTable {
	
	int firstmult, secondmult;
	
	static int[][] mtable = new int[][]{
		{0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
		{0, 1,  2,  3,  4,  5,  6,  7,  8,  9,  10},
		{0, 2,  4,  6,  8,  10, 12, 14, 16, 18, 20},
		{0, 3,  6,  9,  12, 15, 18, 21, 24, 27, 30},
		{0, 4,  8,  12, 16, 20, 24, 28, 32, 36, 40},
		{0, 5,  10, 15, 20, 25, 30, 35, 40, 45, 50},
		{0, 6,  12, 18, 24, 30, 36, 42, 48, 54, 60},
		{0, 7,  14, 21, 28, 35, 42, 49, 56, 63, 70},
		{0, 8,  16, 24, 32, 40, 48, 56, 64, 72, 80},
		{0, 9,  18, 27, 36, 45, 54, 63, 72, 81, 90},
		{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
	};

	public int getFirstmult (){
		return firstmult;
	 	}
	public int getSecondmult (){
		return secondmult;
		}
	 public void setFirstmult (int firstmult){
		this.firstmult = firstmult;
	 	}
	 public void setSecondmult (int secondmult){
		this.secondmult = secondmult;
	 	}
	 
	 public static int getMultResult (int a, int b){
		 int res = mtable[a][b];
		 return res;
	 }
	 
	 public static void getTableForLearning (int a){
		 for (int b=0; b<=10; b++) {
			 int res = getMultResult (a, b);
			 System.out.println(a+" * "+b+" = "+res);
		 }
	 }
	 
	 public static void getRandomMult(){
		int a = (int)(Math.random() * 11);
		int b = (int)(Math.random() * 11);		 
		int res = getMultResult (a, b);
		System.out.println(a+" * "+b+" = "+res);
	 }
	 
	 public static void checkRandomMult(){
		int a = (int)(Math.random() * 11);
		int b = (int)(Math.random() * 11);		 
		int res = getMultResult (a, b);
		System.out.println(a+" * "+b+" = ");
		System.out.println(res +" "+ (res-1) + " " + (res+1));
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter answer");
		int userres = keyboard.nextInt();
		while (userres != res){
			System.out.println("Wrong! Try again");
			System.out.println("Please, enter answer");
			userres = keyboard.nextInt();
		}
			System.out.println("Right");
	 }
	 
	 public static void checkMult(){
			int a = (int)(Math.random() * 11);
			int b = (int)(Math.random() * 11);		 
			int res = getMultResult (a, b);
			System.out.println(a+" * "+b+" = ");
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please, enter answer");
			int userres = keyboard.nextInt();
			while (userres != res){
				System.out.println("Wrong! Try again");
				System.out.println("Please, enter answer");
				userres = keyboard.nextInt();
			}
				System.out.println("Right");
		 }
	 
	 public static void findFirstMultiplier(){
			int a = (int)(Math.random() * 11);
			int b = (int)(Math.random() * 11);		 
			int res = getMultResult (a, b);
			System.out.println(" x "+" * "+b+" = " + res);
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please, enter answer");
			int userres = keyboard.nextInt();
			while (userres != a){
				System.out.println("Wrong! Try again");
				System.out.println("Please, enter answer");
				userres = keyboard.nextInt();
			}
				System.out.println("Right");
		 }

	 public static void findSecondMultiplier(){
			int a = (int)(Math.random() * 11);
			int b = (int)(Math.random() * 11);		 
			int res = getMultResult (a, b);
			System.out.println(a +" * "+"x"+" = " + res);
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please, enter answer");
			int userres = keyboard.nextInt();
			while (userres != b){
				System.out.println("Wrong! Try again");
				System.out.println("Please, enter answer");
				userres = keyboard.nextInt();
			}
				System.out.println("Right");
		 }
}

