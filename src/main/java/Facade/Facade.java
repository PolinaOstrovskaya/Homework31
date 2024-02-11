package Facade;

public class Facade {
Laptop laptop;
Mobile mobile;
Computer computer;
    public Facade() {
        mobile = new Mobile();
        laptop = new Laptop();
        computer=new Computer();
    }

    void playGame() {
        computer.playGame();
    }

    void watchVideo() {
        laptop.watchVideo();
    }

    void  readBook() {
        mobile. readBook();
    }

}
