package creational.builder.director;

import creational.builder.builders.HouseBuilder;
import creational.builder.product.House;

public class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }
}
