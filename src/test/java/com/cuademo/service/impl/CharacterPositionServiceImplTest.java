package com.cuademo.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterPositionServiceImplTest {
	
	private CharacterPositionServiceImpl posService = new CharacterPositionServiceImpl();
	
	@Test
	public void testEncodeCharacter() {
		assertEquals("a+2", Character.valueOf('c'), posService.getEncodeCharacter('a', 2));
		assertEquals("A+2", Character.valueOf('C'), posService.getEncodeCharacter('A', 2));
		assertEquals("z+1", Character.valueOf('a'), posService.getEncodeCharacter('z', 1));
		assertEquals("Z+1", Character.valueOf('A'), posService.getEncodeCharacter('Z', 1));
	}	
	
	@Test
	public void testDecodeCharacter() {
		assertEquals("a-2", Character.valueOf('y'), posService.getDecodeCharacter('a', 2));
		assertEquals("A-2", Character.valueOf('Y'), posService.getDecodeCharacter('A', 2));
		assertEquals("z-1", Character.valueOf('y'), posService.getDecodeCharacter('z', 1));
		assertEquals("Z-1", Character.valueOf('Y'), posService.getDecodeCharacter('Z', 1));
	}
	
	@Test
	public void testNonAlphaCharacter() {
		assertEquals("@ character", Character.valueOf('@'), posService.getDecodeCharacter('@', 2));
		assertEquals(".", Character.valueOf('.'), posService.getDecodeCharacter('.', 2));
		assertEquals("1", Character.valueOf('1'), posService.getDecodeCharacter('1', 1));
		assertEquals("2", Character.valueOf('2'), posService.getDecodeCharacter('2', 3));
	}
}
