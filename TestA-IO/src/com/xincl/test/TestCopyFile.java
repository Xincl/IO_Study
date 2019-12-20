package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 使用文件的输入和输出流，完成文件的拷贝    BufferedInputStream和BufferedOutputStream
 * 相比之前的版本，增加了缓冲流（处理流）提高性能
 * 还有运用了JDK1.7以上才有的try...with...source方法释放资源
 * 将luo.jpg拷贝到xiaoluo.jpg
 * @author xincl
 *
 */
public class TestCopyFile { 
     public static void main(String[] args) {
		testCopyFile("C:/Users/xincl/Desktop/aa.qlv","C:/Users/xincl/Desktop/cc.mkv");
	}
    
     public static void testCopyFile(String sr1,String sr2) {
    	 File f = new File(sr1);//源文件
 		File f2 = new File(sr2);//目的文件

 		try(InputStream in = new BufferedInputStream(new FileInputStream(f));
 		    OutputStream os = new BufferedOutputStream(new FileOutputStream(f2,true))){
 			byte[] b = new byte[1024];
 			int len = -1;
 			while((len=in.read(b))!=-1) {
 				os.write(b,0,len);
 			}
 			os.flush();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }

     
}
