package com.project.admin;

import java.io.BufferedReader;
import java.io.FileReader;

public class Check {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("data\\user.dat"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
