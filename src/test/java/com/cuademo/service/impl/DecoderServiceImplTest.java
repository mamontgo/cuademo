package com.cuademo.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cuademo.Application;
import com.cuademo.service.DecoderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
@WebAppConfiguration
public class DecoderServiceImplTest {

	@Autowired
	private DecoderService decoder;

	@Test
	public void testEncodeString() {
		final String result = decoder.decode("Ksgrff");
		assertEquals("Decoded 'Ksgrff' String correctly", "Encode", result);
	}
	
	@Test
	public void testFuzzyString() {
		final String result = decoder.decode("Kycbz");
		assertEquals("Decoded 'Kycbz' String correctly", "Fuzzy", result);
	}
}
