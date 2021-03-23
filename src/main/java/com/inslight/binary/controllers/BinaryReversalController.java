package com.inslight.binary.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inslight.binary.services.BinaryReversalService;

@RestController
public class BinaryReversalController {

	private static final Logger LOG = LogManager.getLogger(BinaryReversalController.class.getName());

	@Autowired
	BinaryReversalService binaryReversalService;

	@GetMapping("/getBinaryReversalValue")
	public ResponseEntity<Integer> getBinaryReversalValue(@RequestParam String value) {
		try {
			LOG.info("[ GetBinaryReversalValue method {} ]");
			return new ResponseEntity<Integer>(binaryReversalService.getBinaryReversalValue(value), HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("[ GetBinaryReversalValue Exception {} ]", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
