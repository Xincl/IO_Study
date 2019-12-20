package com.xincl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试Reader 文件字符输入流  加入缓冲流
 * 同样是四个步骤
 * 1.创建源
 * 2.选择流
 * 3.操作（读）
 * 4.释放系统资源
 * @author xincl
 *
 */
public class TestReader {
      public static void main(String[] args) {
		//1.创建源
    	  File f = new File("abc.txt");
    	  
        //2.选择流
    	  BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			//3.
			  String line = null;
	    	  while((line=reader.readLine())!=null) {  
	    		  System.out.println(line);
	    	  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader!=null) {   //当文件中可以读取到，才会执行这一句
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	  
    	
    	  
    	  
    	  
    	  
      }
}
