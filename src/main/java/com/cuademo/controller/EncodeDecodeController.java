package com.cuademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cuademo.controller.model.Payload;
import com.cuademo.service.DecoderService;
import com.cuademo.service.EncoderService;

@RestController
public class EncodeDecodeController {

	@Autowired
	private DecoderService decoder;
	
	@Autowired
	private EncoderService encoder;
	
	@RequestMapping(path="/encoded", method=RequestMethod.GET)
	public Payload encode(@RequestParam("payload") String payload) {
		return new Payload(encoder.encode(payload));
	}
	
	@RequestMapping(path="/decoded", method=RequestMethod.GET)
	public Payload decode(@RequestParam("payload") String payload) {
		return new Payload(decoder.decode(payload));
	}

}
