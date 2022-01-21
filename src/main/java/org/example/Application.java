package org.example;

import org.example.component.SocketServer2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        SocketServer server = new SocketServer();
//        server.startSocketServer(8888);

        new Thread(new SocketServer2(8765)).start();
    }
}
