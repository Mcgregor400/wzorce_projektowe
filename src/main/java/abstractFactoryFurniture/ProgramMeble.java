package abstractFactoryFurniture;

import abstractFactoryFurniture.Interfaces.Fotel;
import abstractFactoryFurniture.Interfaces.FurnitureFactory;
import abstractFactoryFurniture.Interfaces.Kanapa;
import abstractFactoryFurniture.Interfaces.Narożnik;
import abstractFactoryFurniture.LeaderFurniture.OddziałMebliSkorzanych;
import abstractFactoryFurniture.WelurFurniture.OddziałMebliWelurowych;

public class ProgramMeble {
    public static void main(String[] args) {
        System.out.println("*************oddział mebli ze skóry ***************");
        //tworzę instancjęklasy OddzialMebliSkorzanych
    FurnitureFactory mebleZeSkóry = new OddziałMebliSkorzanych();//
    Fotel fotel = mebleZeSkóry.utworzFotel();
    fotel.utworzFotel();
    Kanapa kanapa = mebleZeSkóry.utworzKanape();
    kanapa.utworzKanape();
        Narożnik narożnikZeSkóry = mebleZeSkóry.utworzNaroznik();
        narożnikZeSkóry.utworzNaroznik();

        System.out.println("*************oddział mebli z weluru***************");

    FurnitureFactory mebliWelurowych = new OddziałMebliWelurowych();
    Fotel fotelWelurowy = mebliWelurowych.utworzFotel();
    Kanapa kanapaWelurowa = mebliWelurowych.utworzKanape();
    fotelWelurowy.utworzFotel();
    kanapaWelurowa.utworzKanape();
    }
}
