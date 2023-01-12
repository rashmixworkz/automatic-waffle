package com.xworkz.Spring_beanTask.configration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Spring_beanTask")
public class SpringConfigurationUsingAutowired {
	
	
	public SpringConfigurationUsingAutowired() {
System.out.println("default const of SpringConfigurationUsingAutowired");
	}
	
	
	@Bean
	public String newsPaperId() {
		System.out.println("Registering newsPaperId with spring ");
		return "2pv34";
	}
	@Bean
	public String paperName() {
		System.out.println("Registering paperName with spring");
		return "Kannada Prabha";
	}
	@Bean
	public String owner() {
		System.out.println("Registering owner with spring");
		return "Prakash";
	}
	@Bean
	public String paperLanguage() {
		System.out.println("Registering paperLanguage with spring");
		return "Kannada";
	}
	@Bean
	public double cost() {
		System.out.println("Registering cost with spring");
		return 7;
	}
	
	
	
	
	
	@Bean
	public String engineName() {
		System.out.println("Registering engineName with spring ");
		return "petrol engine";
	}
	@Bean
	public String typeOfEngine() {
		System.out.println("Registering typeOfEngine with spring");
		return "DC";
	}
	@Bean
	public int EngineNo() {
		System.out.println("Registering EngineNo with spring");
		return 534;
	}
	@Bean
	public double engineVersion() {
		System.out.println("Registering engineVersion with spring");
		return 4.5;
	}
	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany with spring");
		return "Bosch";
	}
	@Bean
	public int engineStrokes() {
		System.out.println("Registering engineStrokes with spring");
		return 4;
	}
	
	
	
	
	
	

	@Bean
	public String GhostName() {
		System.out.println("Registering GhostName with spring ");
		return "Prarana";
	}
	@Bean
	public String gender() {
		System.out.println("Registering gender with spring");
		return "femail";
	}
	@Bean
	public String colorOfGhost() {
		System.out.println("Registering colorOfGhost with spring");
		return "blue";
	}
	@Bean
	public int hair() {
		System.out.println("Registering hair with spring");
		return 7;
	}
	@Bean
	public int nail() {
		System.out.println("Registering nail with spring");
		return 3;
	}
	@Bean
	public int ageOfGhost() {
		System.out.println("Registering ageOfGhost with spring");
		return 44;
	}

	@Bean
	public double ghostWeight() {
		System.out.println("Registering ghostWeight with spring ");
		return 34;
	}
	@Bean
	public double ghostHeight() {
		System.out.println("Registering ghostHeight with spring");
		return 5;
	}
	@Bean
	public int sibling() {
		System.out.println("Registering owner with spring");
		return 9;
	}
	@Bean
	public int cousine() {
		System.out.println("Registering sibling with spring");
		return 45;
	}
	@Bean
	public String father() {
		System.out.println("Registering father with spring");
		return "--";
	}
	@Bean
	public String mother() {
		System.out.println("Registering mother with spring");
		return "--";
	}

	@Bean
	public String brother() {
		System.out.println("Registering brother with spring ");
		return "--";
	}
	@Bean
	public String sister() {
		System.out.println("Registering sister with spring");
		return "--";
	}
	@Bean
	public LocalDate birth() {
		System.out.println("Registering birth with spring");
		return LocalDate.of(1345, 9, 26) ;
	}
	@Bean
	public LocalDate death() {
		System.out.println("Registering death with spring");
		return LocalDate.of(2104, 11, 18);
	}
	@Bean
	public String study() {
		System.out.println("Registering study with spring");
		return "BE";
	}
	@Bean
	public String branchOfGhost() {
		System.out.println("Registering branchOfGhost with spring");
		return "mechanical";
	}
	@Bean
	public String reason() {
		System.out.println("Registering reason with spring");
		return "Succide";
	}
	@Bean
	public String lang() {
		System.out.println("Registering lang with spring");
		return "Spanish";
	}
	
	
	
	
	@Bean
	public String nameOfSnake() {
		System.out.println("Registering nameOfSnake with spring");
		return "kobra";
	}
	@Bean
	public String types() {
		System.out.println("Registering types with spring");
		return "--";
	}
	@Bean
	public String colors() {
		System.out.println("Registering colors with spring");
		return "green";
	}
	@Bean
	public double lengths() {
		System.out.println("Registering lengths with spring");
		return 4.2;
	}
	@Bean
	public boolean dangous() {
		System.out.println("Registering dangous with spring");
		return false;
	}
	
	
	
	
	
	
	

	
}
