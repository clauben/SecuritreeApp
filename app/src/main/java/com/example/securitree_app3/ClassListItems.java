package com.example.securitree_app3;

public class ClassListItems
{

    public String img; //Image URL
    public String name; //Name
    public String name2;

    public ClassListItems(String name, String img, String name2)
    {
        this.img = img;
        this.name = name;
        this.name2 = name2;
    }

    public String getImg() {
        return img;
    }
    public String getName() {
        return name;
    }
    public String getName2() { return name2;}
}
