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
public class ItemsDTO {
	
	private int itemId; //��ǰ���̵�
	private String userId; //�Ǹ��ھ��̵�
	private String itemName; //�̸�
	private String cmt; //�ڸ�Ʈ
	private int status; //��ǰ����
	private int minPrice; //������
	private String rarity; //��͵�
	private Date createDate; //������
	private Date endDate; //������
	private int tradeType; //��ȣ�ŷ����
	private int cat; //ī�װ�
	private String image1; //�̹���
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private String dCardId; //ī����̵�
	private String pCardId;
	private String yCardId;
	private String sCardId;
	private String oCardId;

}
