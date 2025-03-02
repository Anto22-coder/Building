public class House extends Build implements LivingHouse{
    private boolean closedYard;
    private boolean parking;
    private boolean elevator;
    private int floor;

    public House(){}
    public void place(){
        System.out.println("Дом находится в городской местости");
    }

    public boolean isClosedYard(){return closedYard;}
    public void setClosedYard(boolean closedYard){this.closedYard=closedYard;}

    public boolean isParking() {return parking;}
    public void setParking(boolean parking){this.parking=parking;}

    public  boolean isElevator(){return elevator;}
    public void setElevator(boolean elevator){this.elevator=elevator;}

    public int getFloor(){return floor;}
    public void setFloor(int floor){if(floor>0)this.floor=floor;
        else System.out.println(1);}


    @Override
    public String toString() {
        return super.toString()+ "Закрытый двор: "+ (isClosedYard()?"Да":"Нет")
                +"\n"+"Есть парковка: "+(isParking()?"Да":"Нет")+"\n"
                + "Есть лифт: "+ (isElevator()?"Да":"Нет")+"\n"+
                 "Количество этажей "+ getFloor();
    }
}
