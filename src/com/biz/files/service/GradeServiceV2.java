package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {
	protected  List<String> nameList=null;
	
	public GradeServiceV2() {
		nameList=new ArrayList<String>();
	}
	@Override
	public void readNameFile(String nameFile) throws Exception {
		// TODO Auto-generated method stub
		FileReader fileReader;
		BufferedReader buffer;
		fileReader=new FileReader(nameFile);
		buffer=new BufferedReader(fileReader);
		
		while(true) {
			String strName=buffer.readLine();
			if(strName==null)break;
			nameList.add(strName);
		}
		buffer.close();
		fileReader.close();
	}//end
	

	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		FileWriter fw;
		PrintWriter fileOut;
		fw=new FileWriter(studentFile);
		fileOut=new PrintWriter(fw);
		for(int i=0;i<length;i++) {
			//System.out.printf("%s\t%s\n",String.format("A%03d", i+1),nameList.get(i));
			int tel1st=rnd.nextInt(9999)+1;
			int tel2nd=rnd.nextInt(9999)+1;
			String strTel=String.format("010-%04d-%04d", tel1st,tel2nd);
			int intYear=rnd.nextInt(20)+1980;
			int intMonth=rnd.nextInt(12)+1;
			int intDay=rnd.nextInt(28)+1;
			String strBirth=String.format("%4d-%02d-%02d", intYear,intMonth,intDay);
			fileOut.printf("%s:%s:%s:%s\n",String.format("A%03d", i+1),nameList.get(i),strTel,strBirth);
			fileOut.flush();
			}
		fileOut.close();
	}
	private void nameList() {
		for(String s:nameList) {
			System.out.println(s);
		}
	}//end
	
}
