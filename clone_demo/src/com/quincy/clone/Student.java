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
		if (obj == null) {// 传入的对象为null的时候直接返回false,没有必要去比较
			return false;
		}
		// this代表当前类的对象，也就是表示这个类中的Student
		if (this == obj) { // ==比较的是地址，两个对象的地址相同说明他们是同一个对象
			return true;// 同一个对象，直接返回true
		}

		if (this.getClass() != obj.getClass()) {// 如果这两个类的字节码文件不相同，直接返回false
			return false;
		}
		Student student = (Student) obj;// obj是一个Student对象的时候需要转换
		// 因为需要使用到student中的字段制定自己的比对规则，obj在没有转换之前是一个Objet对象,是没有字段的
		// 在对传入的字符串都需要做检测

		if (student.getAge() == this.getAge()
				&& student.getName().equals(this.getName())) {
			return true;
		}

		return false;
	}

}
