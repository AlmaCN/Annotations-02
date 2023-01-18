package it.develhope.exercise;


public class Greetings {

    /**
     * Ho creato il primo metodo della classe Greeting, sayWelcome, a cui ho aggiunto l'annotazione che e stata scritta
     * da John Walker, e che printa Welcome
     */
    @DevAnnotation(devName = "John", devSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Welcome");
    }

    /**
     * Ho creato il secondo metodo della classe Greeting, sayGoodbye, a cui ho aggiunto l'annotazione che e stata
     * scritta da Mark Brown, e che printa Goodbye
     */
    @DevAnnotation(devName = "Mark", devSurname = "Brown")
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
