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
public class LikeDTO {
	private String user_id; //�������̵�
	private int item_id; //��ǰ���̵�
}
