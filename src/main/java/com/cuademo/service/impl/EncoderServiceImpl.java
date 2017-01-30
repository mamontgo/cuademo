package com.cuademo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuademo.service.CharacterPositionService;
import com.cuademo.service.EncoderService;

/**
 * 
 * Spring Service String Encoder Implementation
 * 
 * @author Mark Montgomery
 *
 */
@Service
public class EncoderServiceImpl implements EncoderService {

	@Autowired
	private CharacterPositionService postionService;

	/**
	 * • Accept a word in String parameter source • For each letter in the word:
	 * o Determine the position of the letter relative to the end of the word
	 * e.g. in 'Encode', 'E' is in position 6, 'n' is in position 5, etc. o
	 * Shift the letter forward by x letters, where x is the position of the
	 * letter determined above. e.g. in 'Encode', 'E' becomes 'K', 'n' becomes
	 * 's', etc. If you get to Z/z, start at A/a. • Return the result
	 * 
	 * @param source
	 *            the string to be encoded
	 * @return encoded String
	 */
	public String encode(final String source) {
		final int length = source.length();
		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < length; i++) {
			final int offset = (length - i);
			result.append(postionService.getEncodeCharacter(source.charAt(i),
					offset));
		}
		return result.toString();
	}

}
