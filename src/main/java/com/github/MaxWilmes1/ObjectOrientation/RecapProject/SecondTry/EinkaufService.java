package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EinkaufService {
    private ProduktRepo produktRepo = new ProduktRepo();
    private BestellungListRepo bestellungListRepo = new BestellungListRepo();

    public Bestellung erstellBestellung(List<String> produktIds){
        List<Produkt> bestellteProdukte = new ArrayList<>();

        for (String produktId : produktIds) {
            Produkt bestelltesProdukt = produktRepo.getProductById(produktId);
            if ( bestelltesProdukt == null ){
                System.out.println("Das bestellte Produkt mit der id: "+ produktId+" ist nicht verfügbar!");
                return null;
            }
            bestellteProdukte.add(produktRepo.getProductById(produktId));
        }

        Bestellung newBestellung = new Bestellung(UUID.randomUUID().toString(), bestellteProdukte);
        bestellungListRepo.addBestellung(newBestellung);
        return newBestellung;
    }

    public BestellungListRepo getBestellungListRepo() {
        return bestellungListRepo;
    }

    public void setBestellungListRepo(BestellungListRepo bestellungListRepo) {
        this.bestellungListRepo = bestellungListRepo;
    }

    public ProduktRepo getProduktRepo() {
        return produktRepo;
    }

    public void setProduktRepo(ProduktRepo produktRepo) {
        this.produktRepo = produktRepo;
    }
}
