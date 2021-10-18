package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// 싱글톤 객체, getBean메서드는 같은 객체 리턴 -> 별도 생성을 안하는 경우 스프링은 한개의 빈 객체만을 생성 , 이때 빈 객체는 싱글톤 범위를 갖는다.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1==g2) = " + (g1 == g2));
		ctx.close();

		
	}

}
