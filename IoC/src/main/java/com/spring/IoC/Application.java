package com.spring.IoC;

import javafx.print.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }

}
