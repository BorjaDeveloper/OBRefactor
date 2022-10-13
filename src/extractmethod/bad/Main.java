package extractmethod.bad;

public class Main {

    /*
    Aquí tenemos un método llamado printHTML, que incluye un metodo printHead y otro printBody que vienen
    definidos más abajo y que nos darían un código HTML. Y además hemos incluido unos mensajes por consola
    que vendrían a ser el footer de nuestra página web.
    Pues bien, esos mensajes del footer se podrían incluir en otro método llamado por ejemplo printFooter.
     */

    void printHTML(){

        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");

    }

    private void printBody() {
    }

    private void printHead() {
    }
}