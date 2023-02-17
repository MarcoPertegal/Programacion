package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		 String str = "picture perfect";  
	        int[] freq = new int[str.length()];  
	        int i, j;  
	          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	          
	        for(i = 0; i <str.length(); i++) {  
	            freq[i] = 1;  
	            for(j = i+1; j <str.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	          
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(i = 0; i <freq.length; i++) {  
	        	//if(string[i] == ' ' && string[i] == '0') //Si fuese asi deberia entrar en el array si la posicion i del array es igual a espacio o a 1
	            if(string[i] != ' ' && string[i] != '0')  //Comprobado, esto no va a entrar en el if ni cuando la poscion del string valga un espacio ni cuando valga 0
	                System.out.println(string[i] + "-" + freq[i]);  
	        }  

	}

}
