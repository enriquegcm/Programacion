package Db;

public class Circulo {
/*Crear una clase Circulo con el atributo radio, y el metodo getArea().
	  
Crear dos constructores, el primero sin argumentos, el segundo con
	   
el parametro de entrada radio
	 */
		
private double radio;
		
public Circulo(){
			
		
}
		
public  Circulo(double radioParam){
			
this.radio=radioParam;
		
}
		
public void  setRadio(double radioParam){
			
this.radio=radioParam;
}
		
			
public double getRadio(){
				
return this.radio;
		}
			
public double getArea(){
				
return Math.PI*radio*radio;
			
}
	
}


