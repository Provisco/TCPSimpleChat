package org.academiadecodigo.serverclientchattcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by codecadet on 07/11/16.
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {

        int portNum = 5000;


        ServerSocket serverSocket = new ServerSocket(portNum);
        while (true) {

            Socket clientSocket = serverSocket.accept();//is blocking and waits until a client connects

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String message = in.readLine();
            System.out.println(message);
            out.println("Server Side: " + message.toUpperCase());

        }
    }
}