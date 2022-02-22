package PACKAGE_NAME;

import java.io.*;
import java.net.*;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("client is connected");

       // scomp [options] [dirs]* [schemaFile.xsd]* [service.wsdl]* [config.xsdconfig]*
    }
}