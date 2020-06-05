package com.sharueigo.sfgdi;

import com.sharueigo.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("-------By Language");
		I18nController i18nController = (I18nController) ac.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("-------Primary");
		MyController myController = (MyController) ac.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ac.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ac.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ac.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
