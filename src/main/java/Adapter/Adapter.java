package Adapter;

public class Adapter implements IEnemy{
SpecialEnemy specialEnemy=new SpecialEnemy();
    @Override
    public String attack() {
        return specialEnemy.castSpell();
    }
}

