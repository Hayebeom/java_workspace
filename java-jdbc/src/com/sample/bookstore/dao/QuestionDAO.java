package com.sample.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sample.bookstore.util.ConnectionUtil;
import com.sample.bookstore.util.QueryUtil;
import com.sample.bookstore.vo.Answer;
import com.sample.bookstore.vo.Question;
import com.sample.bookstore.vo.User;

public class QuestionDAO {
	
	public List<Question> getAllQuestion() throws Exception {
		
		List<Question> questions = new ArrayList<Question>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("question.getAllQuestion"));
		// pstmt.setInt(1, ); 필요한가?
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Question question = new Question();
			
			question.setNo(rs.getInt("question_no"));
			question.setTitle(rs.getString("question_title"));
			// question.getUser().setName(rs.getString("user_id")); 아래꺼인가
			
			User user = new User();
			user.setName(rs.getString("user_id")); // ?
			
			question.setContent(rs.getString("question_content"));
			question.setViewCount(rs.getInt("question_view_count"));
			question.setRegisteredDate(rs.getDate("question_registered_date"));
			// question.setStatus(rs.getString("question_status")); 기존값 n
			question.setType(rs.getString("question_type"));
			
			questions.add(question);
			/*
			 * SELECT question_no, question_title, user_id, question_content, 
			 *  question_view_count, question_registered_date, 
			 *  question_status, question_type \
			 */
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return questions;
	}
	
	public void addQuestion(Question question) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("question.addQuestion"));
		
		pstmt.setString(1, question.getTitle());
		pstmt.setString(2, question.getUser().getId());
		pstmt.setString(3, question.getContent());
		pstmt.setInt(4, question.getViewCount());
		// pstmt.setString(5, question.getStatus());
		pstmt.setString(5, question.getType());
		
		/*
		question.addQuestion = INSERT INTO sample_book_questions \
						(question_no, question_title, user_id, question_content, question_view_count, question_status, question_type) \
						VALUES \
						(sample_question_seq.nextval, ?, ?, ?, ?, ?, ?)
		*/
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	
	public Question getQuestion(int QuestionNo) throws Exception {

		Question question = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("question.getQuestionsByNo"));
		
		pstmt.setInt(1, QuestionNo);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			question = new Question();
			question.setNo(rs.getInt("question_no"));
			question.setTitle(rs.getString("question_title"));
			question.setContent(rs.getString("question_content"));
			question.setViewCount(rs.getInt("question_view_count"));
			// question.setStatus(rs.getString("")); 기존값 n이라 안함
			question.setType(rs.getString("question_type"));
			question.setRegisteredDate(rs.getDate("question_registered_date"));
			
			User user = new User();
			user.setName(rs.getString("user_id"));
			
			Answer answer = new Answer();
			answer.setContent(rs.getString("answer_content"));
			
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return question;
		
	}
	
	public void removeQuestionByNo(int questionNo, String userId) throws Exception {
		Question question = new Question();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("question.deleteQuestion"));
		
		pstmt.setInt(1, question.getNo());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
		/*
		question.deleteQuestion = DELETE FROM sample_questions \
									WHERE question_no = ?
		*/
	}
	
	public void updateQuestion(Question question) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("question.updateQuestion"));

		pstmt.setString(1, question.getTitle());
		pstmt.setString(2, question.getUser().getId());
		pstmt.setString(3, question.getContent());
		pstmt.setInt(4, question.getViewCount());
		pstmt.setString(5, question.getType());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
}
