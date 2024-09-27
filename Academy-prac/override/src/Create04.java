public class Create04 {
  public static void main(String[] args) {
    //Protoss
    Protoss01 p = new Protoss01("Prob1", 100, 20, 10);
    p.move("location");
    p.attack("headquarter");
    System.out.println(p.toString());

    //Zilot
    Zilot03 z = new Zilot03("Zilot1", 500, 300, 120);
    z.move("location");
    z.attack("headquarter");
    System.out.println(z.toString());

    //Dragun
    Dragun02 d = new Dragun02("Dragun1", 450, 250, 200);
    d.move("location");
    d.attack("headquarter");
    System.out.println(d.toString());
  }
}
