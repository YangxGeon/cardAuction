package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class ReplieDTO {
	private int reply_id; //���̵�
	private String cmt; //����
	private Date create_time; //�ۼ��ð�
	private int comm_id; //���۾��̵�
	private int user_id; //��۾��̵�
}
