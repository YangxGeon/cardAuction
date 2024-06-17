package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TradeDTO {
	private int tradeId; //�ŷ���ȣ
	private String userId; //�����ھ��̵�
	private int itemId; //��ǰ���̵�
	private int price; //�����ݾ�
	private int tradeType; //�ŷ����
	private Date createDate; //��������
	private Date confirmDate; //�ŷ�Ȯ������
	private int isRecommend; //��õ����
	private int stage; //�ŷ���Ȳ
}
