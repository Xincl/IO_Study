package com.xincl.IO;

import java.io.File;
import java.io.IOException;

/**
 * ����File���������������
 * ��ʽʹ��ʱ�����ж��Ƿ����
 * ����con.com3����Щ����ϵͳ���豸���ƣ�������ȷ���д���
 * @author xincl
 *
 */
public class TestFileMethod {
     public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		
//		fileMethod(path);
		
		//��ʽʹ�õ��ļ�״̬
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("�ļ�������");
		}else {
			if(file.isFile()) {
				System.out.println("�ļ�����");
			}else {
				System.out.println("�ļ��в���");
			}
		}
		
		fileMethod2();
		
	}
     
     //������File����
     public static void fileMethod(String path) {
    	 File src = new File(path);
 		
 		//��ȡ�ļ�����
 		System.out.println("�ļ�����Ϊ�� "+src.getName());
 		
 		//��ȡ·��
 		System.out.println("�ļ���path·����  "+src.getPath());  //����������ڹ���File��ʱ��ʹ�����·������ʾ���·��������·���ͻ���ʾ����·��
 		
 		//��ȡ����·��
 		System.out.println("�ļ��ľ���·��"+src.getAbsolutePath());
 		
 		//��ȡ���ļ���
 		System.out.println("���ļ���: "+src.getParent());
 		
 		//�����Ƿ����
 		System.out.println("�����ļ��Ƿ���ڣ� "+src.exists());
 		
 		//�ж��Ƿ�Ϊ�ļ�
 		System.out.println("�����Ƿ�Ϊ�ļ��� "+src.isFile());
 		
 		//�ж��Ƿ�Ϊ·��
 		System.out.println("�����Ƿ�Ϊ·�����ļ��У� "+src.isDirectory());
 		
 		//��ȡ����������
 		System.out.println("����������Ϊ��"+src.getParentFile().getName());
 		
 		//��ȡ�ļ��ĳ���
 		System.out.println("�ļ��ĳ��ȴ�С�� "+src.length());
 		src = new File("C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO");
 		System.out.println("�ļ��ĳ��ȴ�С�� "+src.length());
 		
 		
     }

     //createNewFile������delete����
     public static void fileMethod2() throws IOException{
    	 //�����ڲŴ���
    	 File file = new File("C:/Users/xincl/Desktop/Java/��Ŀ/TestA-IO/src/com/xincl/IO/aaa.txt");
    	 boolean flag = file.createNewFile();
    	 System.out.println(flag);
    	 flag = file.delete();
    	 System.out.println(flag);
    	 
    	 System.out.println("-------�����Ƿָ���---------");
    	
    	 //�����ļ��У����ǲ���һ���������ļ��У�û������ͨ�ļ���һ��
    	 file = new File("C:\\Users\\xincl\\Desktop\\Java\\����\\aaa");
    	 flag = file.createNewFile();
    	 System.out.println(flag);
    	 
    	 
    	 //ɾ���ļ�
    	 flag = file.delete();
    	 System.out.println(flag);
     }
     
     
}
