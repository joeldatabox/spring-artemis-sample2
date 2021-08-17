package br.com.example.artemis.springartemissample2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Joel Rodrigues Moreira on 16/08/2021.
 * e-mail: <a href="mailto:joel.databox@gmail.com">joel.databox@gmail.com</a>
 * @project spring-artemis-sample2
 */
@Component
public class Producer {

    @Autowired
    public Producer(final JmsTemplate template) {
        new Thread(() -> {
            System.out.println("start thread 1");
            for (int i = 0; i > -10; i++) {
                template.convertAndSend("test-1", "Thread 1 escreveu uma mensagem " + i);
            }
        }).start();

        new Thread(() -> {
            System.out.println("start thread 2");
            for (int i = 0; i > -10; i++) {
                template.convertAndSend("test-1", "Thread 2 escreveu uma mensagem " + i);
            }
        }).start();

        new Thread(() -> {
            System.out.println("start thread 3");
            for (int i = 0; i > -10; i++) {
                template.convertAndSend("test-1", "Thread 3 escreveu uma mensagem " + i);
            }
        }).start();

        new Thread(() -> {
            System.out.println("start thread 4");
            for (int i = 0; i > -10; i++) {
                template.convertAndSend("test-1", "Thread 4 escreveu uma mensagem " + i);
            }
        }).start();
    }



}
