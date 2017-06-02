package com.yuanzijian01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/*
SequenceInputStream(������)

  
 
 
 
���󣺰�a.txt��b.txt �ļ������ݺϲ���

 */
public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		merge3();
	}
	
	//�������ļ��ϲ���һ���ļ�
	public static void merge3() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file1 = new File("F:\\a.txt");
		File file2 = new File("F:\\b.txt");
		File file3 = new File("F:\\c.txt");
		File file4 = new File("F:\\d.txt");
		
		
		//������Ӧ ���������������
		FileOutputStream fileOutputStream = new FileOutputStream(file4);
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		FileInputStream fileInputStream3 = new FileInputStream(file3);

		//��������������
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();

		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		
		//��ȡ�ļ�����
		byte[] buf = new byte[1024];
		int length = 0; 
		
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		
		//�ر���Դ
		sequenceInputStream.close();
		fileOutputStream.close();
		
	}
	
	
	
//	ʹ��SequenceInputStream�ϲ��ļ���
	public static void merge2() throws IOException{
		//�ҵ�Ŀ���ļ�
		File inFile1 = new File("F:\\a.txt");
		File inFile2 = new File("F:\\b.txt");
		File outFile = new File("F:\\c.txt");
		//�������ݵ��������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		//��������������
		SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);
		byte[] buf = new byte[1024];
		int length = 0 ; 
		
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		inputStream.close();
		fileOutputStream.close();

	}
	
	
	//���󣺰�a.txt��b.txt �ļ������ݺϲ���
	public static void merge1() throws IOException{
		//�ҵ�Ŀ���ļ�
		File inFile1 = new File("F:\\a.txt");
		File inFile2 = new File("F:\\b.txt");
		File outFile = new File("F:\\c.txt");
		//�������ݵ��������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		
		//���������洢�������У�Ȼ���ٴӼ����ж�ȡ
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		//׼��һ����������
		byte[] buf = new byte[1024];
		int length = 0 ; 
		
		for(int i = 0 ; i< list.size() ; i++){
			FileInputStream fileInputStream = list.get(i);
			while((length = fileInputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			}
			//�ر���Դ
			fileInputStream.close();
		}
		fileOutputStream.close();
		
	}

}
