package com.rakovets.java.io;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
	private Touchpad touch;
	private transient String videoCard;

	public Notebook(String name, int warranty, boolean updated, Touchpad touch, String videoCard) {
		super(name, warranty, updated);
		this.touch = touch;
		this.videoCard = videoCard;
	}

	public Touchpad getTouch() {
		return touch;
	}

	public String getVideoCard() {
		return videoCard;
	}

	@Override
	public String toString() {
		return String.format("Notebook:\n Name - %s\n Warranty - %d\n Updated - %s\n videoCard - %s\n " +
				"%s\n", getName(), getWarranty(), getUpdated(), getVideoCard(), touch);
	}
}

