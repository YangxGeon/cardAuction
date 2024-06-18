package com.cardproject.myapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReportDTO {
	private int report_id; //���̵�
	private int reason; //�Ű����
	private int report_cat; //ī�װ�
	private String user_id; //�Ű���
	private int item_id; //�Ű�ǰ
	private int comm_id; //�Ű��
	private int reply_id; //�Ű���
	
}
