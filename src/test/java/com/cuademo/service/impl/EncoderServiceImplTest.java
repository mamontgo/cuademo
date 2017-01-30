package com.cuademo.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cuademo.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {Application.class})
public class EncoderServiceImplTest {

	@Autowired
	private EncoderServiceImpl encoder;

	@Test
	public void testEncodeString() {
		final String result = encoder.encode("Encode");
		assertEquals("Encoded 'Encode' String correctly", "Ksgrff", result);
	}
	
	@Test
	public void testFuzzyString() {
		final String result = encoder.encode("Fuzzy");
		assertEquals("Encoded 'Fuzzy' String correctly", "Kycbz", result);
	}
}
