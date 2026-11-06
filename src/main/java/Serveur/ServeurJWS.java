package Serveur;

import jakarta.xml.ws.Endpoint;
import Service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:8080/CalculatriceWS";

        Endpoint.publish(url, new Calculatrice());


        System.out.println("Service SOAP publie avec succes !");
        System.out.println("URL : " + url);
        System.out.println("WSDL : " + url + "?wsdl");

    }
}