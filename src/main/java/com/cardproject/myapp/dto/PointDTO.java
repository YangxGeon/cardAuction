package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class PointDTO {
	private int pointId; //����Ʈ���̵�
	private int amount; //��
	private Date createDate; //������
	private String cmt; //�ڸ�Ʈ
	private int userId; //���̵�
	private int isAdd; //����,��뿩��
}
