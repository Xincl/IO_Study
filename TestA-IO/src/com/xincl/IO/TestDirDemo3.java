package com.xincl.IO;

import java.io.File;

/**
 * �����г����м�����ļ�
 * �г���һ���ļ�����
 * ���Գ���
 * @author xincl
 *
 */
public class TestDirDemo3 {
	  private static long len = 0;
      public static void main(String[] args) {
    	  File file = new File("C:/Users/xincl/Desktop/Java/����");
    	  
//    	  test01(file, 0);
//    	  test02(1);
//    	  System.out.println(test03(10));
          test04(file); 
          System.out.println(len);
    	  
      }
      
      //��ӡ���Ｖ�ļ�Ŀ¼������
      public static void test01(File file,int deep) {
    	  for(int i=0;i<deep;i++) {
    		  System.out.print("-");
    	  }
    	  System.out.println(file.getName());
    	  if((file == null) || !file.exists()) {
    		  return;
    	  }else if(file.isDirectory()) {
    		  for(File s:file.listFiles()) {
    			  test01(s,deep+1);
    		  }
    	  }
      }
            
      //���õݹ�ʵ�� 1-10
      public static void test02(int n) {
    	  if(n>10) {
    		  return;
    	  }
    	  System.out.print(n+"\t");
    	  test02(n+1);
      }

      //���õݹ����ʵ�ֽ׳�
      public static long test03(int n) {
    	  if(n==0) {
    		 return 1;
    	  }else {
    		  return n*test03(n-1);
    	  }
    	  
      }
      
      //���õݹ���ü����ļ��ĳ���
      public static void test04(File file) {
    	  //��ȡ��С
    	  if((file!=null) && (file.exists())) {
    		  if(file.isFile()) {
    		      len += file.length();
    	      }else {
    		        for(File s:file.listFiles()) {
    			  test04(s);
    		        }
    	      }
    	  }
      }
            
}
