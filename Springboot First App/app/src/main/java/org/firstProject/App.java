/*
 * This source file was generated by the Gradle 'init' task
 */
package org.firstProject;

import org.firstProject.bean.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
            UserConfig userConfig = (UserConfig) context.getBean("userConfigBean");
            System.out.println("User Name: " + userConfig.getName());
            System.out.println("Class Name: " + userConfig.getClassName());
            SpringApplication.run(App.class, args);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
