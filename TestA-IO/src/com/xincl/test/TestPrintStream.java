package com.xincl.test;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 测试打印流
 * @author xincl
 *
 */
public class TestPrintStream {
     public static void main(String[] args) throws FileNotFoundException {
		PrintStream p = System.out;
		p.println("xincl");
		p.println(true);
		
		p = new PrintStream(new BufferedOutputStream(new FileOutputStream("testPrint.txt")),true);   //为true 自动刷新
		p.println("测试打印流");
		p.println(true);
//		p.flush();
		p.close();
		
		//重定向到文件
		System.setOut(p);
		System.out.println("change");
		
		//重定向到控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("i will be back!");
	}
     
     
     
     
     
     
}
