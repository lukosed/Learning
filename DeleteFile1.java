package com.simplilearn.assessment;

import java.io.IOException; 
import java.nio.file.*; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFile1 {
	@SuppressWarnings("resource")
	protected void delteFile()
    { 
        try
        { 
        	String pp="C:\\Users\\jyothis.ulahannan\\Desktop\\vava";
        	System.out.println("enter file name to delete");
        	
        	Scanner sc = new Scanner(System.in);
        	String x = sc.nextLine();
        	
        	if(!x.startsWith("\\")) x = "\\" + x;
            boolean deleted = Files.deleteIfExists(Paths.get(pp+x)); 
            if (deleted) {
            	System.out.println(x+"   file deleted");
            } else {
            	System.out.println(x+"   file doesn't exist");
            }
        } catch(NoSuchFileException e) { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) { 
            System.out.println("Invalid permissions."); 
        }
    } 	
} 