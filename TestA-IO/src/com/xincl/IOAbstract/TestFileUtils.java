package com.xincl.IOAbstract;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 封装流的操作，封装释放系统资源操作
 * @author xincl
 *
 */
public class TestFileUtils {
     public static void main(String[] args) {
    	//文件到文件
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("test.txt",true);
			testCopyFile(is, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		byte[] data = null;
		//文件到字节数组
		try {
			InputStream is = new FileInputStream("./images/luo.jpg");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			data = fileToByteArray(is,os);
			System.out.println(data.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//字节数组到文件
		try {
			InputStream is = new ByteArrayInputStream(data);
			OutputStream os = new FileOutputStream("./images/xiaoluoCCC.jpg",true);
			ByteArrayToFile(is, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
     
     public static void testCopyFile(InputStream is,OutputStream os) {
 		try {
 			byte[] b = new byte[1024];
 			int len = -1;
 			while((len=is.read(b))!=-1) {
 				os.write(b,0,len);
 				os.flush();
 			}
 			
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}finally {
 			close(is,os);
 		}
     }

     public static byte[] fileToByteArray(InputStream is,ByteArrayOutputStream os) {
     	//1.创建源
//     	  byte[] dest = null;
     	  
         //2.选择流
 		try {
 			//3.
 			  byte[] car = new byte[1024*100];   
 			  int len = -1;               
 	    	  while((len=is.read(car))!=-1) { 
 	    		  os.write(car,0,len);
 	    	  }
 	    	  os.flush();
 	    	  return os.toByteArray();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}finally {
 			closeable();
 		}
 		return null;
       }

     public static void ByteArrayToFile(InputStream is,OutputStream os) {
   	  try {
			byte[] bes = new byte[1024*100];
			int len = -1;
			while((len=is.read(bes))!=-1) {
				os.write(bes,0,len);
			}
			os.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeable();
		}
     }
     
     public static void close(InputStream is,OutputStream os) {
  			if(os!=null) {   //先打开后关闭,分别关闭
  				try {
  					os.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}
  			if(is!=null) {   //先打开后关闭,分别关闭
  				try {
  					is.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}
     }

     //或者close的写法可以这样写
     public static void closeable(Closeable... ios){
    	 for(Closeable io:ios) {
    			 try {
    			if(io!=null) {
					io.close();
    			}
				} catch (IOException e) {
					e.printStackTrace();
				}
    		 }
     }
}


