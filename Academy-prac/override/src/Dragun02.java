public class Dragun02 extends Protoss01 {
  //parent's constructer
  public Dragun02(String name, int hp, int speed, int dps) {
    super(name, hp, speed, dps);
  }

  @Override
  //attack() of Dragun02: long distance attack
  public void attack(String target) {
    super.attack(target); //parent's content
    System.out.println("[Dragun] long distance attack");
  }

  @Override
  //move() of Dragun02: move on the ground
  public void move(String position) {
    super.move(position);
    System.out.println("[Dragun] move to the position on the ground");
  }
  
  /**
   * Dragun02's only method
   * @param target
   */
  public void fireAttack(String target) {
    System.out.printf("[Dragun] %s fires %s\n", this.getName(), target);
  }
}
