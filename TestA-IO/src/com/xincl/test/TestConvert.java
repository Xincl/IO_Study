package com.xincl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 测试字节流（纯文本）和字符流的转换  InputStreamReader  OutputStreamWriter
 * 1.以字符流的形式操作字节流
 * 2.选择字符集
 * @author xincl
 *
 */
public class TestConvert {
     public static void main(String[] args) {
		//操作System.in和System.out
    	 try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		 BufferedWriter wb = new BufferedWriter(new OutputStreamWriter(System.out))){
    		 
    		 //循环获取键盘的输入（按exit退出），打印获取到的内容
    		 String line = "";
    		 while(!line.equals("exit")) {
    			 line = br.readLine();
    			 wb.write(line);
    			 wb.newLine();
    			 wb.flush();
    		 }
    	 }catch(IOException e) {
    		 System.out.println("输入输出异常");
    	 }
	}
}
