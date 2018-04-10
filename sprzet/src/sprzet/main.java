/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprzet;

import sport.Boisko;
import sport.Boisko.materialy;
import static sprzet.Piłka.getliczbaUtworzonychPilek;

public class main {
    public static void main(String[] args) {
         // WYWOŁYWANIE I WYSWIETLANIE ILE JEST UTWORZONYCH PILEK
        PiłkaDoSportu pilka=new PiłkaDoSportu(2,materialy.guma, 10.5f);
        pilka.setPromien(2);
        System.out.println("utworzonych pilek jest: "+getliczbaUtworzonychPilek());
        
        PiłkaDoSportu pilka1=new PiłkaDoSportu(2,materialy.szmata,8.5f);
        System.out.println("utworzonych pilek jest: "+getliczbaUtworzonychPilek());
        pilka.setPromien(3);
        // WSPOLCZYNNIKI ODBICIA
        System.out.println("DLA PILKA Promien to: "+pilka.promien+". Wspolczynnik odbicia to: "+pilka.wspOdbicia+". Wysokosc Odbicia to: "+pilka.wysokoscOdbicia(3));
        System.out.println("DLA PILKA1 Promien to: "+pilka1.promien+". Wspolczynnik odbicia to: "+pilka1.wspOdbicia+". Wysokosc Odbicia to: "+pilka1.wysokoscOdbicia(4));
        
         // ZMIENIAMY PROMIENIE
        System.out.println("DLA PILKA PRZED POWIEKSZENIEM Promien to: "+pilka.promien);
        System.out.println("DLA PILKA1 PRZED POWIEKSZENIEM Promien to: "+pilka1.promien);
         
        pilka.powiekszPromien(1); pilka1.powiekszPromien(1);
         
        System.out.println("DLA PILKA P0 POWIEKSZENIEM Promien to: "+pilka.promien);
        System.out.println("DLA PILKA1 P0 POWIEKSZENIEM Promien to: "+pilka1.promien);
         
        System.out.println("DLA PILKA Promien to: "+pilka.promien+". Wspolczynnik odbicia to: "+pilka.wspOdbicia+". Wysokosc Odbicia to: "+pilka.wysokoscOdbicia(3));
        System.out.println("DLA PILKA1 Promien to: "+pilka1.promien+". Wspolczynnik odbicia to: "+pilka1.wspOdbicia+". Wysokosc Odbicia to: "+pilka1.wysokoscOdbicia(4));
         
         
    }   
}
