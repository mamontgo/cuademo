package com.cuademo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuademo.service.CharacterPositionService;
import com.cuademo.service.DecoderService;

/**
 * 
 * String Decoder Implementation
 * 
 * @author Mark Montgomery
 *
 */
@Service
public class DecoderServiceImpl implements DecoderService {

	@Autowired
	private CharacterPositionService postionService;
	
	/**
	 * Accept a word that has been encoded as per
	 * {@link EncoderServiceImpl#encode(String)}.  Decode it and then return the result
	 * 
	 * 
	 * @param source
	 *            the string to be decoded
	 * @return decoded String
	 */
	public String decode(final String source) {
		final int length = source.length();
		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < length; i++) {
			final int offset = (length - i);
			result.append(postionService.getDecodeCharacter(source.charAt(i),
					offset));
		}
		return result.toString();
	}

}
