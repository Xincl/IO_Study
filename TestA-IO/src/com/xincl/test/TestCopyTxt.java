package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用文件的输入和输出流，完成纯文本文件的拷贝  BufferedReader和BufferedWriter
 * 相比之前的版本，增加了缓冲流（处理流）提高性能
 * 还有运用了JDK1.7以上才有的try...with...source方法释放资源
 * 将luo.jpg拷贝到xiaoluo.jpg
 * @author xincl
 *
 */
public class TestCopyTxt { 
     public static void main(String[] args) {
		testCopyFile("abc.txt","test.txt");
	}
    
     public static void testCopyFile(String sr1,String sr2) {
    	 File f = new File(sr1);//源文件
 		File f2 = new File(sr2);//目的文件

 		try(BufferedReader br = new BufferedReader(new FileReader(f));
 			BufferedWriter bw = new BufferedWriter(new FileWriter(f2,true))){
 			String line = null;
 			while((line=br.readLine())!=null) {
 				bw.write(line);
 				bw.newLine();
 			}
 			bw.flush();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }

     
}
