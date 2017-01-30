package com.cuademo.service.impl;

import org.springframework.stereotype.Service;

import com.cuademo.service.CharacterPositionService;
import com.cuademo.service.util.CharacterPositionMapEnum;

@Service
public class CharacterPositionServiceImpl implements CharacterPositionService {
	
	private final static int MAX=25;
	private final static int ZERO=0;	
	
	public Character getEncodeCharacter(final Character c, final int offset) {			
		if(Character.isAlphabetic(c)){
			if(Character.isLowerCase(c)) return getLowercaseEncodeCharacter(c, offset);
			return getUppercaseEncodeCharacter(c, offset);
		}
		return c;
	}
	

	public Character getDecodeCharacter(Character c, int offset) {
		if(Character.isAlphabetic(c)){
			if(Character.isLowerCase(c)) return getLowercaseDecodeCharacter(c, offset);
			return getUppercaseDecodeCharacter(c, offset);
		}
		return c;
	}
	
	
	
	private Character getLowercaseEncodeCharacter(final Character c, final int offset) {		
		final int position = CharacterPositionMapEnum.INSTANCE
				.getLowercaseCharMap().get(c);
		if (position + offset > MAX) {
			return CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap()
					.get((MAX - position) + offset - 1);
		}
		return CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(
				position + offset);
	}

	private Character getLowercaseDecodeCharacter(final Character c, final int offset) {		
		final int position = CharacterPositionMapEnum.INSTANCE.getLowercaseCharMap().get(c);
		if(position-offset<ZERO){
			return CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(MAX-(offset-position-1));
		}		
		return CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(position - offset);
	}
	
	private Character getUppercaseDecodeCharacter(final Character c, final int offset) {		
		final int position = CharacterPositionMapEnum.INSTANCE.getUppercaseCharMap().get(c);
		if(position-offset<ZERO){
			return CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(MAX-(offset-position-1));
		}		
		return CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(position - offset);
	}
	
	private Character getUppercaseEncodeCharacter(final Character c, final int offset) {		
		final int position = CharacterPositionMapEnum.INSTANCE.getUppercaseCharMap().get(c);
		if(position+offset>MAX){
			return CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get((MAX-position) + offset -1);
		}		
		return CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(position + offset);
	}


}
