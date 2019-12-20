package com.xincl.IO;

import java.io.File;

/**
 * 列出下一级名称
 * @author xincl
 *
 */
public class TestDirDemo2 {
    public static void main(String[] args) {
		File dir = new File("C:/Users/xincl/Desktop/Java/测试");
    	
    	//列出下级名称  list()
    	String[] sub = dir.list();
    	for(String temp:sub) {
    		System.out.println(temp);
    	}
    	
    	//列出下级对象  listFile()
    	File[] file = dir.listFiles();
    	for(File t:file) {
    		System.out.println(t.getAbsolutePath());
    	}
    	
    	//列出所有盘符   listRoots()
    	@SuppressWarnings("static-access")
		File[] root = dir.listRoots();
    	for(File a:root) {
    		System.out.println(a.getAbsolutePath());
    	}
	}
}
