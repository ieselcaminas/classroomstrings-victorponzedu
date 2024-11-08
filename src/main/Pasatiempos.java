public class Pasatiempos {
    public static String crearPasatiempo(String original){
        String pasatiempo = "";
        //1ª Forma
        /*for (int i = 0; i < original.length(); i++) {
            if ((original.charAt(i) == 'a')
            || (original.charAt(i) == 'e')
            || (original.charAt(i) == 'i')
            || (original.charAt(i) == 'o')
            || (original.charAt(i) == 'u')){
                pasatiempo += ".";
            }else{
                pasatiempo += original.charAt(i);
            }
        }
        */
        //2º Forma
        /*pasatiempo = original.replace('a', '.');
        pasatiempo = pasatiempo.replace('e', '.');
        pasatiempo = pasatiempo.replace('i', '.');
        pasatiempo = pasatiempo.replace('o', '.');
        pasatiempo = pasatiempo.replace('u', '.');
*/
        //3ª Forma
        pasatiempo = original.replaceAll("[aeiou]", ".");

        return pasatiempo;
    }

    public static void main(String[] args) {
        System.out.println(crearPasatiempo("esto es una frase camión"));
    }
}
