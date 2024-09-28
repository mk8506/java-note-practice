public class Monster extends Parent implements IMove, IFight {
  public Monster(String name, int hp, int speed, int dps) {
    super(name, hp, speed, dps);
  }

  @Override
  public void jump() {
    // TODO Auto-generated method stub
    System.out.println("jump");
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    System.out.println("run");
  }

  @Override
  public void walk() {
    // TODO Auto-generated method stub
    System.out.println("walk");
  }

  @Override
  public void attack() {
    // TODO Auto-generated method stub
    System.out.println("attack");
  }

  @Override
  public void defense() {
    // TODO Auto-generated method stub
    System.out.println("defense");
  }

  @Override
  public void evasion() {
    // TODO Auto-generated method stub
    System.out.println("evasion");
  }

  
}
