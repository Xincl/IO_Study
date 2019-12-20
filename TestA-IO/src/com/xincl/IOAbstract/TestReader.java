package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 测试Reader 文件字符输入流
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
    	  Reader reader = null;
		try {
			reader = new FileReader(f);
			//3.
			  char[] car = new char[1024];    //数组 大小的含义是按该数组的大小进行分段读取,缓冲容器，1k读取
			  int len = -1;                //是按照数组的分段读取来统计大小
	    	  while((len=reader.read(car))!=-1) {  //当读取到空值是，len会返回-1
	    		  String str = new String(car,0,len);
	    		  System.out.println(str);
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
