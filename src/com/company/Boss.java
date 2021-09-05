package com.company;

public class Boss {
    private int hp;
    private int damage;
    private String defenceType;

    public Boss(int hp, int damage, String defenceType) {
        this.hp = hp;
        this.damage = damage;
        this.defenceType = defenceType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }
}
