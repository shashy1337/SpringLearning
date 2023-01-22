package ru.shashy.springlearn.ProgrammingBeanAdd;

public class Parrot {
  private String name;
  private String color;

  public Parrot(String name, String color){
      this.name = name;
      this.color = color;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public boolean isGreen(){
        if (color.equals("green")){
            return true;
        }
        return false;
    }
}