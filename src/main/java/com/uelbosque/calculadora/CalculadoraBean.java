package com.uelbosque.calculadora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculadoraBean {

    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }

    public Calculadora cal = new Calculadora();

    public void calcular() {

           // cal.setNumero1(n1);
        cal.getNumero1();
        cal.getNumero2();
        cal.getOperacion();

       // cal.numero1 = n1;
        switch (cal.operacion) {
            case "+":
                cal.resultado = cal.numero1 + cal.numero2;
                break;
            case "-":
                cal.resultado = cal.numero1 - cal.numero2;
                break;
            case "*":
                cal.resultado = cal.numero1 * cal.numero2;
                break;
            case "/":
                cal.resultado = cal.numero1 / cal.numero2;
                break;
            default:
                System.out.println("error");
                break;
        }
    
       // cal.resultado=n1;
    }

    public void numero(int n) {

        cal.getNumero1();
        cal.getNumero2();

        if (cal.numero1 == 0) {
            cal.setNumero1(n);
        } else {
            cal.setNumero2(n);
        }

    //    cal.setResultado(n);
    }

    public void signo(String sig) {

        cal.setOperacion(sig);

    }
    
       public void borrar() {

        cal.setNumero1(0);
        cal.setNumero2(0);

    }

}
