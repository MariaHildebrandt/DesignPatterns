package creational.builder;

import creational.builder.builders.ConcreteHouseBuilder;
import creational.builder.builders.HouseBuilder;
import creational.builder.builders.PrefabricatedHouseBuilder;
import creational.builder.director.ConstructionEngineer;
import creational.builder.product.House;
import org.junit.Test;

/*
27.02.18
The creational.builder pattern allows you to enforce a step-by-step process to construct
a complex object as a finished product. In this pattern, the step-by-step
construction process remains same but the finished products can have
different representations.
*/

public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() throws Exception{
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        //Anstatt houseA = new House(); aufzurufen, erfolgt hier der bau des Hauses mit dem Builder Pattern
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);

        PrefabricatedHouseBuilder prefabricatedHouseBuilder= new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}
