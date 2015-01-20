package com.bitcamp.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Main {

	private static void clearBuffer(byte[] buffer) {
		for (int i = 0; i < buffer.length; i++)
			buffer[i] = 0;
	}

	public static void main(String[] args) {

		DataInputStream is = new DataInputStream(System.in);
		DataOutputStream os = new DataOutputStream(System.out);

		byte[] inputBuffer = new byte[5];
		StringBuilder sb = new StringBuilder();

		try {
			while (is.read(inputBuffer) >= 0) {
				sb.append(new String(inputBuffer));
				clearBuffer(inputBuffer);
			}
			os.writeUTF("Output: \n");
			String output = sb.toString();
			os.write(output.getBytes());

			// close the streams
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}