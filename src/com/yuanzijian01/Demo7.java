package com.yuanzijian01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
��������� 
 
 ���룺 �ѿ��ö����ַ���ɿ�������ֵ����������ǳ���Ϊ���롣
 
���룺 ����ֵ���Ҷ�Ӧ���ַ������ǰ�������̳���Ϊ���롣

ע�⣺ �Ժ���������һ�����Ƕ�ʹ��ͳһ���������ǳ����׳����롣

 */

public class Demo7 {
	
	public static void main(String[] args) throws Exception {
		/*
		String str = "�й�";
		byte[] buf = str.getBytes("utf-8");// ƽ̨Ĭ�ϵı������gbk�����  ����
		System.out.println("�����Ԫ�أ�"+Arrays.toString(buf)); //
		
		str = new String(buf,"utf-8");  //Ĭ��ʹ����gbk���ȥ���롣 
		System.out.println("�������ַ�����"+ str);		
		*/
		
		
		/*String str = "a�й�"; // ,0, 97, 78, 45, 86, -3
		byte[] buf = str.getBytes("unicode");  //����������ʱ��ָ�� �������unicodeʵ���Ͼ�������utf-16.
		System.out.println("��������ݣ�"+ Arrays.toString(buf));
		*/
		
		
		String str = "��Һ�";
		byte[] buf = str.getBytes(); //ʹ��gbk���б���
		System.out.println("�ֽ����飺"+ Arrays.toString(buf));  // -76, -13, -68, -46, -70, -61
		
		str = new String(buf,"iso8859-1");
		// ��������֮�󶼿��Ա���ԭ�� 
		
		byte[] buf2 = str.getBytes("iso8859-1");
		str = new String(buf2,"gbk"); 

		System.out.println(str);
		
		
		
		
	}
	
}
