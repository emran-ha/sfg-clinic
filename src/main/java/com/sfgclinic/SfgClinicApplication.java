package com.sfgclinic;

import com.sfgclinic.controller.MyController;
import com.sfgclinic.datasource.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SfgClinicApplication  {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgClinicApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println(controller.hello());
		System.out.println(dataSource.getPassword());

	}


}
