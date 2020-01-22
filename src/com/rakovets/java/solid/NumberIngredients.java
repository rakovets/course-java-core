package com.rakovets.java.solid;

import java.util.HashMap;
import java.util.Map;

public class NumberIngredients implements IngredientsName {
	private int tomatoes;
	private int dough;
	private int chickenFillet;
	private int bacon;
	private int mozzarella;
	private int beef;
	private int egg;
	private int cucumber;
	private int cheddar;
	private int parmesan;
	private int jugas;
	private int champignon;
	private int pepper;
	private int pepperoni;
	private int ham;
	Map<String, Integer> mapNumberIngredients = new HashMap<>();

	public NumberIngredients(int tomatoes, int dough, int chickenFillet, int bacon, int mozzarella, int beef, int egg,
	                         int cucumber, int cheddar, int parmesan, int jugas, int champignon, int pepper, int pepperoni,
	                         int ham) {
		this.tomatoes = tomatoes;
		this.dough = dough;
		this.chickenFillet = chickenFillet;
		this.bacon = bacon;
		this.mozzarella = mozzarella;
		this.beef = beef;
		this.egg = egg;
		this.cucumber = cucumber;
		this.cheddar = cheddar;
		this.parmesan = parmesan;
		this.jugas = jugas;
		this.champignon = champignon;
		this.pepper = pepper;
		this.pepperoni = pepperoni;
		this.ham = ham;
	}

	Map<String, Integer> mapNumberIngredients() {
		mapNumberIngredients.put(tomatoesName, getTomatoes());
		mapNumberIngredients.put(doughName, getDough());
		mapNumberIngredients.put(chickenFilletName, getChickenFillet());
		mapNumberIngredients.put(baconName, getBacon());
		mapNumberIngredients.put(mozzarellaName, getMozzarella());
		mapNumberIngredients.put(beefName, getBeef());
		mapNumberIngredients.put(eggName, getEgg());
		mapNumberIngredients.put(cucumberName, getCucumber());
		mapNumberIngredients.put(cheddarName, getCheddar());
		mapNumberIngredients.put(parmesanName, getParmesan());
		mapNumberIngredients.put(jugasName, getJugas());
		mapNumberIngredients.put(champignonName, getChampignon());
		mapNumberIngredients.put(pepperName, getPepper());
		mapNumberIngredients.put(pepperoniName, getPepperoni());
		mapNumberIngredients.put(hamName, getHam());
		return mapNumberIngredients;
	}

	void needIngredients() {
		for (Map.Entry<String, Integer> entry : mapNumberIngredients().entrySet()) {
			if (entry.getValue() <= 3) {
				System.out.printf("\nНеобходимо приобрести %s, остаток %d шт.", entry.getKey(), entry.getValue());
			}
		}
	}

	public int getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(int tomatoes) {
		this.tomatoes = this.tomatoes - tomatoes;
	}

	public int getDough() {
		return dough;
	}

	public void setDough(int dough) {
		this.dough = this.dough - dough;
	}

	public int getChickenFillet() {
		return chickenFillet;
	}

	public void setChickenFillet(int chickenFillet) {
		this.chickenFillet = this.chickenFillet - chickenFillet;
	}

	public int getBacon() {
		return bacon;
	}

	public void setBacon(int bacon) {
		this.bacon = this.bacon - bacon;
	}

	public int getMozzarella() {
		return mozzarella;
	}

	public void setMozzarella(int mozzarella) {
		this.mozzarella = this.mozzarella - mozzarella;
	}

	public int getBeef() {
		return beef;
	}

	public void setBeef(int beef) {
		this.beef = this.beef - beef;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = this.egg - egg;
	}

	public int getCucumber() {
		return cucumber;
	}

	public void setCucumber(int cucumber) {
		this.cucumber = this.cucumber - cucumber;
	}

	public int getCheddar() {
		return cheddar;
	}

	public void setCheddar(int cheddar) {
		this.cheddar = this.cheddar - cheddar;
	}

	public int getParmesan() {
		return parmesan;
	}

	public void setParmesan(int parmesan) {
		this.parmesan = this.parmesan - parmesan;
	}

	public int getJugas() {
		return jugas;
	}

	public void setJugas(int jugas) {
		this.jugas = this.jugas - jugas;
	}

	public int getChampignon() {
		return champignon;
	}

	public void setChampignon(int champignon) {
		this.champignon = this.champignon - champignon;
	}

	public int getPepper() {
		return pepper;
	}

	public void setPepper(int pepper) {
		this.pepper = this.pepper - pepper;
	}

	public int getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(int pepperoni) {
		this.pepperoni = this.pepperoni - pepperoni;
	}

	public int getHam() {
		return ham;
	}

	public void setHam(int ham) {
		this.ham = this.ham - ham;
	}
}
