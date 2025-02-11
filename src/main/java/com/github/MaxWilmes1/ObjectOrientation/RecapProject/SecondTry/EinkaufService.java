package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.Bestellung;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.BestellungListRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.BestellungMapRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.BestellungRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.Produkt;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.ProduktRepo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EinkaufService {
    private ProduktRepo produktRepo = new ProduktRepo();
    private BestellungRepo bestellungRepo = new BestellungMapRepo();

    public Bestellung erstellBestellung(List<String> produktIds){
        List<Produkt> bestellteProdukte = new ArrayList<>();
        BigDecimal total = new BigDecimal("0");
        BigDecimal valueOfOrder = new BigDecimal("0");

        for (String produktId : produktIds) {
            Produkt bestelltesProdukt = produktRepo.getProductById(produktId);
            if ( bestelltesProdukt == null ){
                System.out.println("Das bestellte Produkt mit der id: "+ produktId+" ist nicht verfügbar!");
                return null;
            }
            bestellteProdukte.add(produktRepo.getProductById(produktId));
            valueOfOrder = bestelltesProdukt.price().multiply(BigDecimal.valueOf(bestelltesProdukt.quantity()));
            total = total.add(valueOfOrder);
        }

        Bestellung newBestellung = new Bestellung(UUID.randomUUID().toString(), bestellteProdukte, total);
        bestellungRepo.addBestellung(newBestellung);
        System.out.println("Ihre Bestellung: " + newBestellung);
        return newBestellung;
    }

    public BestellungRepo getBestellungRepo() {
        return bestellungRepo;
    }

    public void setBestellungListRepo(BestellungRepo bestellungRepo) {
        this.bestellungRepo = bestellungRepo;
    }

    public ProduktRepo getProduktRepo() {
        return produktRepo;
    }

    public void setProduktRepo(ProduktRepo produktRepo) {
        this.produktRepo = produktRepo;
    }
}
