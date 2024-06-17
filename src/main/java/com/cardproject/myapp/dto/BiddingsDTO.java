package com.cardproject.myapp.dto;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BiddingsDTO {
	private int bidId; //���� ���̵�
	private int price; //���� �ݾ�
	private Timestamp bidTime; //���� �ð�
	private String userId; //������ ���̵�
	private int itemId; //��ǰ ���̵�
	
}
