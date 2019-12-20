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
 * ���Խ�һ���ļ�ת��Ϊ�ֽ����飬Ȼ����ת����ȥ��ͼƬ
 * @author xincl
 *
 */
public class Test2 {
      public static void main(String[] args) {
		byte[] a = fielToByteArray("./images/luo.jpg");
		System.out.println(a.length);
		ByteArrayToFile(a,"./images/xiaoluoAAA.jpg");
	}
      //��ͼƬת��Ϊ����
      //1.ͼƬ��������InputStream
      //2.�����ֽ����飺��ByteArrayOutputStream
      public static byte[] fielToByteArray(String path) {
    	//1.����Դ
    	  File f = new File(path);
//    	  byte[] dest = null;
    	  
        //2.ѡ����
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
			if(in!=null) {   //���ļ��п��Զ�ȡ�����Ż�ִ����һ��
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
      }
      
      //����ͼƬ
      //1.��ByteArrayInputStream���ֽ������ȡ��
      //2.��OutputStream ���ֽ�����ת��ΪͼƬ
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
