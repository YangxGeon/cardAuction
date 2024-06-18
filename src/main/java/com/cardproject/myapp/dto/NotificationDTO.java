package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class NotificationDTO {
	private int notification_id; //�˸�
	private String cmt; //����
	private String user_id; //������
	private Date create_date; //�ۼ���
	private int is_read; //�б⿩��
	private int item_id; //��ǰ���̵�
	
}
