package ru.job4j.oop;

public class Cat {
    private String food;
    private  String name;

    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("Here's Gav's food");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("Here's Black's food");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black cat");
        black.show();
    }

}
