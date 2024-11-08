public class Siglas {
    public static String siglas(String[] palabras){
        String siglas = "";
        char c;

        for (int i = 0; i < palabras.length; i++) {
            //Cogemos el primer caracter
            c = palabras[i].charAt(0);
            //Si es mayúscula
            if (Character.isUpperCase(c)){
                //Se añade
                siglas += c;
            }
        }
        return siglas;
    }
}
