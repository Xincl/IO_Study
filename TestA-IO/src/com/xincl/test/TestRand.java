package com.xincl.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����������и��ļ���С	
 * @author xincl
 *
 */
public class TestRand {
     public static void main(String[] args) throws IOException {
		
//		test01();
//		test02();
    	 //�ֶ��ٿ�
    	 File f = new File("test.txt");
    	 //�ܳ���
    	 long len = f.length();
    	 //ÿ���С
    	 int size = 10;
    	 //�ֶܷ��ٿ�
    	 int num = (int)Math.ceil(len*1.0/size);
    	 
    	 System.out.println(num);
    	 
    	 //ʵ��λ�ú�ʵ�ʴ�С
    	 int begin = 0;
    	 int actualSize = (int)(size>len?len:size);
    	 for(int i=0;i<num;i++) {
    		 begin = i*size;
    		 
    		 if(i==num-1) {
    			 actualSize = (int)len;
    		 }else {
    			 actualSize = size;
    			 len -= actualSize;
    		 }
    		 System.out.println(i+"-->"+begin+"-->"+actualSize);
    		 test02(i, begin, actualSize);
    	 }
    	 
    	 
    	 
    	 
	}
     
     //��ȡ�±�2���Ժ����������
     public static void test01() throws IOException {
    	 RandomAccessFile raf = new RandomAccessFile(new File("test.txt"), "r");
    	 
    	 raf.seek(2);
    	 
    	 byte[] datas = new byte[20];
    	 int len = -1;
    	 while((len=raf.read(datas))!=-1) {
    		 System.out.println(new String(datas,0,len));
    	 }
    	 raf.close();
     }
     
     //��ȡС��2���Ժ�����Ҫ�ķ�Χ�ڵ�����
     public static void test02(int i,int begin,int actualSize) throws IOException {
    	 RandomAccessFile raf = new RandomAccessFile(new File("test.txt"), "r");
    	 
    	 //��ʼλ��
    	 
    	 //ʵ�ʴ�С
    	 
    	 //�����ȡ
    	 raf.seek(begin);
    	 
    	 byte[] datas = new byte[20];
    	 int len = -1;
    	 while((len=raf.read(datas))!=-1) {
    		 if(actualSize>len) {
    			 System.out.println(new String(datas,0,len));
    			 actualSize -= len;
    		 }else {
    			 System.out.println(new String(datas,0,actualSize));
    			 break;
    		 }
    	 }
    	 raf.close();
     }
     
}










