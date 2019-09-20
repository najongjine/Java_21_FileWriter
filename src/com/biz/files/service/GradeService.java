package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public interface GradeService {

	
	public void makeScoreFile(String scoreFile, int length) throws Exception;
	public void readNameFile(String nameFile)throws Exception; //이름만 읽어서 메모리에 저장
	public void makeStudentFile(String studentFile, int length)throws Exception;
	
}
