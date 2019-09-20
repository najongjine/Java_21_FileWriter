package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter;
		BufferedWriter buffer;
		String fileName="src/com/biz/files/data3.txt";
		
		try {
			/*
			 * FileWriter()생성자는 파일의 경로와 이름을 매개변수로 받아서 파일을 새로 작성.
			 * 그리고 새로 작성된 파일에 대한 정보를 fileWriter객체에 저장.
			 */
			fileWriter=new FileWriter(fileName,true);
			buffer=new BufferedWriter(fileWriter);
			buffer.write("test sentence1\n");
			buffer.flush();
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
