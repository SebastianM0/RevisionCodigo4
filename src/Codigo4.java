//Este código es el clasico piedra,papel o tijeras donde recibe un String por cada jugador, los compara y muestra el ganador

import java.util.Scanner;//Primero importamos el Scanner para que sirva todo el código
public class Codigo4 {

	public static void main(String[] args) { //creamos main para que sirva bien todo 

	    Scanner s = new Scanner(System.in); //Completamos la función con System.in
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); //quitamos el ln para que aparezca todo en la misma línea
	    String jugador1 = s.nextLine(); //modificamos el nombre del jugador por algo más entendible

	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //cambiamos el texto por jugador2
	    //Quitamos el segundo scanner porque es innecesario
	    String jugador2 = s.nextLine(); //modificamos el nombre del jugador 2 igualmente
	    //Aqui ya tenemos los dos valores pedidos
	    
	    if (jugador1.equals(jugador2)) { //borramos un parentesis de mas y cambiamos todos los == por .equals
	    System.out.println("Empate");
	    } else {
	        int ganador = 0; //cambiamos el nombre de la variable e igualamos a 0 porque si hay errores en el código siempre ganara el jugador 2
	        
	        switch(jugador1) { //adaptamos el nombre nuevo de nuestra variable y usamos de pivote al jugador 1
	        
	        case "piedra": //Primer caso
	        		if (jugador2.equals("tijeras")) {
	        			ganador = 1; //adaptamos el nombre nuevo de nuestra variable 
	        			}else if (jugador2.equals("papel")) { //completamos el if que falta para tener las 3 opciones 
	        				ganador = 2;
	        			}	
	        break; //agregamos el break para este caso
	        
	        
	        case "papel"://Segundo caso
	        if (jugador2.equals("piedra")) {//adaptamos el nombre nuevo de nuestra variable 
	            ganador = 1;//adaptamos el nombre nuevo de nuestra variable 
	        }else if(jugador2.equals("tijeras")){
	        		ganador = 2; //se vuelve a completar el if para las 3 opciones
	        }
	        break; //agregamos un break a este case
	        
	        
	        case "tijeras": //se completa con tijeras y Tercer caso 
	        if (jugador2.equals("papel")) {//adaptamos el nombre nuevo de nuestra variable 
	            ganador = 1;//adaptamos el nombre nuevo de nuestra variable 
	        }else if (jugador2.equals("piedra")) { //Agregamos el ultimo if que faltaba
	        		ganador = 2;
	        }
	        break;
	        default:
	        	System.out.println("Escribe de forma correcta las opciones"); //Se agrega un texto para notificar que escriban bien las opciones
	        	break;
	    }
	    System.out.println("Gana el jugador " + ganador); //se adapta el nuevo nombre de la variable 
	    }
	}//main
}//class Codigo4
