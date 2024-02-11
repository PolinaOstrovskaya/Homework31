package Adapter;

public class Main {
        public static void main(String[] args) {
            IEnemy iEnemy=new Adapter();
            System.out.println(iEnemy.attack());
        }
    }
