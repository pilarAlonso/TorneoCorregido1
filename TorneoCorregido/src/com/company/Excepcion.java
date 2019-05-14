package com.company;

public class Excepcion extends Exception {
    public Excepcion(String codigoError) {
        super("\n<<ERROR: " + codigoError + ">>");
    }
}
