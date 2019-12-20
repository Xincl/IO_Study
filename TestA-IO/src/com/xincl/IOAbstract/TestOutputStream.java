package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �������FileOutputStream
 * 1.����Դ
 * 2.ѡ����
 * 3.������д��
 * 4.�ͷ�ϵͳ��Դ
 * @author xincl
 *
 */
public class TestOutputStream {
     public static void main(String[] args) {
    	//1.����Դ
		File f = new File("test.txt");
		//2.ѡ����
		OutputStream os = null;
		try {
			os = new FileOutputStream(f,true);  //f:Ŀ���ļ��������ڻ��Լ�������false��trueȷ���Ƿ����append��trueΪ�ں��������
			                                                   
			//3.����
			String str = "xiaoluo is a beautiful girl\n";      //Ҫд������
			byte[] b = str.getBytes();                         //����
			os.write(b,0,b.length);                            //write�����飬��ʼλ�ã����ȣ�
			os.flush();                                        //ˢ��
			
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
