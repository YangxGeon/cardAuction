package com.cardproject.myapp.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class PokemonDTO {
	private String cardId; //ī����̵�
	private String cardName; //�̸�
	private String cardSort; //ī������
	private String feature; //Ư��
	private String cardType; //ī��Ÿ��
	private String cardImage; //�̹���
}
