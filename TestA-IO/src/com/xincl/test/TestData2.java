package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����DataInputStream   DataOutputStream   �ڵ�Ϊ�ļ�
 * 1.��д�����ȡ
 * 2.��������˳������ȡ����Ȼ���������
 * @author xincl
 *
 */
public class TestData2 {
     public static void main(String[] args) throws IOException {
    	File f = new File("testdata.txt");
    	BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(f));
		DataOutputStream dos =  new DataOutputStream(os); 
    	dos.writeUTF("����sss");
		dos.writeInt(1022);
		dos.writeBoolean(false);
		dos.writeChar('a');
		
		dos.flush();
    	dos.close();
    	
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
    	String msg = dis.readUTF();
		int i = dis.readInt();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
        dis.close();
		System.out.println("���������˳������� "+msg+" "+i+" "+flag+" "+c);
    	
	}
}
