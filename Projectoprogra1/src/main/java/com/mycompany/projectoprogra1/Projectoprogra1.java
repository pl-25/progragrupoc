/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectoprogra1;

import java.util.Scanner;

/**
 *
 * @author 36339
 */
public class Projectoprogra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        Projectoprogra1 main = new Projectoprogra1();
        boolean regresar = true;
        int regreso = 0;
        do {
            System.out.println("1.- Carro.");
            System.out.println("2.- balsa.");
            System.out.println("3.- Avion.");
            System.out.println("4.- salir del programa.");
            System.out.println("Ingresa una Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usted a ingresado a Carro. ");
                    String tipoMotor = main.tipoMotorCarro(); // crear variable de opcion 2
                    String tipoColor = main.tipoColorCarro();
                    String tipocaja = main.tipocarrocaja();
                    System.out.println("Ha elegido un carro Motor tipo: " + tipoMotor + ", de Color: " + tipoColor + " y tipo de Caja: " + tipocaja);  // mostrar opciones hechas   3 
                    System.out.println("Desea regesar al menu? ( 1=si/2=no )");
                    regreso = leer.nextInt();
                    regresar = (regreso == 1);
                    break;
                case 2:
                    System.out.println("Usted a ingresado a Balsa. ");
                    String tipocolorb = main.tipoColorbalsa(); // colocarle un caracter mas
                    String tipocajaa = main.tipocajabalsa();
                    String tipomotorc = main.tipomotoromaterialbalsa();
                    System.out.println("Ha elegido una balsa Color tipo: " + tipocolorb + ", de Caja: " + tipocajaa + "y tipo de Motor o Material de aleta" + tipomotorc);
                    System.out.println("Desea regesar al menu? ( 1=si/2=no )");
                    regreso = leer.nextInt();
                    regresar = (regreso == 1);
                    break;
                case 3:
                    System.out.println("Usted a ingresado Avion. ");
                    String tipocolord = main.tipoColoravion();
                    String tipoMotore = main.tipomotoravion();
                    String tipoasientos = main.tipoasientosavion();
                    System.out.println("Ha elegido un Avion Color tipo: " + tipocolord + ", de Motor: " + tipoMotore + " y la Cantidad de: " + tipoasientos);
                    System.out.println("Desea regesar al menu? ( 1=si/2=no )");
                    regreso = leer.nextInt();
                    regresar = (regreso == 1);
                    break;
                case 4:
                    regresar = false;

            }
        } while (regresar == true);
    }

    public String tipoMotorCarro() {
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipoMotor = "";
        System.out.println("SELECCIONE TIPO DE GASOLINA");
        System.out.println("1.- Gasolina.");
        System.out.println("2.- Diesel.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                tipoMotor = "Gasolina";
                break;
            case 2:
                tipoMotor = "Diesel";
                break;
        }
        return tipoMotor;
    }

    public String tipoColorCarro() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipoColor = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE TIPO DE COLOR"); // colocar tipo de opcion
        System.out.println("1.- Rojo.");
        System.out.println("2.- Negro.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipoColor = "Rojo";
                break;
            case 2:
                tipoColor = "Negro";
                break;
        }
        return tipoColor;
    } // asta qui 

    public String tipocarrocaja() {
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipocaja = "";
        System.out.println("SELECCIONE TIPO DE caja");
        System.out.println("1.- Mecanico.");
        System.out.println("2.- Automatico.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                tipocaja = "Mecanico";
                break;
            case 2:
                tipocaja = "Automatico";
                break;
        }
        return tipocaja;
    }

    public String tipoColorbalsa() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipoColor = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE TIPO DE COLOR"); // colocar tipo de opcion
        System.out.println("1.- Cafe.");
        System.out.println("2.- Gris.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipoColor = "Cafe";
                break;
            case 2:
                tipoColor = "Gris";
                break;
        }
        return tipoColor;
    }

    public String tipocajabalsa() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipocaja = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE TIPO DE CAJA"); // colocar tipo de opcion
        System.out.println("1.- Motor.");
        System.out.println("2.- Pala de remo.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipocaja = "Motor";
                break;
            case 2:
                tipocaja = "Pala de remo";
                break;
        }
        return tipocaja;
    }

    public String tipomotoromaterialbalsa() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipomotoromaterial = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE UN TIPO MOTOR O MATERIAL DE PALA"); // colocar tipo de opcion
        System.out.println("1.- Gasolina.");
        System.out.println("2.- Disel.");
        System.out.println("3.- Metal con aleta plastica.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipomotoromaterial = "Gasolina";
                break;
            case 2:
                tipomotoromaterial = "Disel";
                break;
            case 3:
                tipomotoromaterial = "Metal con aleta plastica";
                break;
        }
        return tipomotoromaterial;
    }

    public String tipoColoravion() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipoColor = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE TIPO DE COLOR"); // colocar tipo de opcion
        System.out.println("1.- Blanco.");
        System.out.println("2.- Azul.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipoColor = "Blanco";
                break;
            case 2:
                tipoColor = "Azul";
                break;
        }
        return tipoColor;
    }

    public String tipomotoravion() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipomotor = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE TIPO DE Motor"); // colocar tipo de opcion
        System.out.println("1.- Gasolina.");
        System.out.println("2.- Disel.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipomotor = "Gasolina";
                break;
            case 2:
                tipomotor = "Disel";
                break;
        }
        return tipomotor;
    }

    public String tipoasientosavion() { //1
        Scanner leer = new Scanner(System.in);
        int opcion;
        String tipoasientos = "";// canviar nombre a la bariablle
        System.out.println("SELECCIONE CANTIDAD DE ASIENTOS"); // colocar tipo de opcion
        System.out.println("1.- 100 Asientos.");
        System.out.println("2.- 300 Asientos.");
        System.out.println("Ingresa una Opcion: ");
        opcion = leer.nextInt();
        switch (opcion) { // agregar tipo de opcion
            case 1:
                tipoasientos = "100 Asientos.";
                break;
            case 2:
                tipoasientos = "300 Asientos.";
                break;
        }
        return tipoasientos;
    }
}
