package com.bitcamp.homework;

import java.io.*;
import java.nio.CharBuffer;

public class Streams {

	public static void main(String[] args) throws InterruptedException {
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		BufferedReader bis = new BufferedReader(read);
		byte[] buffer = new byte[4];
		char[] charBuffer = new char[4];
		CharBuffer javaCharBuffer = CharBuffer.allocate(4);
		int numBytesRead = 0;
		System.out.println("Mark supported read: " + read.markSupported());
		System.out.println("Mark supported dis: " + dis.markSupported());
		try {
			/*
			 * while( (numBytesRead = dis.read(buffer)) >= 0 ){
			 * System.out.println( "procitali: "+numBytesRead+" bytea\n"+new
			 * String(buffer) ); buffer = new byte[ buffer.length]; }
			 */

			/*
			 * while( read.read(charBuffer) >= 0){ System.out.println(new
			 * String(charBuffer)); charBuffer = new char[charBuffer.length]; }
			 */
			String line = "";
			while ((line = bis.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("End");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}