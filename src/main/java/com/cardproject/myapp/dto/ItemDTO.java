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
public class ItemDTO {
	
	private int item_id; //��ǰ���̵�
	private String user_id; //�Ǹ��ھ��̵�
	private String item_name; //�̸�
	private String cmt; //�ڸ�Ʈ
	private int status; //��ǰ����
	private int min_price; //������
	private String rarity; //��͵�
	private Date create_date; //������
	private Date end_date; //������
	private int trade_type; //��ȣ�ŷ����
	private int cat; //ī�װ�
	private String image1; //�̹���
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private String d_card_id; //ī����̵�
	private String p_card_id;
	private String y_card_id;
	private String s_card_id;
	private String o_card_id;

}
