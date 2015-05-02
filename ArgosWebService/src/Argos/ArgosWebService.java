package Argos;

/**
 * Created by Matheus on 02/05/2015.
 * Publicação Argos Web Service
 */

import javax.xml.ws.Endpoint;

public class ArgosWebService {
    public static void main (String[] args){
        Endpoint.publish("http://localhost:8080/Argos", new Argos());
    }
}
