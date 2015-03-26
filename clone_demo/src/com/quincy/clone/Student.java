package com.quincy.clone;


public class Student implements Cloneable {

	private String name;
	private int age;
	private Clazz clazz = new Clazz("yiban", 1);

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.setClazz((Clazz) student.getClazz().clone());
		return student;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {// ����Ķ���Ϊnull��ʱ��ֱ�ӷ���false,û�б�Ҫȥ�Ƚ�
			return false;
		}
		// this����ǰ��Ķ���Ҳ���Ǳ�ʾ������е�Student
		if (this == obj) { // ==�Ƚϵ��ǵ�ַ����������ĵ�ַ��ͬ˵��������ͬһ������
			return true;// ͬһ������ֱ�ӷ���true
		}

		if (this.getClass() != obj.getClass()) {// �������������ֽ����ļ�����ͬ��ֱ�ӷ���false
			return false;
		}
		Student student = (Student) obj;// obj��һ��Student�����ʱ����Ҫת��
		// ��Ϊ��Ҫʹ�õ�student�е��ֶ��ƶ��Լ��ıȶԹ���obj��û��ת��֮ǰ��һ��Objet����,��û���ֶε�
		// �ڶԴ�����ַ�������Ҫ�����

		if (student.getAge() == this.getAge()
				&& student.getName().equals(this.getName())) {
			return true;
		}

		return false;
	}

}
