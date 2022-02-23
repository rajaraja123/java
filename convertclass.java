/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package classmain;


/**
 *
 * @author Acer
 */
public class convertclass { double Celcius;

    public convertclass(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double ToFahrenheit(){
        return (Celcius*1.8+32);
    }
    double ToReamur(){
        return (Celcius*0.8);
    }
    double ToKelvin(){
        return (Celcius+273.15);
    }
    String kondisi(){
        if(Celcius <= 0){
            return "Beku";
        }
        else if(Celcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
    
}