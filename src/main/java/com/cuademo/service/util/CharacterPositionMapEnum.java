package com.cuademo.service.util;

import java.util.HashMap;
import java.util.Map;

public enum CharacterPositionMapEnum {
	INSTANCE;
	private Map<Character, Integer> lowercaseCharMap;
	private Map<Character, Integer> uppercaseCharMap;
	private Map<Integer, Character> lowercasePositionMap;
	private Map<Integer, Character> uppercasePositionMap;

	CharacterPositionMapEnum() {
		populateLowercaseCharacters();
		populateUppercaseCharacters();
	}

	public Map<Character, Integer> getLowercaseCharMap() {
		return lowercaseCharMap;
	}

	public Map<Character, Integer> getUppercaseCharMap() {
		return uppercaseCharMap;
	}

	public Map<Integer, Character> getLowercasePositionMap() {
		return lowercasePositionMap;
	}

	public Map<Integer, Character> getUppercasePositionMap() {
		return uppercasePositionMap;
	}

	private void populateLowercaseCharacters() {
		lowercaseCharMap = new HashMap<Character, Integer>();
		lowercasePositionMap = new HashMap<Integer, Character> ();
		
		int i = 0;
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			lowercaseCharMap.put(alphabet, i);
			lowercasePositionMap.put(i, alphabet);
			i++;
		}

	}

	private void populateUppercaseCharacters() {
		uppercaseCharMap = new HashMap<Character, Integer>();
		uppercasePositionMap = new HashMap<Integer, Character> ();
		int i = 0;
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
			uppercaseCharMap.put(alphabet, i);
			uppercasePositionMap.put(i, alphabet);
			i++;
		}

	}

}
