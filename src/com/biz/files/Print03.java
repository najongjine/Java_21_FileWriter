package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print03 {

	public static void main(String[] args) {
		String fileName="src/com/biz/files/data3.txt";
		FileWriter fileWriter;
		PrintWriter fileOut=null; //자바 규격으로 맞춰줌.
		
		try {
			
			fileWriter=new FileWriter(fileName,true);
			/*
			 * 자바 1.5부터는 PrintWriter 클래스만 단독으로 사용해서 파일에 text를 기록할수 있다.
			 * 자동 flush는 print()메서드를 실행할때마다 기록되는것이 아니고, 내부에서 buffer를 별도로 관리하면서 
			 * 내용을 기록한다.
			 */
			fileOut=new PrintWriter(fileWriter);
			fileOut.println("ddd");
			fileOut.printf("fsf\n");
			fileOut.println(200%2);
			fileOut.flush();
			fileOut.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
