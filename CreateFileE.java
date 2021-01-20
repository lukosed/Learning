package com.simplilearn.assessment;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class CreateFileE {
	@SuppressWarnings("resource")
	protected void fileCreate() {
		String paath = "C:\\Users\\jyothis.ulahannan\\Desktop\\vava";
		System.out.println(" ");
		System.out.print("Enter the file name: ");
		Scanner sc = new Scanner(System.in); // object of Scanner class
		String x = sc.nextLine();
		if(!x.startsWith("\\")) x = "\\" + x;
		Path path = Paths.get(paath + x);
		try {
				Path p = Files.createFile(path); // creates file at specified location
				System.out.println("File Created at Path: " + p);
			} catch(IOException e) {
				System.out.println(" ");
				System.out.println("File exists");
				System.out.println(" ");
				System.out.println("enter a different name");
				fileCreate();
			} 
	}
}
