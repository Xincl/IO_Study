package com.xincl.IOAbstract;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 测试将一个文件转换为字节数组，然后在转换回去成图片
 * @author xincl
 *
 */
public class Test2 {
      public static void main(String[] args) {
		byte[] a = fielToByteArray("./images/luo.jpg");
		System.out.println(a.length);
		ByteArrayToFile(a,"./images/xiaoluoAAA.jpg");
	}
      //将图片转换为数组
      //1.图片到程序，用InputStream
      //2.程序到字节数组：用ByteArrayOutputStream
      public static byte[] fielToByteArray(String path) {
    	//1.创建源
    	  File f = new File(path);
//    	  byte[] dest = null;
    	  
        //2.选择流
    	  InputStream in = null;
    	  ByteArrayOutputStream is = null;
		try {
			in = new FileInputStream(f);
			is = new ByteArrayOutputStream();
			//3.
			  byte[] car = new byte[1024*100];   
			  int len = -1;               
	    	  while((len=in.read(car))!=-1) { 
	    		  is.write(car,0,len);
	    	  }
	    	  is.flush();
	    	  return is.toByteArray();
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
		return null;
      }
      
      //程序到图片
      //1.用ByteArrayInputStream将字节数组读取到
      //2.用OutputStream 将字节数组转换为图片
      public static void ByteArrayToFile(byte[] b,String path) {
    	  File f = new File(path);
    	  
    	  InputStream in = null;
    	  OutputStream os = null;
    	  try {
    		in = new ByteArrayInputStream(b); 
			os = new FileOutputStream(f,true);
			
			byte[] bes = new byte[1024*100];
			int len = -1;
			while((len=in.read(bes))!=-1) {
				os.write(bes,0,len);
			}
			os.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
      }
      
      
      
}
