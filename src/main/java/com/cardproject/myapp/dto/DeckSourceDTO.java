package com.cardproject.myapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeckSourceDTO {
	private int deck_id; //���ҽ����̵�
	private String p_card; //ī����̵�
	private String o_card;
	private String d_card;
	private String y_card;
	private int is_thumbnail; //����Ͽ���
}
