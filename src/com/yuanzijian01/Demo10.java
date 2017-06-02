package com.yuanzijian01;

import java.io.File;

/*
 ����1���г�һ���ļ��е������ļ���Ŀ¼��
 
 2���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ������ǰ��Ҫ����Ӧ�����Ŀո�
		��һ��ǰ����0�����ڶ���ǰ����1����������ǰ����2��...���Դ����ơ�

3���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ��Ҫ����״�ṹ��Ч��������ʾ��
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar

����4: ɾ��һ���ǿյ��ļ��С� 
 
 
��ҵ��  ����һ���ǿ�Ŀ¼��

 
 */


public class Demo10 {
	
	public static void main(String[] args) {
	/*	File dir = new File("F:\\1208project\\day22");
		listFiles3(dir,"|--");*/
		
		File dir = new File("F:\\aa");
		deleteDir(dir);
	}
	
	
	//ɾ����һ���ǿյ�Ŀ¼
	public static void deleteDir(File dir){ // bb
		File[] files = dir.listFiles(); //�г������е����ļ�
		for(File file : files){
			if(file.isFile()){
				file.delete();
			}else if(file.isDirectory()){
				deleteDir(file);
			}
		}
		dir.delete();
	}
	
	
	
	
	public static void listFiles3(File dir,String space){ //space �洢���ǿո�
		File[] files = dir.listFiles(); //�г����� �����ļ�
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFiles3(file,"|   "+space);
			}
			
		}
		
		
	}
	
	
	
	//�г�һ���ļ��е������ļ���Ŀ¼��
	public static void listFiles2(File dir,String space){ //space �洢���ǿո�
		File[] files = dir.listFiles(); //�г����� �����ļ�
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFiles2(file,"  "+space);
			}
			
		}
		
		
	}
	
	
	
	
	//�г�һ���ļ��е������ļ���Ŀ¼��
	public static void listFiles1(File dir){
		File[] files = dir.listFiles(); //�г����� �����ļ�
		for(File file : files){
			if(file.isFile()){
				System.out.println("�ļ�����"+file.getName());
			}else if(file.isDirectory()){
				System.out.println("�ļ��У�"+file.getName());
				listFiles1(file);
			}
			
		}
		
		
	}
	
}
