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
public class BiddingDTO {
	private int bid_id; //���� ���̵�
	private int price; //���� �ݾ�
	private Timestamp bid_time; //���� �ð�
	private String user_id; //������ ���̵�
	private int item_id; //��ǰ ���̵�
	
}
