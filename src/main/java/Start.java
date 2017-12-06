import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import window.Oi;


public class Start {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context.xml");
		
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		
		//тип класса модельТ1000, создает экземпляр класса т1000 =(объектом какого класса будет т1000) находит его по айди
		//то есть идентифицирует и по айди  присваевает его екземпляру класса по имени т1000
		
		t1000.fire();
		//включает метод класса
		
		Oi oi = (Oi) context.getBean("oi");
		oi.oi();

		
	}
}
