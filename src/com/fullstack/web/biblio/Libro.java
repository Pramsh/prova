package com.fullstack.web.biblio;

public class Libro {
    private String titoloLibro;
    private String autoreLibro;
        public Libro(String titoloLibro,String autoreLibro){
            this.titoloLibro=titoloLibro;
            this.autoreLibro=autoreLibro;
        }




    public String getTitoloLibro() {
        return titoloLibro;
    }

    @Override
    public String toString(){
            return this.autoreLibro +", "+this.titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public String getAutoreLibro() {
        return autoreLibro;
    }

    public void setAutoreLibro(String autoreLibro) {
        this.autoreLibro = autoreLibro;
    }



}
