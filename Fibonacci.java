package gupy;





/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 
 * valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
 * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
 *  pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/
	public class Fibonacci {
		
		
		
		public static void main (String [] args) {
		
		int fibo1= 1;
		int fibo2= 0;
		int Soma = 0;
		
	 
	
	    for (int i=0; i<=55;i++) {
	    System.out.println(fibo1);	
	    Soma=fibo1;
	    
	    fibo1= fibo1+fibo2;
	    
	    fibo2=Soma;
	    
	   if( Soma==55)
	    break;
	    System.out.println();
	    
	    if (fibo2 <=50) {
	    	System.out.println(" Faz parte da Sequência Fibonacci");
	    		    	
	    }
	    }
	    
	    for (int i=0; i<=55;i++) {
		    System.out.println(fibo1);	
		    Soma=fibo1;
		    
		    fibo1= fibo1+fibo2;
		    
		    fibo2=Soma;
		    if( Soma>=55) {
		    	System.out.println("\n Não Faz parte da Sequência Fibonacci");
		    }
	
	}
	    
		
		}}
	    


       
    
	
	
	
	




