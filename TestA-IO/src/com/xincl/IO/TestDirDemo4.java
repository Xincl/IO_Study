package com.xincl.IO;

import java.io.File;

/**
 * ʹ����������������ļ��Ĵ�С
 * ��������װ����
 * @author xincl
 *	
 */
public class TestDirDemo4 {
	 //��С
     private long len = 0;
     //�ļ�
     private String path;
     //Դ�ļ�
     private File src;
     //�ļ�����
     private int fileSize = 0;
     //�ļ��и���
     private int dirSize = -1;
	public TestDirDemo4(String path) {
		super();
		this.setPath(path);
		src = new File(path);
		test04(src);
		
	}
     public static void main(String[] args) {
		TestDirDemo4 t1 = new TestDirDemo4("C:/Users/xincl/Desktop/Java/����");
		System.out.println(t1.getLen()+"   �ļ��и���-->"+t1.getDirSize()+"    �ļ�����-->"+t1.getFileSize());
		   
	}
     public void test04(File file) {
   	  //��ȡ��С
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
