package com.example.securitree_app3;

public class ClassListItems2 {

        public String img; //Image URL
        public String name; //Name
        public String name2;
        public String name3;


    public ClassListItems2(String name, String img, String name2, String name3)
        {
            this.name3 = name3;
            this.name2 = name2;
            this.img = img;
            this.name = name;
        }

        public String getImg() { return img; }
        public String getName() {return name; }
        public String getName2() { return name2;}
        public String getName3() { return name3;}
    }


