package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


/**
 * 测试代码，输入输出
 * @author xincl
 *
 */
public class Test {
       public static void main(String[] args) {
//		  testInputStream();
//		  testOutputStream();
//		  testReader();
    	  testWriter(); 
	}
       
       public static void testInputStream() {
    	   File f = new File("abc.txt");
    	   InputStream is = null;
    	   try {
			is = new FileInputStream(f);
			byte[] b = new byte[1024];
			int len = -1;
			while((len=is.read(b))!=-1) {
				String str = new String(b,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
	    	   if(is!=null) {
	    		   try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	   }
	       }
       }
       
       public static void testOutputStream() {
    	   File f = new File("test.txt");
    	   
    	   OutputStream os = null;
    	   
    	   try {
			os = new FileOutputStream(f,true);
			String s = "xincl is her boyfriend";
			byte[] b = s.getBytes();
			os.write(b,0,b.length);
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	   
    	   
    	   
    	   
       }
       
       public static void testReader() {
    	   File f = new File("abc.txt");
    	   Reader reader = null;
    	   
    	   try {
			reader = new FileReader(f);
			char[] c = new char[1024];
			int len = -1;
			while((len=reader.read(c))!=-1) {
				String str = new String(c,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
       }
       
       public static void testWriter() {
    	   File f = new File("abc.txt");
    	   
    	   Writer writer = null;
    	   
    	   try {
			writer = new FileWriter(f,true);
			String str = "我想啊  I miss you";
			writer.append(str);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
       }
       
       
}
