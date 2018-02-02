package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileStreamsDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis  = new FileInputStream("D:\\workspace\\Day3\\src\\io\\file.txt");
		FileOutputStream fos = new FileOutputStream("D:\\workspace\\Day3\\src\\io\\file_copy.txt");
		int data = 0;
		while((data = fis.read()) != -1){
			System.out.print((char)data);
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
