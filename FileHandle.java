package com.simplilearn.assessment;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileHandle {

	void fileNameDisp() {
		
		 // Scanner location = new Scanner(System.in); 
		 // System.out.println(" enter directory path  (Example: C:\\Users\\*)    ");
		 // String l=location.nextLine();
		 
		File fileDir = new File("C:\\Program Files");
		if (fileDir.isDirectory()) {
			List<String> listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting the file names in ascending order");
			System.out.println(" ");
			for (String s : listFile) {
				System.out.println("\t \t"+s);
			}
		} else {
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}
}
