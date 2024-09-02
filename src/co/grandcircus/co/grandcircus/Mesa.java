package co.grandcircus.co.grandcircus;

public class Mesa implements iFormation {


    private int height;
    private String name;
    private double area;
    
      //constructor 
      public Mesa (int height, String name, double area) 
      {
           this.height = height;
           this.name = name;
           this.area = area;
      }
    
    //Get

    @Override 
    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }

    //Set
    public void setHeight(int height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(double area) {
        this.area = area;
    }

    @Override 
    public String getInfo() {
        return String.format("[MESA]\n Name: %s  Height: %s  Area: %s ", name, height,area);
    }


   


 
}
