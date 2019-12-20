package com.xincl.test;
/**
 * ��������
 * ʵ�ַŴ����������ķŴ�
 * @author xincl
 *
 */
public class TestDecorate {
      public static void main(String[] args) {
		Person p  = new Person();
		p.say();
		
		Amplifier a = new Amplifier(p);
		a.say();
	}
}
interface Say{
	void say();
}

class Person implements Say{
    private int voice = 10;
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	@Override
	public void say() {
		System.out.println("����Ľ���Ϊ:  "+this.getVoice()+"�ֱ�");
	}
	
}

class Amplifier implements Say{
    Person p = new Person();
    
	public Amplifier(Person p) {
		super();
		this.p = p;
	}

	@Override
	public void say() {
		System.out.println("�����Ŵ�֮���˵�����Ϊ�� "+p.getVoice()*100+"�ֱ�");
	}
	
}






