public class Library extends Build {

    private boolean takeBook;
    private boolean excursion;
    public Library(){}
    public void place(){
        System.out.println("Крупнейшая библиотека в городе");
    }


    public boolean isTakeBook(){return takeBook;}
    public void setTakeBook(boolean takeBook){this.takeBook=takeBook;}

    public boolean isExcursion(){return excursion;}
    public void setExcursion(boolean excursion){this.excursion=excursion;}




    @Override
    public String toString() {
        return super.toString()+(isTakeBook()?"Можно брать книги домой":"Нельзя брать книги домой")+
                "\n"+ (isExcursion()?"Есть экскурсии":"Нет экскурсий")+"\n";
    }
}