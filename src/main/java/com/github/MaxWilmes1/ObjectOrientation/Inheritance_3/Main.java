package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unsere Instrumente:");

        SaitenInstrument violin = new SaitenInstrument();
        violin.brand = "Harley Benton";
        violin.price = 100.00;
        violin.saiten = 6;

        SaitenInstrument guitar = new SaitenInstrument();
        guitar.brand = "Tylor";
        guitar.price = 700.00;
        guitar.saiten = 6;

        Instrument epiano = new Instrument();
        epiano.brand = "Yamaha";
        epiano.price = 600.00;


        print(violin);
        print(guitar);
        print(epiano);
    }

    public static void print(Instrument instrument){
        System.out.println(instrument);
    }
}
