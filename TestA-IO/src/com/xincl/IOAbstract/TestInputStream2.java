package com.xincl.IOAbstract;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试ByteArrayInputStream
 * 同样是四个步骤，一段一段的读取数据
 * 1.创建源:创建字节数组，不要太大
 * 2.选择流
 * 3.操作（读）
 * 4.释放系统资源   此地close为空方法
 * @author xincl
 *
 */
public class TestInputStream2 {
      public static void main(String[] args) {
		//1.创建源
    	  byte[] b = "Talk is cheap,show me the code".getBytes();
    	  
        //2.选择流
    	  InputStream in = null;
		try {
			in = new ByteArrayInputStream(b);
			//3.
			  byte[] car = new byte[1024];    //数组 大小的含义是按该数组的大小进行分段读取,缓冲容器，1k读取
			  int len = -1;                //是按照数组的分段读取来统计大小
	    	  while((len=in.read(car))!=-1) {  //当读取到空值是，len会返回-1
	    		  String str = new String(car,0,len);  //解码
	    		  System.out.println(str);
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
