package com.rakovets.course.challenge.generics;

/**
 * Создать класс Pair, параметризованный двумя параметрами K и V:
 * хранить две переменные типов K и V соответственно
 * иметь конструктор, принимающий 2 параметра типов K и V
 * соответствующие геттеры/сеттеры
 */

public class Pair<K, V> {
	K black;
	V white;

	public Pair(K black, V white) {
		this.black = black;
		this.white = white;
	}

	public K getBlack() {
		return black;
	}

	public void setBlack(K black) {
		this.black = black;
	}

	public V getWhite() {
		return white;
	}

	public void setWhite(V white) {
		this.white = white;
	}
}
