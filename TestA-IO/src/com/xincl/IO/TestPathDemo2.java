package com.xincl.IO;

import java.io.File;

/**
 * ����File��·��
 * ���·���;���·��
 * ���̷����Ǿ���·����û���̷��������·��
 * @author xincl
 *
 */
public class TestPathDemo2 {
     public static void main(String[] args) {
    	 String path = "C:\\Users\\xincl\\Desktop\\Java\\��Ŀ\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
    	 
    	 
    	 //����·��
    	 File src = new File(path);
         System.out.println(src.getAbsolutePath());
    	 
    	 //�൱·��
         System.out.println(System.getProperty("user.dir"));
         src = new File("IO.png");
         System.out.println(src);
         
         //����һ�������ڵ��ļ���˵����File��ֻ����������Դ�ͳ����һ��·�����ļ����ļ��е�
         src = new File("aaa/IO.png");
         System.out.println(src.getAbsolutePath());
         
    	 
     }
}     