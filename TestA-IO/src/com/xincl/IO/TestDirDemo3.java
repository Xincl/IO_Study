package com.xincl.IO;

import java.io.File;

/**
 * 测试列出所有级别的文件
 * 列出下一级文件名称
 * 测试长度
 * @author xincl
 *
 */
public class TestDirDemo3 {
	  private static long len = 0;
      public static void main(String[] args) {
    	  File file = new File("C:/Users/xincl/Desktop/Java/测试");
    	  
//    	  test01(file, 0);
//    	  test02(1);
//    	  System.out.println(test03(10));
          test04(file); 
          System.out.println(len);
    	  
      }
      
      //打印子孙级文件目录与名称
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
            
      //利用递归实现 1-10
      public static void test02(int n) {
    	  if(n>10) {
    		  return;
    	  }
    	  System.out.print(n+"\t");
    	  test02(n+1);
      }

      //利用递归调用实现阶乘
      public static long test03(int n) {
    	  if(n==0) {
    		 return 1;
    	  }else {
    		  return n*test03(n-1);
    	  }
    	  
      }
      
      //利用递归调用计算文件的长度
      public static void test04(File file) {
    	  //获取大小
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
