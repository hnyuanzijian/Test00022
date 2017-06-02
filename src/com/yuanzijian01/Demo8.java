package com.yuanzijian01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
/*
 ת����:
 
�����ֽ�����ת������InputStreamReader ���ֽ���ͨ���ַ�������
 	InputStreamReader
 
����ֽ�����ת������
	OutputStreamWriter   ���԰�����ֽ���ת��������ַ��� ��  
 	
 
ת���������ã�
	1. ���Ŀǰ�� ��ȡ������һ���ֽ�����Ҫת���ַ���ʹ�ã���ʱ��Ϳ���ʹ��ת������  �ֽ���----> �ַ���
 	2. ʹ��ת��������ָ���������ж�д�ļ���
 	
 
 */


public class Demo8 {
	
	public static void main(String[] args) throws IOException {
//		readTest();
//		writeTest();'
		
//		writeTest2();
		readTest2();
	}
	
	//ʹ�������ֽ�����ת����ָ�������ж�ȡ�ļ�����
	public static void readTest2() throws IOException{
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		//�����ֽ�����ת��������ָ�������ж�ȡ
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		char[] buf = new char[1024];
		int length = 0;
		while((length = inputStreamReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		
	}
	
	
	
	
	
	//ʹ������ֽ�����ת����ָ�����д������
	public static void writeTest2() throws IOException{
		File file = new File("F:\\a.txt");
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//������ֽ���ת�����ַ�������ָ�������
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("���й��ð�");
		//�ر���Դ
		outputStreamWriter.close();
		
	}
	
	
	
	public static void writeTest() throws IOException{
		File file = new File("F:\\a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//������ֽ���ת��������ַ�����
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		
		outputStreamWriter.write("��Һ�");
		outputStreamWriter.close();
		
	}
	
	
	
	
	public static void readTest() throws IOException{
		InputStream in = System.in; //��ȡ�˱�׼����������
//		System.out.println("���� ���ַ���"+ (char)in.read());  //read()һ��ֻ�ܶ�ȡһ���ֽڡ�
		//��Ҫ���ֽ���ת�����ַ�����
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		//ʹ���ַ����Ļ�����
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			System.out.println("���ݣ�"+ line);
		}
		
		
	}

}
