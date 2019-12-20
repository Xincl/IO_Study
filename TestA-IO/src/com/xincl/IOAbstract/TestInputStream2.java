package com.xincl.IOAbstract;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����ByteArrayInputStream
 * ͬ�����ĸ����裬һ��һ�εĶ�ȡ����
 * 1.����Դ:�����ֽ����飬��Ҫ̫��
 * 2.ѡ����
 * 3.����������
 * 4.�ͷ�ϵͳ��Դ   �˵�closeΪ�շ���
 * @author xincl
 *
 */
public class TestInputStream2 {
      public static void main(String[] args) {
		//1.����Դ
    	  byte[] b = "Talk is cheap,show me the code".getBytes();
    	  
        //2.ѡ����
    	  InputStream in = null;
		try {
			in = new ByteArrayInputStream(b);
			//3.
			  byte[] car = new byte[1024];    //���� ��С�ĺ����ǰ�������Ĵ�С���зֶζ�ȡ,����������1k��ȡ
			  int len = -1;                //�ǰ�������ķֶζ�ȡ��ͳ�ƴ�С
	    	  while((len=in.read(car))!=-1) {  //����ȡ����ֵ�ǣ�len�᷵��-1
	    		  String str = new String(car,0,len);  //����
	    		  System.out.println(str);
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
