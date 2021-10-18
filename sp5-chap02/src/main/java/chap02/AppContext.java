package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuration annotation은 해당 클래스를 스프링 설정 클래스로 지정
@Configuration
public class AppContext {

	//Spring이 생성하는 객체를 Bean 객체라고 부르는데, 이 빈 객체에 대한 정보를 담고 있는 메서드가 greeter()이다 
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
