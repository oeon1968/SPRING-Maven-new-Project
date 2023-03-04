package pl.coderslab.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailService implements MessageService {
    @Override
    public void send() {

    }

    @Override
    public void send(String message) {
        System.out.println("Sending email");
    }
}
