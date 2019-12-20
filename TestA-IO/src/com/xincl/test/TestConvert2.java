package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * �����ֽ��������ı������ַ�����ת��  InputStreamReader  OutputStreamWriter   openStream
 * 1.���ַ�������ʽ�����ֽ���
 * 2.ѡ���ַ���
 * @author xincl
 *
 */
public class TestConvert2 {
     public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
				new URL("https://www.baidu.com").openStream(),"UTF-8"));
			BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
			    new FileOutputStream("baidu.html"),"gbk"));){
			String line = "";
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				bw.write(line);
				bw.newLine();
    		 }
			 bw.flush();
    	 }catch(IOException e) {
    		 System.out.println("��������쳣");
    	 }
	}
}
