package com.sizes;

public enum ShoesSize {

	THIRTY_NINE("39"), FORTY("40"), FORTY_ONE("41"), FORTY_TWO("42"), FORTY_THREE("43"), FORTY_FOUR("44"),
	FORTY_FIVE("45"), FORTY_SIX("46");

	private final String text;

	ShoesSize(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
