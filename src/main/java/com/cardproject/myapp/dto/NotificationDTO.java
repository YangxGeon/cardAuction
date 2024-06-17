package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class NotificationDTO {
	private int notificationId; //�˸�
	private String cmt; //����
	private String userId; //������
	private Date createDate; //�ۼ���
	private int isRead; //�б⿩��
	private int itemId; //��ǰ���̵�
	
}
