package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV2;

public class GradeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="src/com/biz/files/이름파일.txt";
		String studentFile="src/com/biz/files/학생병부.txt";
		GradeService gs=new GradeServiceV2();
		
		try {
			gs.readNameFile(fileName);
			gs.makeStudentFile(studentFile, 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
