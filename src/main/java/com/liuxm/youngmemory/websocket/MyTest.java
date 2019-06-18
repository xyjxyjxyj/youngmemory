package com.liuxm.youngmemory.websocket;

import org.java_websocket.WebSocket;

import java.net.URI;


public class MyTest {
    public static void main(String[] arg0){

        URI uri = URI.create("/websocket");
        MyWebSocketClient myClient = new MyWebSocketClient(uri);
        myClient.connect();
        while (!myClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)){
            System.out.println("正在连接...");
        }
        // 往websocket服务端发送数据
        myClient.send("此为要发送的数据内容");
    }
}
