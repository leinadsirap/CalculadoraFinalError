
package com.uelbosque.calculadora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculadoraBean {
    
    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }
    
    public Calculadora cal = new Calculadora();
    
    public void calcular( ){
    
  
      
           // cal.setNumero1(n1);
        
        cal.getNumero1();
        cal.getNumero2();
      
      
       // cal.numero1 = n1;
        cal.operacion= "+";
     switch ( cal.operacion ) {
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
           System.out.println("error" );
           break;
      }
    
       // cal.resultado=n1;
     
    }
       public void numero(int n){
        
       
        if (cal.numero1 == 0){
            cal.setNumero1(n);        
        }else{
            cal.setNumero2(n);
        }
    
    //    cal.setResultado(n);
   
        
    }
   
}
