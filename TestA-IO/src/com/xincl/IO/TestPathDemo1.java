package com.xincl.IO;

import java.io.File;

/**
 * ����File��ļ��ִ�������ķ���
 * @author xincl
 *
 */
public class TestPathDemo1 {
     public static void main(String[] args) {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		System.out.println(path);
		
		//����ʹ��/�����߳����ַ�
		//1
		path = "C:/Users/xincl/Desktop/Java/��Ŀ/TestA-IO/src/com/xincl/IO/IO.png";
		System.out.println(path);
		
		//ʹ�ó���ƴ��
		path = "C:"+File.separator+"Users"+File.separator+"xincl"+File.separator+"Desktop"+File.separator+"Java"+File.separator+"��Ŀ"+File.separator+"TestA-IO"+File.separator+"src"+File.separator+"com"+File.separator+"xincl"+File.separator+"IO"+File.separator+"IO.png";
		System.out.println(path);
	}
}
