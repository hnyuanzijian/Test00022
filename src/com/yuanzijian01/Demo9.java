package com.yuanzijian01;
/*
 �ݹ飺������������ú���������
 
 �ݹ��ʹ��ǰ�᣺ ����Ҫ������������µ��á�
 
 
���� ���5�Ľ׳ˡ� 5! = 5*4 *3 * 2*1 
 
 
 */
public class Demo9 {

	public static void main(String[] args) {
		int result = print(5);
		System.out.println("�����"+ result);
	}
	
	public static int print(int num){
		if(num==1){
			return 1;
		}else{
			return num*print(num-1);
		}
	}
	
	
	
	
	public static int test(int num){
		int result  =  1;
		while(num>0){
			result = result*num;
			num--;
		}
		return result;
	}
}
