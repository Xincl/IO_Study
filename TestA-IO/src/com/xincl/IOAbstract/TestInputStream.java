package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����InputStream  ��ϸ���裺
 * 1.����Դ
 * 2.ѡ����
 * 3.����������
 * 4.�ͷ�ϵͳ��Դ
 * @author xincl
 *
 */
public class TestInputStream {
      public static void main(String[] args) {
		//1.����Դ
    	  File f = new File("abc.txt");
    	  
        //2.ѡ����
    	  InputStream in = null;
		try {
			in = new FileInputStream(f);
			//3.
			  int temp;
	    	  while((temp=in.read())!=-1) {  //����ȡ����һ���ֽ�Ϊ�գ������ʾΪ-1
	    		  System.out.print((char)temp);
	    	  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in!=null) {   //���ļ��п��Զ�ȡ�����Ż�ִ����һ��
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	  
    	
    	  
    	  
    	  
    	  
      }
}
