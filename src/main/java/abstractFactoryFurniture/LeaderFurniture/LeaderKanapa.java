package abstractFactoryFurniture.LeaderFurniture;

import abstractFactoryFurniture.Interfaces.Kanapa;

public class LeaderKanapa implements Kanapa {
    @Override
    public void utworzKanape() {
        System.out.println("Uszyj ładną kanapę ze skóry");
    }
}
