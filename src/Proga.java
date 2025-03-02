public class Proga {
    public static void main(String[] args){
        Library library = new Library();
        library.setName("Alto");
        library.setAge_build(-232);

        House house = new House();
        house.setFloor(24);
        house.setClosedYard(true);
        house.setElevator(true);

        PoliceDepartment policeDepartment = new PoliceDepartment();

        University university = new University();

        ShoppingCenter shoppingCenter = new ShoppingCenter();

        HighRiseBuilding highRiseBuilding = new HighRiseBuilding();

        System.out.println(library.toString());
        System.out.println(house.toString());
        house.place();


    }
}
