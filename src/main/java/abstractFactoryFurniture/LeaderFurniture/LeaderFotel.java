package abstractFactoryFurniture.LeaderFurniture;

import abstractFactoryFurniture.Interfaces.Fotel;

public class LeaderFotel implements Fotel {
    @Override
    public void utworzFotel() {
        System.out.println("Należy uszyć ładny fotel ze skóry");
    }

}
