package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class QuestionDTO {
	private int quest_id; //�Խù�ID
	private String title; //����
	private String ctt; //����
	private Date create_date; //�ۼ���
	private int user_id; //�ۼ��ھ��̵�
	private int is_secret; //��бۿ���
	private String answer; //���
}
