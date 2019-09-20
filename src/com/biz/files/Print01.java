package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print01 {

	public static void main(String[] args) {
		FileWriter fileWriter;
		BufferedWriter buffer; // 운영재체 규격으로 맞춰줌.
		String fileName="src/com/biz/files/data3.txt";
		PrintWriter fileOut=null; //자바 규격으로 맞춰줌.
		
		try {
			/*
			 * FileWriter()생성자는 파일의 경로와 이름을 매개변수로 받아서 파일을 새로 작성.
			 * 그리고 새로 작성된 파일에 대한 정보를 fileWriter객체에 저장.
			 */
			fileWriter=new FileWriter(fileName);
			buffer=new BufferedWriter(fileWriter);
			
			/*
			 * 자바 1.5부터는 PrintWriter 클래스만 단독으로 사용해서 파일에 text를 기록할수 있다.
			 */
			fileOut=new PrintWriter(buffer,true);
			fileOut.println("ddd");
			fileOut.printf("fsf\n");
			fileOut.println(200%2);
			fileOut.flush();
			fileOut.close();
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
