package com.xincl.IO;

import java.io.File;

/**
 * ���Դ����ļ�Ŀ¼
 * ʹ��mkdir(),��Ҫȷ���ϼ�Ŀ¼���ڣ��Żᴴ���ɹ�
 * ʹ��mkdirs(),�ϼ�Ŀ¼���Բ����ڣ��ڴ�����ʱ���һ�𴴽�
 * @author xincl
 *
 */
public class TestDirDemo1 {
     public static void main(String[] args) {
		File dir = new File("C:/Users/xincl/Desktop/Java/����/���Բ���222/aaa");
		
		//����Ŀ¼ mkdirs()
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		//����Ŀ¼mkdirs()
		
		flag = dir.mkdirs();
		System.out.println(flag);
		
		
		
		
		
	}
}
