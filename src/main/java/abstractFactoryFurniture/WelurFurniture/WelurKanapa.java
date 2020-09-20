package abstractFactoryFurniture.WelurFurniture;

import abstractFactoryFurniture.Interfaces.Kanapa;

public class WelurKanapa implements Kanapa {
    @Override
    public void utworzKanape() {
        System.out.println("Należy uszyć ładną kanapę z weluru.");
    }
}
