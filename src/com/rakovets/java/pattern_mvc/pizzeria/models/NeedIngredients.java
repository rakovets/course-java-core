package com.rakovets.java.pattern_mvc.pizzeria.models;

import java.util.HashMap;
import java.util.Map;

public class NeedIngredients {

	public Map<String, Integer> needIngredients(Map<String, Integer> numberIngredients) {
		Map<String, Integer> mapNeedIngredients = new HashMap<>();
		for (Map.Entry<String, Integer> entry : numberIngredients.entrySet()) {
			if (entry.getValue() < 10) {
				mapNeedIngredients.put(entry.getKey(), entry.getValue());
			}
		}
		return mapNeedIngredients;
	}
}