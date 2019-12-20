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
 * ��װ���Ĳ�������װ�ͷ�ϵͳ��Դ����
 * @author xincl
 *
 */
public class TestFileUtils {
     public static void main(String[] args) {
    	//�ļ����ļ�
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("test.txt",true);
			testCopyFile(is, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		byte[] data = null;
		//�ļ����ֽ�����
		try {
			InputStream is = new FileInputStream("./images/luo.jpg");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			data = fileToByteArray(is,os);
			System.out.println(data.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//�ֽ����鵽�ļ�
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
     	//1.����Դ
//     	  byte[] dest = null;
     	  
         //2.ѡ����
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
  			if(os!=null) {   //�ȴ򿪺�ر�,�ֱ�ر�
  				try {
  					os.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}
  			if(is!=null) {   //�ȴ򿪺�ر�,�ֱ�ر�
  				try {
  					is.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}
     }

     //����close��д����������д
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


