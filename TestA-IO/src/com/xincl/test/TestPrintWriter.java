package com.xincl.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 测试打印流
 * @author xincl
 *
 */
public class TestPrintWriter {
     public static void main(String[] args) throws FileNotFoundException{
         PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("testPrint.txt")),true);
         pw.println("这里是PrintWriter");
         pw.println(false);
         pw.close();
     }    
     
     
     
}
