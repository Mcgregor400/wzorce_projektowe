package abstractFactoryFurniture.LeaderFurniture;

import abstractFactoryFurniture.Interfaces.Narożnik;

public class LeaderNaroznik implements Narożnik {
    @Override
    public void utworzNaroznik() {
        System.out.println("Należy uszyć narożnik ze skóry.");
    }
}
