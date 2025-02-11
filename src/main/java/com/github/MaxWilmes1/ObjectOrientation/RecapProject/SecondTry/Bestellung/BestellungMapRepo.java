package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.OrderRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestellungMapRepo implements BestellungRepo {
    private Map<String, Bestellung> bestellungen;

    public BestellungMapRepo() {
        this.bestellungen = new HashMap<>();
    }

    @Override
    public List<Bestellung> getBestellungen() {
        return  new ArrayList<>(bestellungen.values());
    }

    @Override
    public Bestellung getBestellungById(String id) {
        return bestellungen.get(id);
    }

    @Override
    public Bestellung addBestellung(Bestellung newBestellung) {
        bestellungen.put(newBestellung.id(), newBestellung);
        return newBestellung;
    }

    @Override
    public void removeBestellungById(String id) {
        bestellungen.remove(id);
    }
}
