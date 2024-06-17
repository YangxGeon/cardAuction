package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class QuestionDTO {
	private int questId; //�Խù�ID
	private String title; //����
	private String ctt; //����
	private Date createDate; //�ۼ���
	private int userId; //�ۼ��ھ��̵�
	private int isSecret; //��бۿ���
	private String answer; //���
}
