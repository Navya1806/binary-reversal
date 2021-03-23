package com.inslight.binary.services;

import org.springframework.stereotype.Service;

@Service
public class BinaryReversalService {

	public int getBinaryReversalValue(String value) {
		return doBinaryReversal(value);
	}

	private int doBinaryReversal(String num) {
		int val = Integer.parseInt(num);
		String binVal = Integer.toBinaryString(val).toString();
		if (binVal.length() < 8) {
			binVal = padZeroes(binVal);
		}
		StringBuilder sb = new StringBuilder(binVal);
		binVal = sb.reverse().toString();
		return Integer.parseInt(binVal, 2);
	}

	private String padZeroes(String val) {
		int n = 8 - val.length();
		String value = "";
		for (int i = 0; i < n; i++) {
			value = value + "0";
		}
		value = value + val;

		return value;
	}
}
