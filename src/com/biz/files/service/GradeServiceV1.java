package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public class GradeServiceV1 implements GradeService{
	protected List<ScoreVO> scList=null;



	public GradeServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		scList=new ArrayList<ScoreVO>();
	}

	public GradeServiceV1(List<ScoreVO> scList) {
		super();
		this.scList = scList;
	}
	public void makeScoreFile(String scoreFile, int length) throws Exception {
		Random rnd=new Random();
		PrintWriter fileOut=null;
		fileOut=new PrintWriter(scoreFile);
		
		for(int i=0;i<length;i++) {
			String strNum=String.format("A%03d",i+1);
			int intKor=rnd.nextInt(50)+51;
			int intEng=rnd.nextInt(50)+51;
			int intMath=rnd.nextInt(50)+51;
			
			ScoreVO scoreVO=new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setEng(intEng);
			scoreVO.setKor(intKor);
			scoreVO.setMath(intMath);
			scoreVO.setTotal(intMath+intEng+intKor);
			scoreVO.setAvg((intMath+intEng+intKor)/3);
			scList.add(scoreVO);
		}//end for
		
		for(ScoreVO vo:scList) {
			fileOut.printf("%s:%d:%d:%d\n", vo.getNum(),vo.getEng(),vo.getKor(),vo.getMath());
			fileOut.flush();
		}//end file write for
		fileOut.close();
	}

	@Override
	public void readNameFile(String nameFile) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
