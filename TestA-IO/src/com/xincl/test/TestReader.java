package com.xincl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ����Reader �ļ��ַ�������  ���뻺����
 * ͬ�����ĸ�����
 * 1.����Դ
 * 2.ѡ����
 * 3.����������
 * 4.�ͷ�ϵͳ��Դ
 * @author xincl
 *
 */
public class TestReader {
      public static void main(String[] args) {
		//1.����Դ
    	  File f = new File("abc.txt");
    	  
        //2.ѡ����
    	  BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			//3.
			  String line = null;
	    	  while((line=reader.readLine())!=null) {  
	    		  System.out.println(line);
	    	  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader!=null) {   //���ļ��п��Զ�ȡ�����Ż�ִ����һ��
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	  
    	
    	  
    	  
    	  
    	  
      }
}
