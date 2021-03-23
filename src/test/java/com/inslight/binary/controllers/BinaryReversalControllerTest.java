package com.inslight.binary.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class BinaryReversalControllerTest {

	@Autowired
	BinaryReversalController binaryReversalController;

	@InjectMocks
	BinaryReversalController binaryController;

	@Test
	public void testPositiveResponseCode() throws Exception {
		String value = "47";
		ResponseEntity<Integer> entity = binaryReversalController.getBinaryReversalValue(value);
		assertEquals(200, entity.getStatusCodeValue());
	}

	@Test
	public void testFetchAllResponseCode() throws Exception {
		String value = "AAA";
		ResponseEntity<Integer> entity = binaryReversalController.getBinaryReversalValue(value);
		assertEquals(400, entity.getStatusCodeValue());
	}

}
