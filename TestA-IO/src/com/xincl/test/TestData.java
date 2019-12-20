package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ����DataInputStream   DataOutputStream   ����ԴΪ�ֽ�����
 * 1.��д�����ȡ
 * 2.��������˳������ȡ����Ȼ���������
 * @author xincl
 *
 */
public class TestData {
     public static void main(String[] args) throws IOException {
    	//���
    	ByteArrayOutputStream bes = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bes));
		//������������+����
		dos.writeUTF("����");
		dos.writeInt(10);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = bes.toByteArray();

		//��ȡ
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		String msg = dis.readUTF();
		int i = dis.readInt();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
		
		System.out.println("���������˳������� "+msg+" "+i+" "+flag+" "+c);

	}
}
