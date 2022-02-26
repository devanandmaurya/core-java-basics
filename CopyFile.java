package com.dkh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	//public static void main(String args[])  throws IOException{
		  
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		try {
//			in = new FileInputStream("C:\\Users\\Mindgate\\Desktop\\input.txt");
//			out = new FileOutputStream("C:\\Users\\Mindgate\\Desktop\\output.txt");
//			int c;
//			while ((c = in.read()) != -1) {
//				out.write(c);
//			}
//		} finally {
//			if (in != null) {
//				in.close();
//			}
//			if (out != null) {
//				out.close();
//			}
//		}
//	}
//}
		
		public static void main(String args[])  throws IOException{
		
		try {
			byte bWrite [] = {11,21,93,80,57,77};
			OutputStream os = new FileOutputStream("test.txt");
			for(int x = 0; x < bWrite.length ; x++) {
			os.write( bWrite[x] ); // writes the bytes
			}
			os.close();
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for(int i = 0; i < size; i++) {
			System.out.print((char)is.read() + " ");
			}
			is.close();
			}catch(IOException e) {
			System.out.print("Exception");
			}
			}
			}
