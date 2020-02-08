package com.rakovets.java.pattern_mvc.pizzeria;

import com.rakovets.java.pattern_mvc.pizzeria.controllers.Controller;

public class PizzeriaApplicationStarter {
	public static void main(String[] args) {
		new Controller().pizzeriaRunController();
	}
}