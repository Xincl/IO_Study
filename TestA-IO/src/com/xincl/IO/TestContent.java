package com.xincl.IO;

import java.io.UnsupportedEncodingException;

/**
 * 字符到字节---->编码
 * utf-8:中文三个字节，英文一个字节
 * gbk:中文两个字节，英文一个
 * utf-16:都是两个字节
 * @author xincl
 *
 */
public class TestContent {
     public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "性命生命使命a";
		
		//通常是跟随工程的编码，此工程为GBK编码
		byte[] datas = s.getBytes();
		System.out.println(datas.length);
		
		//其他字符集，例如小端utf-16
	    datas = s.getBytes("UTF-16LE");
	    System.out.println(datas.length);
	    
		//UTF-8编码集
	    datas = s.getBytes("UTF-8");
	    System.out.println(datas.length);
	    
		
	}
}
