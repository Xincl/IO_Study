package com.xincl.IOAbstract;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �������ByteArrayOutputStream
 * 1.����Դ:�ڲ�ά��
 * 2.ѡ������������Դ
 * 3.������д��
 * 4.�ͷ�ϵͳ��Դ
 * 
 * ��Ҫ��ȡ���ݣ���toByteArray.
 * @author xincl
 *
 */
public class TestByteArrayOutputStream {
     public static void main(String[] args) {
    	//1.����Դ
		byte[] bes = null;
		//2.ѡ����
		ByteArrayOutputStream os = null;
		try {
			os = new ByteArrayOutputStream();  
			                                                   
			//3.����
			String str = "show me the code\n";      
			byte[] b = str.getBytes();                         
			os.write(b,0,b.length);                           
			os.flush();                                       
			//��ȡ����
			bes = os.toByteArray();
			System.out.println(bes.length+"-->"+new String(bes,0,bes.length));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
		
	}
}
