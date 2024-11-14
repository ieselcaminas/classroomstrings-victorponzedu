public class Digitos {
    public static int cuantosSonDigitos(String cadena){
        //un 0 y 23a
        int digitos = 0;

        for (int i = 0; i < cadena.length() ; i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)){
                digitos++;
            }
        }
        return digitos;
    }
}
