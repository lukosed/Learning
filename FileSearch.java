package com.simplilearn.assessment;

import java.io.*;
import java.util.*;

public class FileSearch {
	@SuppressWarnings("resource")
	protected void fileSearch() throws IOException {
		FileSearch fs = new FileSearch();
		System.out.println("Enter the file to be searched.. ");
		Scanner scan = new Scanner(System.in);
        String name= scan.nextLine();
		System.out.println("Name of the file: "+name);
		fs.findFile(name, new File("C:\\Users\\jyothis.ulahannan\\Desktop\\vava"));
	}

	private void findFile(String name, File file1) throws IOException {
		boolean filePresent = false;
		File[] list = file1.listFiles();
		if (list != null) {
			for (File file2 : list) {
				String loc = null;
				if(!name.startsWith("\\")) loc = file1 +"\\"+ name;
				File finaLoc = new File(loc);
				if ((finaLoc.compareTo(file2)) == 0) {
					filePresent = true;
					System.out.println("File Found");
					break;
				} 
			}
			if (!filePresent)
				System.out.println("File not Found");
		}
	}
}
