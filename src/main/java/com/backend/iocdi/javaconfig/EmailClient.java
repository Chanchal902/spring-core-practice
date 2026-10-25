package com.backend.iocdi.javaconfig;

public class EmailClient {
    private final String host;
    private final int port;

    public EmailClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void send(String msg) {
        System.out.println("Sending '" + msg + "' via " + host + ":" + port);
    }
}
