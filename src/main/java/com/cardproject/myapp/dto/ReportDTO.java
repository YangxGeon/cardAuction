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
	private int reportId; //���̵�
	private int reason; //�Ű����
	private int reportCat; //ī�װ�
	private String userId; //�Ű���
	private int itemId; //�Ű�ǰ
	private int commId; //�Ű��
	private int replyId; //�Ű���
	
}
