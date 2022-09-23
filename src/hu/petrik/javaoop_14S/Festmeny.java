package hu.petrik.javaoop_14S;

import java.time.LocalDateTime;
import java.util.Date;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzam;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private Boolean elkelt;

    public Festmeny(String cim, String festo, String stilus)
    {
        this.cim=cim;
       this.festo=festo;
        this.stilus = stilus;
        this.licitekSzam=0;
        this.elkelt=false;
        this.legmagasabbLicit=0;
    }

    public String getCim() {
        return cim;
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzam() {
        return licitekSzam;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public Boolean getElkelt() {
        return elkelt;
    }

    public void setElkelt(Boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit(){


        if (this.elkelt){

            System.err.println("Hiba, a festmény már elkelt");

        }
        else if(!this.elkelt && licitekSzam>0) {
        legmagasabbLicit*=1.1;
            licitekSzam +=1;
            legutolsoLicitIdeje = LocalDateTime.now();

        }

            else
         {
            legmagasabbLicit +=100;
            licitekSzam +=1;
            legutolsoLicitIdeje = LocalDateTime.now();

        }



    }

    public void licit(int mertek)
    {






    }









}
