package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �������FileReader  �ļ�����ַ���
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
		Writer writer = null;
		try {
			writer = new FileWriter(f,true);  //f:Ŀ���ļ��������ڻ��Լ�������false��trueȷ���Ƿ����append��trueΪ�ں��������
			                                                   
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
			writer.append("soilder\n").append("����");
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
