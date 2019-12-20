package com.xincl.IO;

import java.io.UnsupportedEncodingException;

/**
 * 字节-->字符,解码
 * @author xincl
 *
 */
public class TestContent2 {
     public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "生命a性命a使命";
        
        //编码
        byte[] b = s.getBytes();
        
        //解码
        //String(数组，起始位置，要解码的数组长度，字符集）
        s = new String(b,0,b.length,"gbk");
        System.out.println(s);
        
        //够字符就不显示，不然就显示乱码
        s = new String(b,0,b.length-1,"gbk");
        System.out.println(s);
        s = new String(b,0,b.length-2,"gbk");
        System.out.println(s);
        
        
        
        
	}
}
