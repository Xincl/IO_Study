package com.xincl.IOAbstract;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ͬ�����ĸ����裬һ��һ�εĶ�ȡ����
 * 1.����Դ
 * 2.ѡ����
 * 3.����������
 * 4.�ͷ�ϵͳ��Դ
 * @author xincl
 *
 */
public class TestByteArrayInputStream {
      public static void main(String[] args) {
		//1.����Դ
        byte[] bes = "show me the code".getBytes(); 
    	  
        //2.ѡ����
    	  InputStream in = null;
		try {
			in = new ByteArrayInputStream(bes);
			//3.
			  byte[] car = new byte[1024];    //���� ��С�ĺ����ǰ�������Ĵ�С���зֶζ�ȡ,����������1k��ȡ
			  int len = -1;                //�ǰ�������ķֶζ�ȡ��ͳ�ƴ�С
	    	  while((len=in.read(car))!=-1) {  //����ȡ����ֵ�ǣ�len�᷵��-1
	    		  String str = new String(car,0,len);  //����
	    		  System.out.println(str);
	    	  }
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
