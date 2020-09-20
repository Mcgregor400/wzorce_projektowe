package abstractFactoryFurniture.LeaderFurniture;

import abstractFactoryFurniture.Interfaces.Fotel;
import abstractFactoryFurniture.Interfaces.FurnitureFactory;
import abstractFactoryFurniture.Interfaces.Kanapa;
import abstractFactoryFurniture.Interfaces.Narożnik;

public class OddziałMebliSkorzanych implements FurnitureFactory {
    @Override
    public Fotel utworzFotel() {
        return new LeaderFotel();
    }

    @Override
    public Kanapa utworzKanape() {
        return new LeaderKanapa();
    }

    @Override
    public Narożnik utworzNaroznik() {
        return new LeaderNaroznik();
    }


}
