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
public class UserDTO {
	
	private String userId; //���̵�
	private String userName; //�̸�
	private String pw; //��й�ȣ
	private String nickName; //�г���
	private String email; //�̸���
	private String phoneNumber; //��ȭ��ȣ
	private String zipCode; //�����ȣ
	private String address; //���θ��ּ�
	private String addressDetail; //���ּ�
	private String profileImage; //�����ʻ���
	private int pnt; //����Ʈ
	private String accnt; //����
	private int userTier; //���
	private int recommend; //��õ��
	private int isAdmin; //������
	private int auctionAlarmPhone; //�����ȭ�˸�����
	private int auctionAlarmEmail; //��Ÿ��Ͼ˸�����
	private int commAlarmPhone; //�Խ�����ȭ�˸�����
	private int commAlarmEmail; //�Խ��Ǹ��Ͼ˸�����
	
}
