package co.grandcircus.co.grandcircus;

public class Mountain implements iFormation{

private int height;
private String name;

  //constructor 
  public Mountain (int height, String name) 
  {
       this.height = height;
       this.name = name;
  }
 
 @Override 
 public int getHeight() {
     return height;
 }
 public String getName() {
     return name;
 }
 

 //Set
 public void setHeight(int height) {
     this.height = height;
 }
 public void setName(String name) {
     this.name = name;
 }


 @Override 
 public String getInfo() {
     return String.format("[MOUNTAIN]\n Name: %s  Height: %s", name, height);
 }


}
