package com.xincl.IO;

import java.io.UnsupportedEncodingException;

/**
 * �ֽ�-->�ַ�,����
 * @author xincl
 *
 */
public class TestContent2 {
     public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "����a����aʹ��";
        
        //����
        byte[] b = s.getBytes();
        
        //����
        //String(���飬��ʼλ�ã�Ҫ��������鳤�ȣ��ַ�����
        s = new String(b,0,b.length,"gbk");
        System.out.println(s);
        
        //���ַ��Ͳ���ʾ����Ȼ����ʾ����
        s = new String(b,0,b.length-1,"gbk");
        System.out.println(s);
        s = new String(b,0,b.length-2,"gbk");
        System.out.println(s);
        
        
        
        
	}
}
