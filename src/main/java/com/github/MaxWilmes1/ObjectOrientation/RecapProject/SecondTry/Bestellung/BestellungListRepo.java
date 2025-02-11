package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung;

import java.util.ArrayList;
import java.util.List;

public class BestellungListRepo implements BestellungRepo {
    private List<Bestellung> bestellungen;

    public BestellungListRepo() {
        this.bestellungen = new ArrayList<>();
    }

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public Bestellung getBestellungById(String id){
        for (Bestellung bestellung : bestellungen) {
            if ( bestellung.id().equals(id) ){
                return bestellung;
            }
        }
        return null;
    }

    public Bestellung addBestellung(Bestellung newBestellung){
        bestellungen.add(newBestellung);
        return newBestellung;
    }

    public void removeBestellungById(String id){
        for (Bestellung bestellung : bestellungen) {
            if ( bestellung.id().equals(id) ){
                bestellungen.remove(bestellung);
            }
        }
    }
}
