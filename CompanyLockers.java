package com.simplilearn.assessment;

import java.io.IOException;
import java.util.Scanner;

public class CompanyLockers {
	Scanner scan = null;

	private void mainMenu() throws IOException {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"===================Welcome to Company Lockers Pvt Ltd==========================================");
		System.out.println("");
		System.out.println("                    				Developer: Dileep Lukose");
		mainMenuDisplay();
	}

	private void mainMenuDisplay() throws IOException {
		System.out.println("");
		System.out.println("		Please select the corresponding number from the following OPTIONS");
		System.out.println("");
		System.out.println("		1. Display files in Ascending order from C:\\Program Files ");
		System.out.println("		2. File Operations");
		System.out.println("		3. Close the Application ");
		System.out.println(" ");
		
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
			case 1:
				FileHandle fileSort = new FileHandle();
				fileSort.fileNameDisp();
				mainMenuDisplay();
			case 2:
				subDisplay();
			case 3:
				exitpgm();
			default:
				System.out.println(" ");
				System.out.println(" ");
				warning();
				mainMenuDisplay();
			}
		} else warning();
	}

	private void subDisplay() throws IOException {
		System.out.println(" ");
		System.out.println("	Select from the following Options");
		System.out.println("	1. Add File to Root Directory");
		System.out.println("	2. Delete a File ");
		// user specified file FNF return if not found

		System.out.println("	3. Search a file from Directory");
		// display result
		System.out.println("	4. Go to Main Menu");
		System.out.println(" ");
		
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
				case 1:
					CreateFileE createFile = new CreateFileE();
					createFile.fileCreate();
					subDisplay();
				case 2:
					DeleteFile1 deleteFile = new DeleteFile1();
					deleteFile.delteFile();
					subDisplay();
				case 3:
					FileSearch searchF = new FileSearch();
					searchF.fileSearch();
					subDisplay();
				case 4:
					mainMenuDisplay();
				default:
					warning();
			}
		} else warning();
	}

	private void exitpgm() {
		System.out.println(" ");
		System.out.println("			Thank you for using the service!!!");
		java.lang.System.exit(0);
	}

	private void warning() throws IOException {
		System.out.println("<<<<<<<<<<Invalid Selection>>>>>>>>>>>>>");
		System.out.println("----------Please TRY AGAIN------------");
		mainMenuDisplay();
	}

	public static void main(String[] args) throws IOException {
		CompanyLockers disp = new CompanyLockers();
		disp.mainMenu();
	}
}
