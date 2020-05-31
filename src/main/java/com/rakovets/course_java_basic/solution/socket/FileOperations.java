package main.java.com.rakovets.course_java_basic.solution.socket;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public String listFiles(String filePath) {
		String message = "List of files:";
		File dir = new File(filePath);
		if (dir.isDirectory()) {
			for (File item : dir.listFiles()) {
				message += "\n" + item.getName();
			}
		} else {
			message = "FILES NOT EXIST";
		}
		return message;
	}

	public String returnFile(String filePath) {
		File dir = new File(filePath);
		if (dir.exists()) {
			int index = filePath.lastIndexOf("\\");
			return "Return: " + filePath.substring(index + 1);
		} else {
			return "FILE NOT EXIST";
		}
	}

	public String createNewFile(String filePath) {
		File newFile = new File(filePath);
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				System.out.println("IOException: " + e);
			}
			int index = filePath.lastIndexOf("\\");
			return  "OK. File " + filePath.substring(index + 1)+ " created";
		} else {
			return  "FILE EXIST";
		}
	}

	public String deleteFile(String filePath) {
		File deleteFile = new File(filePath);
		boolean deleted = deleteFile.delete();
		if (deleted) {
			int index = filePath.lastIndexOf("\\");
			return  "OK. File " + filePath.substring(index + 1)+ " deleted";
		} else {
			return  "FILE NOT EXIST";
		}
	}
}