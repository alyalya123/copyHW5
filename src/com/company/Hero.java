package com.company;

public class Hero {

    private int hp;
    private int damage;
    private String magic;
    private String name;

public Hero (int hp, int damage, String magic,String name)

    {
        this.hp = hp;
        this.damage = damage;
        this.magic = magic;
        this.name = name;

    }


    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getMagic() {
        return magic;
    }
    public String getName(){
        return name;
    }
}
