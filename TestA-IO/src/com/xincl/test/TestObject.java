package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ����ObjectInputStream��Ϊ�����л�,ObjectOutputSream���̳�Ϊ���л���
 * 1.��д�����ȡ
 * 2.��������˳������ȡ����Ȼ���������
 * 3.�������ж��󶼿������л�
 * @author xincl
 *
 */
public class TestObject {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
    	//���
    	ByteArrayOutputStream bes = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(bes));
		//������������+����
		oos.writeUTF("����");
		oos.writeInt(10);
		oos.writeBoolean(false);
		oos.writeChar('a');
		//д��-->������л�
		oos.writeObject("�ҵĹ��¶��ǹ����㰡");
		oos.writeObject(new Date());
		Employee e = new Employee("xincl", 50000);
		oos.writeObject(e);
		oos.flush();
		byte[] datas = bes.toByteArray();

		//��ȡ
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		String msg = ois.readUTF();
		int i = ois.readInt();
		boolean flag = ois.readBoolean();
		char c = ois.readChar();
		
		System.out.println("���������˳������� "+msg+" "+i+" "+flag+" "+c);
		//��ȡ-->��з����л�
		Object object1 = ois.readObject();
		Object object2 = ois.readObject();
		Object object3 = ois.readObject();
		
		//�������ת��
		if(object1 instanceof String) {
			String obj = (String)object1;
			System.out.println(obj);
		}
		if(object2 instanceof Date) {
			Date objdate = (Date)object2;
			System.out.println(objdate);
		}
		if(object3 instanceof Employee) {
			Employee objemp = (Employee)object3;
			System.out.println(objemp.getName()+"--->"+objemp.getSalary());
		}
		

	}
}

@SuppressWarnings("serial")
//javabean
class Employee implements java.io.Serializable{   //����"ͨ��֤"serializable�ſ��Խ��ж�������л�
	private transient String name;   //�����ݲ���Ҫ���л�������͸�����������ݿ��Բ���ʾ
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}




