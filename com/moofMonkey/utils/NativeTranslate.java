package com.moofMonkey.utils;

public class NativeTranslate {
	public static byte[] int2bytes(int i) {
		String str = Integer.toHexString(i);
		while(str.length() < 8)
			str = "0" + str;
		return BigEndianHEXUtils.fromHex (
			reverse (
				str
			)
		);
	}
	
	public static byte[] short2bytes(short s) {
		String str = Integer.toHexString((int) s);
		while(str.length() < 4)
			str = "0" + str;
		return BigEndianHEXUtils.fromHex (
			reverse (
				str
			)
		);
	}

	public static int bytes2int(byte[] b) {
		return Integer.parseInt (
			BigEndianHEXUtils.toHex (
				b
			),
			16
		);
	}
	
	public static short bytes2short(byte[] b) {
		return Short.parseShort (
			BigEndianHEXUtils.toHex(b),
			16
		);
	}
	
	public static String reverse(String str) {
		return new StringBuilder (
			str
		).reverse().toString();
	}
}
