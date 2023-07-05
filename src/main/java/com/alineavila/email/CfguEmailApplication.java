package com.alineavila.email;

import com.alineavila.email.models.Destinatario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CfguEmailApplication {

    static FastexcelHelper fastexcelHelper = new FastexcelHelper();
    static ArrayList<Destinatario> destinatarios = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        SpringApplication.run(CfguEmailApplication.class, args);
        lerExcel();
    }

    public static void lerExcel() throws IOException {

        Map<Integer, List<String>> resultado = fastexcelHelper.readExcel("C:/Users/liine/Documents/cfgu/testeTecnofit.xlsx");
        resultado.forEach((numeroLinha, lista) -> {
            destinatarios.add(new Destinatario(numeroLinha,lista.get(1).split(" ")[0],lista.get(3)));
        });


        enviarEmail(destinatarios);

    }

    public static void enviarEmail(ArrayList<Destinatario> destinatarios) {
        // TODO: fazer envio de email

        destinatarios.forEach(d -> {
            System.out.println("Enviando email para: ");
            System.out.println(d.getId() + " " + d.getPrimeiroNome()+ " " + d.getEmail());


        });
    }
}
