package com.xincl.IO;

import java.io.File;

/**
 * �г���һ������
 * @author xincl
 *
 */
public class TestDirDemo2 {
    public static void main(String[] args) {
		File dir = new File("C:/Users/xincl/Desktop/Java/����");
    	
    	//�г��¼�����  list()
    	String[] sub = dir.list();
    	for(String temp:sub) {
    		System.out.println(temp);
    	}
    	
    	//�г��¼�����  listFile()
    	File[] file = dir.listFiles();
    	for(File t:file) {
    		System.out.println(t.getAbsolutePath());
    	}
    	
    	//�г������̷�   listRoots()
    	@SuppressWarnings("static-access")
		File[] root = dir.listRoots();
    	for(File a:root) {
    		System.out.println(a.getAbsolutePath());
    	}
	}
}
