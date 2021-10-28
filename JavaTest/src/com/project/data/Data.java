package com.project.data;

import java.util.Scanner;

public interface Data {
	public static final Scanner scan = new Scanner(System.in);;
	void save() throws Exception;
	void load() throws Exception;
	void add() throws Exception;
}
