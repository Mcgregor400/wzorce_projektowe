package abstractFactoryFurniture.WelurFurniture;

import abstractFactoryFurniture.Interfaces.Fotel;
import abstractFactoryFurniture.Interfaces.FurnitureFactory;
import abstractFactoryFurniture.Interfaces.Kanapa;
import abstractFactoryFurniture.Interfaces.Narożnik;
import abstractFactoryFurniture.LeaderFurniture.LeaderNaroznik;

public class OddziałMebliWelurowych implements FurnitureFactory {
    @Override
    public Fotel utworzFotel() {
        return new WelurFotel();
    }

    @Override
    public Kanapa utworzKanape() {
        return new WelurKanapa();
    }

    @Override
    public Narożnik utworzNaroznik() {
        return new LeaderNaroznik();
    }


}
