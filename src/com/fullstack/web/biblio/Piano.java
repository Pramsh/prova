package com.fullstack.web.biblio;

import com.fullstack.web.biblio.exceptions.SuperatoLimitePiani;

import java.util.ArrayList;
public class Piano {

    private int numeroPiano;

    ArrayList<Scaffale> scaffali = new ArrayList<>();

    public int getNumeroPiano() {
            if (this.numeroPiano <= 3) {
                return numeroPiano;
            }else
                System.out.println("Ripiano non disponibile");
            return -1;
    }

    public void setNumeroPiano(int numeroPiano) {
        this.numeroPiano = numeroPiano;
    }





}
