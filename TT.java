package hkj;

import java.util.Random;

ClassHeader{
		Random random = new Random();{
		for(JLabel lable:list){//listΪ��Ŀ(��ǩ)����,��Ŀ�ڱ�ǩ�г���
			a = random.nextInt(101);
			b = random.nextInt(101);
			cint = random.nextInt(2);
			switch (cint) {
			case 0:
				c = "+";
				RandomRange();//�����涨�����ⷶΧ����,���Ͳ�����100,�С��0
				lable.setText(a+c+b);
				list2.add(a+b);//list2Ϊ������Ŀ��ȷ�𰸵ļ���
				break;
			default:
				c = "-";
				RandomRange();//�����涨�����ⷶΧ����,���Ͳ�����100,�С��0
				lable.setText(a+c+b);
				list2.add(a-b);//list2Ϊ������Ŀ��ȷ�𰸵ļ���
				break;
			}
		}
	}
	public static void RandomRange(){//�����涨�����ⷶΧ����,���Ͳ�����100,�С��0
		Random r = new Random();
		switch (c) {
		case "+":
			while(a+b>100){
				a = r.nextInt(101);
				b = r.nextInt(101);
				if(a + b <= 100){
					
				}
			}
			break;
		default:
			while(a-b<0){
				a = r.nextInt(101);
				b = r.nextInt(101);
				if(a - b >= 0){
					break;
				}
			}
			break;
		}
	}
}
