package Db2;


public class Descuento {
	
/*Crear una clase Descuento con los atributos porcentaje de 
	 
descuento y el total de compra, crear un constructor que reciba dos
	 
parametros de entrada descuento y total, y un metodo getTotal que retorne 
	 
el total de la compra
	 */
	
private double descuento;
	
private double totalCompra;
	
	
public Descuento(double descuentoParam,double totalCompraParam){
		
this.descuento=descuentoParam;
		
this.totalCompra=totalCompraParam;
	
}
    public double getTotal(){
    	
return totalCompra-totalCompra*descuento; //retorna el valor 
    
}
	public double getDescuento() {
		
return descuento;
	}
	
public void setDescuento(double descuento) {
		
this.descuento = descuento;
	
}
	
public double getTotalCompra() {
		
return totalCompra;
	
}
	
public void setTotalCompra(double totalCompra) {
		
this.totalCompra = totalCompra;
	
}

}

