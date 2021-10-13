package com.fullstack.web.biblio;

import com.fullstack.web.biblio.exceptions.ErroreRipianoPienoException;

import java.util.ArrayList;

public class Ripiano {


    private int numeroRipiano;
    private ArrayList<Libro> libri = new ArrayList<>();
    private boolean numeroLibriRaggiunto =true;

    public Ripiano(int numeroRipiano){
    this.numeroRipiano=numeroRipiano;
    }

    public void aggiungiLibro(Libro libro) throws ErroreRipianoPienoException{
        if(libri.size()<=9){
            libri.add(libro);
        }
           throw new ErroreRipianoPienoException();
    }


        public boolean checkNumeroMaxLibri(){
            for (int i = 1; i < libri.size(); i++) {
                if (i>10){
                   return numeroLibriRaggiunto;
                }
            }return numeroLibriRaggiunto;
        }
    public int getNumeroRipiano() {
        return numeroRipiano;
    }

    public void setNumeroRipiano(int numeroRipiano) {
        this.numeroRipiano = numeroRipiano;
    }


    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }
}
