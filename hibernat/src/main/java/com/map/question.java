package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
	private int questionId;
	private String que;
	
	@OneToOne
	private Answer answer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public question(int questionId, String que, Answer answer) {
		super();
		this.questionId = questionId;
		this.que = que;
		this.answer = answer;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
