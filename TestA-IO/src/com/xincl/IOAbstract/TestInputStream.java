package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试InputStream  详细步骤：
 * 1.创建源
 * 2.选择流
 * 3.操作（读）
 * 4.释放系统资源
 * @author xincl
 *
 */
public class TestInputStream {
      public static void main(String[] args) {
		//1.创建源
    	  File f = new File("abc.txt");
    	  
        //2.选择流
    	  InputStream in = null;
		try {
			in = new FileInputStream(f);
			//3.
			  int temp;
	    	  while((temp=in.read())!=-1) {  //当读取的下一个字节为空，则会显示为-1
	    		  System.out.print((char)temp);
	    	  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in!=null) {   //当文件中可以读取到，才会执行这一句
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	  
    	
    	  
    	  
    	  
    	  
      }
}
