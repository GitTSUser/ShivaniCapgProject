package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.capgemini.hcs.exception.InvalidChoiceException;

public class MainController {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ChoiceController choiceController = new ChoiceController();
		try {
			Boolean outerExit = false;
			do {
				System.out.println("*******************Welcome to Health Care System*****************");
				System.out.println();
				System.out.println("Enter 1 for Admin");
				System.out.println("Enter 2 for Exit");
				char ch = br.readLine().charAt(0);
				switch (ch) {
				case '1':
					choiceController.healthSystem();
					break;
				case '2':
					System.out.println("-----------EXIT------------");
					System.out.println("Exiting From The System \nThankyou.");
					outerExit = true;
					break;
				default:
					throw new InvalidChoiceException();
				}
			} while (!outerExit);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}