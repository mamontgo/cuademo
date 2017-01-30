package com.cuademo.service;

public interface CharacterPositionService {	
	Character getEncodeCharacter(final Character c, final int offset);
	Character getDecodeCharacter(final Character c, final int offset);
}
