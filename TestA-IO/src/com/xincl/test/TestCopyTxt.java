package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ļ�����������������ɴ��ı��ļ��Ŀ���  BufferedReader��BufferedWriter
 * ���֮ǰ�İ汾�������˻����������������������
 * ����������JDK1.7���ϲ��е�try...with...source�����ͷ���Դ
 * ��luo.jpg������xiaoluo.jpg
 * @author xincl
 *
 */
public class TestCopyTxt { 
     public static void main(String[] args) {
		testCopyFile("abc.txt","test.txt");
	}
    
     public static void testCopyFile(String sr1,String sr2) {
    	 File f = new File(sr1);//Դ�ļ�
 		File f2 = new File(sr2);//Ŀ���ļ�

 		try(BufferedReader br = new BufferedReader(new FileReader(f));
 			BufferedWriter bw = new BufferedWriter(new FileWriter(f2,true))){
 			String line = null;
 			while((line=br.readLine())!=null) {
 				bw.write(line);
 				bw.newLine();
 			}
 			bw.flush();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }

     
}
