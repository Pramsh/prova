package com.fullstack.web.biblio;

import com.fullstack.web.biblio.exceptions.LimiteRipianiException;
import com.fullstack.web.biblio.exceptions.PianoOccupatoException;

public class GestioneBiblio {
    public static void main(String[] args) {
        Libro libro1 = new Libro("AFEKJKJJK","Mario");
        Libro libro2 = new Libro("AEDJA","Maria");
        Libro libro3 = new Libro("AFEqefeKJKJJK","Giulia");
        Libro libro4 = new Libro("DFVAEVERER","Giulio");
        Libro libro5 = new Libro("SDFDDFV","Viola");
        Libro libro6 = new Libro("AEDJA","Wienerschnitzel");
        Libro libro7 = new Libro("AFEqefeKJKJJK","Doesenoeffner");
        Libro libro8 = new Libro("DFVAEVERER","Mauro");
        Libro libro9 = new Libro("AFEKJKJJK","Lucia");
        Libro libro10 = new Libro("AEDJA","Evelin");
        Libro libro11 = new Libro("Adssssss","Eewfwefwefwe");
        System.out.println(libro1); //metodo toString() implicito


        Scaffale scaffale1 = new Scaffale();
        try{
            scaffale1.aggiungiRipiano(1);
             scaffale1.aggiungiRipiano(2);
           /* scaffale1.aggiungiRipiano(2);
            scaffale1.aggiungiRipiano(2);
            scaffale1.aggiungiRipiano(2);*/

        }catch(LimiteRipianiException e){
            System.out.println("Limite ripiani raggiunto all'interno dello scaffale");
        }catch(PianoOccupatoException e){
            System.out.println("Il ripiano è occupato");
        }

//        scaffale1.aggiungiLibro(libro2);
//        scaffale1.aggiungiLibro(libro3);
//        scaffale1.aggiungiLibro(libro4);
//        scaffale1.aggiungiLibro(libro5);
//        scaffale1.aggiungiLibro(libro6);
//        scaffale1.aggiungiLibro(libro7);
//        scaffale1.aggiungiLibro(libro8);
//        scaffale1.aggiungiLibro(libro9);
//        scaffale1.aggiungiLibro(libro10);
//        scaffale1.aggiungiLibro(libro11);

    }
}
