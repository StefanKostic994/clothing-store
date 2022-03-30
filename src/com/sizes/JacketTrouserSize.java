package com.sizes;

public enum JacketTrouserSize {

	FORTY_TWO("42"), FORTY_FOUR("44"), FORTY_SIX("46"), FORTY_EIGHT("48"), FIFTY("50"), FIFTY_TWO("52"),
	FIFTY_FOUR("54"), FIFTY_SIX("56"), FIFTY_EIGHT("58"), SIXTY("60"), SIXTY_TWO("62"), SIXTY_FOUR("64"),
	SIXTY_SIX("66");

	private final String text;

	JacketTrouserSize(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
