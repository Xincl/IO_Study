package com.xincl.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �������FileReader  �ļ�����ַ���      ���뻺����
 * 1.����Դ
 * 2.ѡ����
 * 3.������д��
 * 4.�ͷ�ϵͳ��Դ
 * @author xincl
 *
 */
public class TestWriter {
     public static void main(String[] args) {
    	//1.����Դ
		File f = new File("test.txt");
		//2.ѡ����
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(f,false));  //f:Ŀ���ļ��������ڻ��Լ�������false��trueȷ���Ƿ����append��trueΪ�ں��������
			                                                   
			//3.����
			//д��һ
//			String str = "soilder\n����";      //Ҫд������
//			char[] c = str.toCharArray();   //���ַ�����
//			writer.write(c, 0, c.length);
//			writer.flush();                                        //ˢ��
			
			//д����
//			String str = "soilder\n����";
//			writer.write(str,0,2);
//			writer.flush();
			
			//д����
//			String str = "soilder\n����";
//			writer.append(str);
			writer.append("soilder");
			writer.newLine();
			writer.append("����");
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
		
	}
}
