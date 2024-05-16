package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("NetworkClient = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect = " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + ", message = " + message);
    }

    public void disconnect() {
        System.out.println("NetworkClient.disconnect : " + url);
    }

    @PostConstruct
    public void init() {
        connect();
        call("초기화 연결");
    }

    @PreDestroy
    public void close() {
        disconnect();
    }
}
