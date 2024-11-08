public class Alfabetica {
    public static boolean esAlfabetica(String palabra){
        //amor
        //Recorrer todo el array hasta la última porque esta no tiene siguiente
        for (int i = 0; i < palabra.length() - 1; i++) {
            //Si la letra es mayor que la siguiente es que está mal
            if (palabra.charAt(i) > palabra.charAt(i + 1)){
                return false;
            }
        }
        //Si llega hasta aquí es porque está bien
        return true;
    }
}
