package com.sample.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sample.bookstore.util.ConnectionUtil;
import com.sample.bookstore.util.QueryUtil;
import com.sample.bookstore.vo.Answer;



public class AnswerDAO {

	public void addAnswer(Answer answer) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("answer.addAnswer"));
		
		pstmt.setString(1, answer.getContent());
		// 날짜는 생략
		pstmt.setInt(2, answer.getQuestionNo());
		
		/*
		answer.addAnswer = INSERT INTO sample_book_answers \
					(answer_no, answer_content, answer_registered_date, question_no) \
					VALUES \
					(sample_answer_seq.nextval, ?, ?, ?, ?)
					
		*/
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	
	public Answer getAnswer(int QuestionNo) throws Exception {
		// qustionNo 라서 sql 작성 안해도 되는거였나
		Answer answer = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("answer.getAnswer"));
		
		pstmt.setInt(1, QuestionNo);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			answer = new Answer();
			answer.setNo(rs.getInt("answer_no"));
			answer.setContent(rs.getString("question_content"));
			answer.setRegisteredDate(rs.getDate("question_registered_date"));
			
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return answer;
		
	}
	
	
	
}
