package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class ReplieDTO {
	private int replyId; //���̵�
	private String cmt; //����
	private Date createTime; //�ۼ��ð�
	private int commId; //���۾��̵�
	private int userId; //��۾��̵�
}
