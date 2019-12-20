package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �����ֽ��������ı������ַ�����ת��  InputStreamReader  OutputStreamWriter
 * 1.���ַ�������ʽ�����ֽ���
 * 2.ѡ���ַ���
 * @author xincl
 *
 */
public class TestConvert {
     public static void main(String[] args) {
		//����System.in��System.out
    	 try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		 BufferedWriter wb = new BufferedWriter(new OutputStreamWriter(System.out))){
    		 
    		 //ѭ����ȡ���̵����루��exit�˳�������ӡ��ȡ��������
    		 String line = "";
    		 while(!line.equals("exit")) {
    			 line = br.readLine();
    			 wb.write(line);
    			 wb.newLine();
    			 wb.flush();
    		 }
    	 }catch(IOException e) {
    		 System.out.println("��������쳣");
    	 }
	}
}
