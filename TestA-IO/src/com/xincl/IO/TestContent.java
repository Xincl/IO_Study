package com.xincl.IO;

import java.io.UnsupportedEncodingException;

/**
 * �ַ����ֽ�---->����
 * utf-8:���������ֽڣ�Ӣ��һ���ֽ�
 * gbk:���������ֽڣ�Ӣ��һ��
 * utf-16:���������ֽ�
 * @author xincl
 *
 */
public class TestContent {
     public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "��������ʹ��a";
		
		//ͨ���Ǹ��湤�̵ı��룬�˹���ΪGBK����
		byte[] datas = s.getBytes();
		System.out.println(datas.length);
		
		//�����ַ���������С��utf-16
	    datas = s.getBytes("UTF-16LE");
	    System.out.println(datas.length);
	    
		//UTF-8���뼯
	    datas = s.getBytes("UTF-8");
	    System.out.println(datas.length);
	    
		
	}
}
