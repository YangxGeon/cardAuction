package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class DeckDTO {
	private int deckId; //�����̵�
	private int cat; //ī�װ�
	private String deckTitle; //�̸�
	private Date createDate; //��������
	private String userId; //�ۼ���
	private int recommend; //��õ��
	private String cmt; //�ڸ�Ʈ
}
