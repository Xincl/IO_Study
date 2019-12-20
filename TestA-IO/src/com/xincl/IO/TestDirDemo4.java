package com.xincl.IO;

import java.io.File;

/**
 * 使用面向对象，来计算文件的大小
 * 将方法封装起来
 * @author xincl
 *	
 */
public class TestDirDemo4 {
	 //大小
     private long len = 0;
     //文件
     private String path;
     //源文件
     private File src;
     //文件个数
     private int fileSize = 0;
     //文件夹个数
     private int dirSize = -1;
	public TestDirDemo4(String path) {
		super();
		this.setPath(path);
		src = new File(path);
		test04(src);
		
	}
     public static void main(String[] args) {
		TestDirDemo4 t1 = new TestDirDemo4("C:/Users/xincl/Desktop/Java/测试");
		System.out.println(t1.getLen()+"   文件夹个数-->"+t1.getDirSize()+"    文件个数-->"+t1.getFileSize());
		   
	}
     public void test04(File file) {
   	  //获取大小
   	  if((file!=null) && (file.exists())) {
   		  if(file.isFile()) {
   		      len += file.length();
   		      this.fileSize++;
   	      }else {
   	    	  this.dirSize++;
   		        for(File s:file.listFiles()) {
   			  test04(s);
   		        }
   	      }
   	   }
     }
	public long getLen() {
		return len;
	}
	public void setLen(long len) {
		this.len = len;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public int getDirSize() {
		return dirSize;
	}
	public void setDirSize(int dirSize) {
		this.dirSize = dirSize;
	}
    
}
