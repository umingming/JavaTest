package com.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EditDataFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\u_011\\git\\DragonLand\\DragonLand\\data\\고객의소리.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
			int num = 0;
			String line = null;
			while ((line = reader.readLine()) != null) {
				num++;
				String[] temp = line.split("■");
				temp[0] = String.format("W%4d%n", num);
				line = temp[0] + "■" + temp[1] + "■" + temp[2];
				writer.write(line);
			}
			writer.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
