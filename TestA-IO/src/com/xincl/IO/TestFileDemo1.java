package com.xincl.IO;

import java.io.File;

/**
 * ����һ���ļ���·������
 * @author xincl
 *
 */
public class TestFileDemo1 {
     public static void main(String[] args) {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		
		//��һ�ִ���File�ķ���  File src = new File(url);
		File src = new File(path);
		System.out.println(src);
		
		//�ڶ��ַ�ʽ����File�ķ���  File src = new File(String parents,String child); 
		src = new File("C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO","IO.png");
		System.out.println(src);
		
		src = new File("C:\\Users\\xincl\\Desktop\\Java\\��Ŀ","TestA-IO\\src\\com\\xincl\\IO\\IO.png");
		System.out.println(src);
		
		//�����ַ�ʽ������File File src = new File(new File(url),String);
		src = new File(new File("C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO"),"IO.png");
		System.out.println(src);
	}
}
