package com.quincy.clone;



/**
 * 
 * @author quincy
 *
 */
public class StudentDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * clone测试
		 */
		/*Student student = new Student("quincy", 24);
		
		System.out.println("==========克隆之前=======");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getClazz().getClazzName());
		System.out.println(student.getClazz().getClazzId());
		
		System.out.println("==========克隆之后=======");
		Object obj = student.clone();
		Student sClone = (Student)obj;
		System.out.println(sClone.getName());
		System.out.println(sClone.getAge());
		System.out.println(sClone.getClazz().getClazzName());
		System.out.println(sClone.getClazz().getClazzId());
		
		System.out.println("==========对对象进行修改后原来的student输出=======");
		student.setName("daqing");
		System.out.println(student.getName());
		System.out.println("==========对对象进行修改后原来的sClone输出=======");
		//院里的对象改变克隆之后的对象完全没有改变
		System.out.println(sClone.getName());
		
		//测试深度克隆
		
		sClone.getClazz().setClazzName("深度克隆");
		sClone.getClazz().setClazzId(2);
		
		System.out.println("==========改变克隆之后，输出原来的对象=======");
		//发现原来的对象也会改变
		System.out.println(student.getClazz().getClazzName());
		System.out.println(student.getClazz().getClazzId());
		*/
		
		/**
		 * equals测试
		 */
		Student student = new Student("quincymiau",24);
		
		Student student2 = new Student("quincymiau",24);
		
		/**
		 * 输出结果两个不相同
		 */
		System.out.println(student == student2);
		System.out.println(student.equals(student2));
		
		/**
		 * 重写equeals方法之后
		 */
		
		
	}
}
