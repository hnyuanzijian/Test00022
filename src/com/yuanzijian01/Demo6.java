package com.yuanzijian01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
��ӡ����printStream��  ��ӡ�����Դ�ӡ�������͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
 
 */

class Animal{
	
	String name;
	
	String color;
	
	public Animal(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "���֣�"+this.name+ " ��ɫ��"+ this.color;
	}
	
}



public class Demo6 {
	
	public static void main(String[] args) throws IOException {
		/*FileOutputStream fileOutputStream = new FileOutputStream("F:\\a.txt");
		fileOutputStream.write("97".getBytes());
		fileOutputStream.close();*/
		
		
		//��ӡ�����Դ�ӡ�κ����͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
		File file = new  File("F:\\a.txt");
		//����һ����ӡ��
		PrintStream printStream = new PrintStream(file);
		/*
		printStream.println(97);
		printStream.println(3.14);
		printStream.println('a');
		printStream.println(true);
		Animal a = new Animal("����", "��ɫ");
		printStream.println(a);
		
		
		//Ĭ�ϱ�׼����������������̨����ģ�
		System.setOut(printStream); //���������˱�׼�����������
		System.out.println("�������²����������");
		*/
		
		//�ռ��쳣����־��Ϣ��
		File logFile = new File("F:\\2015��1��8��.log");
		PrintStream logPrintStream = new PrintStream( new FileOutputStream(logFile,true) );
		try{
			int c = 4/0;
			System.out.println("c="+c);
			int[] arr = null;
			System.out.println(arr.length);
			
		}catch(Exception e){
			e.printStackTrace(logPrintStream);
			
		}
		
		
		
	}

}
