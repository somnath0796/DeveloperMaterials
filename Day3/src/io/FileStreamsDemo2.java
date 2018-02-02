package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileStreamsDemo2 {

	public static void main(String[] args) {
		
		try(
			FileReader fis  = new FileReader("D:\\workspace\\Day3\\src\\io\\file.txt");
			FileWriter fos = new FileWriter("D:\\workspace\\Day3\\src\\io\\file_copy.txt")
				)
		{
				int data = 0;
				while((data = fis.read()) != -1){
					System.out.println(data+"--->"+(char)data);
					fos.write(data);
				}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
