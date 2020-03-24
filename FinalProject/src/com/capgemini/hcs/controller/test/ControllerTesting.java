package com.capgemini.hcs.controller.test;

import com.capgemini.hcs.controller.MainController;

public class ControllerTesting {
	MainController mainController = new MainController();

	public boolean validChoice(int choice) {
		boolean result = false;
		if (choice == 1 || choice == 2) {
			result = true;
		}
		return result;
	}

	public boolean validSubChoice(int choice) {
		boolean result = false;
		if (choice == 1 || choice == 2 || choice == 3) {
			result = true;
		}
		return result;
	}

}
