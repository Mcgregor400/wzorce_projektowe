package abstractFactoryFurniture.WelurFurniture;

import abstractFactoryFurniture.Interfaces.Fotel;

public class WelurFotel implements Fotel {
    @Override
    public void utworzFotel() {
        System.out.println("Należy uszyć ładny fotel welurowy.");
    }
}
