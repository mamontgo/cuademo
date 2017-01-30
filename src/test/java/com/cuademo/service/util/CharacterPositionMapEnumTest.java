package com.cuademo.service.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CharacterPositionMapEnumTest {

	@Test 
	public void testLowerPositions() {		
		assertEquals("lowercase a position correct", Character.valueOf('a'), CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(0));
		assertEquals("lowercase c position correct", Character.valueOf('c'), CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(2));		
		assertEquals("lowercase z position correct", Character.valueOf('z'), CharacterPositionMapEnum.INSTANCE.getLowercasePositionMap().get(25));
	}
	
	@Test 
	public void testLowerCharacters() {		
		assertEquals("lowercase a char", Integer.valueOf(0), CharacterPositionMapEnum.INSTANCE.getLowercaseCharMap().get('a'));
		assertEquals("lowercase c char", Integer.valueOf(2), CharacterPositionMapEnum.INSTANCE.getLowercaseCharMap().get('c'));
		assertEquals("lowercase z char", Integer.valueOf(25), CharacterPositionMapEnum.INSTANCE.getLowercaseCharMap().get('z'));		
	}
	
	@Test 
	public void testUpperCharacters() {		
		assertEquals("lowercase A char", Integer.valueOf(0), CharacterPositionMapEnum.INSTANCE.getUppercaseCharMap().get('A'));
		assertEquals("lowercase C char", Integer.valueOf(2), CharacterPositionMapEnum.INSTANCE.getUppercaseCharMap().get('C'));
		assertEquals("lowercase Z char", Integer.valueOf(25), CharacterPositionMapEnum.INSTANCE.getUppercaseCharMap().get('Z'));		
	}

	@Test 
	public void testUpperPositions() {		
		assertEquals("uppercase A position correct", Character.valueOf('A'), CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(0));
		assertEquals("uppercase C position correct", Character.valueOf('C'), CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(2));		
		assertEquals("uppercase Z position correct", Character.valueOf('Z'), CharacterPositionMapEnum.INSTANCE.getUppercasePositionMap().get(25));
	}

}
