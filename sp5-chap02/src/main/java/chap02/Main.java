package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//자바 클래스에서 정보를 읽어와 객체 생성과 초기화를 수행 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		//자바설정에서 정보를 읽어와 빈 객체를 생성하고 관리, AppContext 클래스를 생성자 파라미터로 전달
		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();

	}

}
