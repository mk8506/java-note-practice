public class Zilot03 extends Protoss01 {
  public Zilot03(String name, int hp, int speed, int dps) {
    super(name, hp, speed, dps);
  }

  @Override
  public void move(String target) {
    System.out.printf("[Zilot] %s moves to %s\n", this.getName(), target);
  }

  @Override
  public void attack(String target) {
    System.out.printf("[Zilot] %s stabs %s > damage: %d\n", this.getName(), target, this.getDps());
  }

  /**
   * Zilot's only method
   * @param target
   */
  public void swardAttack(String target) {
    System.out.printf("[Zilot] %s attacks %s with a knife\n", this.getName(), target);
  }
}
