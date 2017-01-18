package com.example.recyeleviewtest;

import java.io.Serializable;

/**
 * Created by 坏蛋 on 2016/12/21.
 */
public class Fruit implements Serializable {
    private String fruit_name ;
    private int image_id;

    public Fruit(String fruit_name, int image_id) {
        this.fruit_name = fruit_name;
        this.image_id = image_id;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
