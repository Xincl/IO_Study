package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ����Reader �ļ��ַ�������
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
    	  Reader reader = null;
		try {
			reader = new FileReader(f);
			//3.
			  char[] car = new char[1024];    //���� ��С�ĺ����ǰ�������Ĵ�С���зֶζ�ȡ,����������1k��ȡ
			  int len = -1;                //�ǰ�������ķֶζ�ȡ��ͳ�ƴ�С
	    	  while((len=reader.read(car))!=-1) {  //����ȡ����ֵ�ǣ�len�᷵��-1
	    		  String str = new String(car,0,len);
	    		  System.out.println(str);
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
