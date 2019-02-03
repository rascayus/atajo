package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
/*        for(int i=0; i<camino1.length; i++)
        {
          sum1 += camino1[i];
          sum2 += camino2[i];
          sum3 += camino3[i];
        	
        }*/
        sum1 = distanciaRecorrida(camino1);
    	sum2 = distanciaRecorrida(camino2);
    	sum3 = distanciaRecorrida(camino3);
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }
    public static int distanciaRecorrida(int [] ruta) {
    	int distancia = 0;
    	for(int i=0; i<ruta.length-1; i++)
    	  {
    	      distancia += Math.abs(ruta[i]-ruta[i+1]);
            };
		return distancia ;
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
        System.out.println("La distancia recorrida en cada ruta es: \nRuta 1= "+distanciaRecorrida(camino1)+".\nRuta 2= "+
        distanciaRecorrida(camino2)+".\nRuta 3= "+distanciaRecorrida(camino3)+".");
           }
}

