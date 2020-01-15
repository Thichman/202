package Tyson.Hichman;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("C:/Users/KH036s/Desktop/golf_scores.txt");
		
		Scanner scan = new Scanner(input);
		
		int kevinscore = 0;
		int beckyscore = 0;
		int count = 0;
		scan.nextLine();
		
		while (scan.hasNextLine()){
			count++;
			scan.nextLine();
			System.out.println(count);
		}
		
		scan = new Scanner(input);
		scan.nextLine();
		
		for (int i = 0; i < count; i++){
			scan.nextInt();
			scan.nextInt();
			kevinscore += scan.nextInt();
			beckyscore += scan.nextInt();
			
		}
		System.out.println("Kevins score is" + kevinscore);
		System.out.println("Beckys score is" + beckyscore);
		
		PrintWriter output = new PrintWriter("C:/Users/KH036s/Desktop/summary.txt");
		output.println("Kevins score is " + kevinscore);
		output.println("Beckys score is " + beckyscore);
		output.close();
		
	}

}
