package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
       /* HelloWorld myClass = (HelloWorld) context.getBean("helloWorld");
        myClass.printMessage();
       System.out.println(myClass.getMessage());*/

       /* EmailService myService = (EmailService) context.getBean("emilService");
        myService.send();*/

        MessageSender mySender = (MessageSender) context.getBean("messageSender");
     //   mySender.sendMessage();
        mySender.sendMessageFromProperty();
    }
}
