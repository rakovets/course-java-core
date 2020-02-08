package com.rakovets.java.pattern_mvc.pizzeria.database;

public enum IngredientsNames {
	TOMATOES("Помидоры"),
	CHICKEN("Куриное филе"),
	BACON("Бекон"),
	MOZZARELLA("Моцарелла"),
	BEEF("Фарш из говядины"),
	EGG("Яйцо"),
	CUCUMBER("Огурцы марнованые"),
	CHEDDAR("Чеддер"),
	PARMESAN("Пармезан"),
	JUGAS("Джюгас"),
	CHAMPIGNON("Шампиньоны"),
	PEPPER("Перец"),
	PEPPERONI("Колбаса пепперони"),
	HAM("Ветчина"),
	DOUGH("Тесто"),
	DOUGHTHIN("Тонкое тесто"),
	DOUGHTHICK("Толстое тесто"),
	WITHSIDE("С бортом"),
	NOSIDE("Без борта");

	private String ingredient;

	IngredientsNames(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getIngredient() {
		return ingredient;
	}
}