package org.academiadecodigo.serverclientchattcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by codecadet on 07/11/16.
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {

        int portNum = 5000;

        Socket clientSocket = new Socket("localhost", portNum);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String something = "yadayadayada";

        out.println(something);
        System.out.println(in.readLine());


    }
}
