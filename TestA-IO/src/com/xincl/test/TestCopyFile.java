package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ʹ���ļ�������������������ļ��Ŀ���    BufferedInputStream��BufferedOutputStream
 * ���֮ǰ�İ汾�������˻����������������������
 * ����������JDK1.7���ϲ��е�try...with...source�����ͷ���Դ
 * ��luo.jpg������xiaoluo.jpg
 * @author xincl
 *
 */
public class TestCopyFile { 
     public static void main(String[] args) {
		testCopyFile("C:/Users/xincl/Desktop/aa.qlv","C:/Users/xincl/Desktop/cc.mkv");
	}
    
     public static void testCopyFile(String sr1,String sr2) {
    	 File f = new File(sr1);//Դ�ļ�
 		File f2 = new File(sr2);//Ŀ���ļ�

 		try(InputStream in = new BufferedInputStream(new FileInputStream(f));
 		    OutputStream os = new BufferedOutputStream(new FileOutputStream(f2,true))){
 			byte[] b = new byte[1024];
 			int len = -1;
 			while((len=in.read(b))!=-1) {
 				os.write(b,0,len);
 			}
 			os.flush();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }

     
}
