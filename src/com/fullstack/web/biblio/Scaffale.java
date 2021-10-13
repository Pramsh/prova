package com.fullstack.web.biblio;

import com.fullstack.web.biblio.exceptions.LimiteRipianiException;
import com.fullstack.web.biblio.exceptions.PianoOccupatoException;

import java.util.ArrayList;

public class Scaffale {
    private int numeroScaffali;
    private String codiceAlfanumerico;
    private Ripiano ripiano;





    ArrayList<Ripiano> ripiani = new ArrayList<>();

    public void aggiungiRipiano(int numeroRipiano) throws LimiteRipianiException, PianoOccupatoException {

        for(Ripiano ripiano:ripiani){
            if(ripiano.getNumeroRipiano()==numeroRipiano){
                throw new PianoOccupatoException();
            }
            System.out.println(ripiano.getNumeroRipiano());

        }

            switch (numeroRipiano){
                case 1->{
                    Ripiano ripianoValido = new Ripiano(1);
                    ripiani.add(ripianoValido);

                }
                case 2->{
                    Ripiano ripianoValido = new Ripiano(2);
                    ripiani.add(ripianoValido);
                }
                case 3->{
                    Ripiano ripianoValido = new Ripiano(3);
                    ripiani.add(ripianoValido);
                }
                case 4->{
                    Ripiano ripianoValido = new Ripiano(4);
                    ripiani.add(ripianoValido);
                }
                case 5->{
                    Ripiano ripianoValido = new Ripiano(5);
                    ripiani.add(ripianoValido);
                }
                case 6->{
                    Ripiano ripianoValido = new Ripiano(6);
                    ripiani.add(ripianoValido);
                }
                default -> {
                    throw new LimiteRipianiException();
                }
            }
            if(ripiani.size()>6){
                throw new LimiteRipianiException();

            }



    }




    public int getNumeroScaffali() {
        if(numeroScaffali <= 30){
            return numeroScaffali;
        }
        else
            System.out.println("Numero scaffali raggiunto");
        return -1;
    }

    public void setNumeroScaffali(int numeroScaffali) {
        this.numeroScaffali = numeroScaffali;
    }

    public String getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public void setCodiceAlfanumerico(String codiceAlfanumerico) {
        this.codiceAlfanumerico = codiceAlfanumerico;
    }


}
