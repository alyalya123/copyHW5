package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Hero hero = new Hero(100, 20, "static", "Рыцарь");
    Hero hero1 = new Hero(120, 15, "kinetic", "Бык");
    Hero hero2 = new Hero(80, 35, "arrow", "Лучник");
    Boss boss = new Boss(200, 40, "");

        boss.setHp(350);
        boss.setDefenceType("");
        boss.setDamage(45);

      System.out.println("Жизнь босса: " + boss.getHp());
        System.out.println("Его урон = " + boss.getDamage());
        System.out.println("Защита сработала от " + boss.getDefenceType());

        }
        public static Hero[] creatHeroes(){
    Hero hero = new Hero(100, 20, "static", "Рыцарь");
    Hero hero1 = new Hero(120, 15, "kinetic", "Бык");
    Hero hero2 = new Hero(80, 35, "arrow", "Лучник");
    Hero[] heroes = {hero, hero1, hero2};
    return heroes;


}


}
