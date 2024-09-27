public class Protoss01 {  //default extends Object
  //instance
  private String name;
  private int hp;
  private int speed;
  private int dps;

  /**
   * constructor
   * @param name  unit name
   * @param hp  energy
   * @param speed
   * @param dps attack/second
   */
  public Protoss01(String name, int hp, int speed, int dps) {
    this.name = name;
    this.hp = hp;
    this.speed = speed;
    this.dps = dps;
    System.out.printf("An unit created: %s, %d, %d\n", name, hp, dps);
  }

  //getters setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getDps() {
    return this.dps;
  }

  public void setDps(int dps) {
    this.dps = dps;
  }

  //methods
  /**
   * go to
   * @param position
   */
  public void move(String position) {
    System.out.printf("%s moves to %s", this.name, position);
  }

  /**
   * attack
   * @param target  name attacks target
   */
  public void attack(String target) {
    System.out.printf("%s attacks %s > damage: %d\n", this.name, target, this.dps);
  }

  @Override
  public String toString() {
    return "{"+getName()+"', hp='"+getHp()+"', speed='"+getSpeed()+"', dps='"+getDps()+"'}";
  }
}