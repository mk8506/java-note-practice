public class Me extends Parent implements IMove, IFight, IMovement {
  public Me(String name, int hp, int speed, int dps) {
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

  @Override
  public void pickUpItem() {
    // TODO Auto-generated method stub
    System.out.println("pick up item");
  }

  @Override
  public void talkNpc() {
    // TODO Auto-generated method stub
    System.out.println("talk");
  }  


}
