package com.xincl.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 测试随机流切割文件大小	
 * @author xincl
 *
 */
public class TestRand {
     public static void main(String[] args) throws IOException {
		
//		test01();
//		test02();
    	 //分多少块
    	 File f = new File("test.txt");
    	 //总长度
    	 long len = f.length();
    	 //每块大小
    	 int size = 10;
    	 //能分多少块
    	 int num = (int)Math.ceil(len*1.0/size);
    	 
    	 System.out.println(num);
    	 
    	 //实际位置和实际大小
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
     
     //读取下标2，以后的所有内容
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
     
     //读取小标2，以后所需要的范围内的内容
     public static void test02(int i,int begin,int actualSize) throws IOException {
    	 RandomAccessFile raf = new RandomAccessFile(new File("test.txt"), "r");
    	 
    	 //起始位置
    	 
    	 //实际大小
    	 
    	 //随机读取
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










