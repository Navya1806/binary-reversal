package com.inslight.binary.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinaryReversalServiceTest {

	@Autowired
	BinaryReversalService binaryReversalService;

	@Test
	public void testPositiveResponseCode() throws Exception {
		String value = "47";
		assertEquals(binaryReversalService.getBinaryReversalValue(value), 244);
	}

}
