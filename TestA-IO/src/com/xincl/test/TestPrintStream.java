package com.xincl.test;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * ���Դ�ӡ��
 * @author xincl
 *
 */
public class TestPrintStream {
     public static void main(String[] args) throws FileNotFoundException {
		PrintStream p = System.out;
		p.println("xincl");
		p.println(true);
		
		p = new PrintStream(new BufferedOutputStream(new FileOutputStream("testPrint.txt")),true);   //Ϊtrue �Զ�ˢ��
		p.println("���Դ�ӡ��");
		p.println(true);
//		p.flush();
		p.close();
		
		//�ض����ļ�
		System.setOut(p);
		System.out.println("change");
		
		//�ض��򵽿���̨
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("i will be back!");
	}
     
     
     
     
     
     
}
