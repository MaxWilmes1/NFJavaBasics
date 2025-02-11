package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung;

import java.util.List;

public interface BestellungRepo {

    List<Bestellung> getBestellungen();

    Bestellung getBestellungById(String id);

    Bestellung addBestellung(Bestellung newBestellung);

    void removeBestellungById(String id);
}
