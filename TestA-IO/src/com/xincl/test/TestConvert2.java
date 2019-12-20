package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 测试字节流（纯文本）和字符流的转换  InputStreamReader  OutputStreamWriter   openStream
 * 1.以字符流的形式操作字节流
 * 2.选择字符集
 * @author xincl
 *
 */
public class TestConvert2 {
     public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
				new URL("https://www.baidu.com").openStream(),"UTF-8"));
			BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
			    new FileOutputStream("baidu.html"),"gbk"));){
			String line = "";
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				bw.write(line);
				bw.newLine();
    		 }
			 bw.flush();
    	 }catch(IOException e) {
    		 System.out.println("输入输出异常");
    	 }
	}
}
