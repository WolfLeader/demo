package com.quincy.clone;



/**
 * 
 * @author quincy
 *
 */
public class StudentDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * clone����
		 */
		/*Student student = new Student("quincy", 24);
		
		System.out.println("==========��¡֮ǰ=======");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getClazz().getClazzName());
		System.out.println(student.getClazz().getClazzId());
		
		System.out.println("==========��¡֮��=======");
		Object obj = student.clone();
		Student sClone = (Student)obj;
		System.out.println(sClone.getName());
		System.out.println(sClone.getAge());
		System.out.println(sClone.getClazz().getClazzName());
		System.out.println(sClone.getClazz().getClazzId());
		
		System.out.println("==========�Զ�������޸ĺ�ԭ����student���=======");
		student.setName("daqing");
		System.out.println(student.getName());
		System.out.println("==========�Զ�������޸ĺ�ԭ����sClone���=======");
		//Ժ��Ķ���ı��¡֮��Ķ�����ȫû�иı�
		System.out.println(sClone.getName());
		
		//������ȿ�¡
		
		sClone.getClazz().setClazzName("��ȿ�¡");
		sClone.getClazz().setClazzId(2);
		
		System.out.println("==========�ı��¡֮�����ԭ���Ķ���=======");
		//����ԭ���Ķ���Ҳ��ı�
		System.out.println(student.getClazz().getClazzName());
		System.out.println(student.getClazz().getClazzId());
		*/
		
		/**
		 * equals����
		 */
		Student student = new Student("quincymiau",24);
		
		Student student2 = new Student("quincymiau",24);
		
		/**
		 * ��������������ͬ
		 */
		System.out.println(student == student2);
		System.out.println(student.equals(student2));
		
		/**
		 * ��дequeals����֮��
		 */
		
		
	}
}
