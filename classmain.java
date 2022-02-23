/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classmain;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */

        
public class classmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opsi;
        double suhu;
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhu = input.nextDouble();
        do{
            convertclass fromCelcius = new convertclass(suhu);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            opsi=input.nextInt();
            if(opsi == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + suhu + "°C");
                System.out.println("Dalam Fahrenheit\t: " + fromCelcius.ToFahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + fromCelcius.ToReamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + fromCelcius.ToKelvin() + "K");
                System.out.println("Kondisi Air " + fromCelcius.kondisi());
            }
            else if(opsi == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhu = input.nextDouble();
            }
            else if(opsi != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(opsi!=3);
    }
    }
    
