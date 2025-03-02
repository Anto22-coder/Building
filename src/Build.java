public abstract class Build {
    private String name;
    private String adres;
    private int age_build;
    private String name_architector;
    private boolean unesco;

    {
        name = "нет имени";
        adres = "нет адреса";
        name_architector = "не известно";

    }


    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAdres(){return adres;}
    public void setAdres(String adres){this.adres = adres;}

    public int getAge_build(){return age_build;}
    public void setAge_build(int age_build){
        if(age_build>0)
        {
            this.age_build=age_build;

        }
        else
        {
            System.out.println("N/A");
       }
   }

    public String getName_architector(){return name_architector;}
    public void setName_architector(String name_architector){
        this.name_architector=name_architector;
    }

    public boolean isUnesco(){return unesco;}
    public void setUnesco(boolean unesco){this.unesco = unesco;}

    @Override
    public String toString(){
       return "Название здания: "+ getName()+"\n"+
               "Адрес: " + getAdres()+"\n"+
               "Год посторйки: "+(getAge_build()>0?getAge_build():"N/A")+"\n"+
               "Имя архитектора: "+getName_architector()+  "\n"+
               "Является культурным памтяником: "+ (isUnesco()?"Является":"Не является")+"\n";
    }


}
