package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ʹ���ļ�������������������ļ��Ŀ���
 * ��abc.txt������test.txt
 * @author xincl
 *
 */
public class TestCopyFile {
     public static void main(String[] args) {
		testCopyFile("images/luo.jpg","images/xiaoluo.jpg");
	}
    
     public static void testCopyFile(String sr1,String sr2) {
    	 File f = new File(sr1);//Դ�ļ�
 		File f2 = new File(sr2);//Ŀ���ļ�
 		InputStream in = null;
 		OutputStream os = null;
 		
 		try {
 			in = new FileInputStream(f);
 			os =  new FileOutputStream(f2,true);
 			byte[] b = new byte[1024];
 			int len = -1;
 			while((len=in.read(b))!=-1) {
 				os.write(b,0,len);
 				os.flush();
 			}
 			
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}finally {
 			if(os!=null) {   //�ȴ򿪺�ر�,�ֱ�ر�
 				try {
 					os.close();
 				} catch (IOException e) {
 					e.printStackTrace();
 				}
 			}
 			if(in!=null) {   //�ȴ򿪺�ر�,�ֱ�ر�
 				try {
 					in.close();
 				} catch (IOException e) {
 					e.printStackTrace();
 				}
 			}
 		}
     }

     
}
