package by.overone.lesson24homework;

public class Fruit {

    public static int apple;
    public static int peach;

    public Fruit(int apple, int peach) {
        this.apple = apple;
        this.peach = peach;

    }
    // решение задачи 1
    //  private class Bones {
    //   public void getAmount() {
    //   int amount = apple * 10 + peach;
    //   System.out.println("Amount of bones" + " " + "=" + " " + amount);
    //     }
    // }
    // void displayBones() {
    //     Bones bones = new Bones();
    //     bones.getAmount();

    // решение задачи 2
//     public class Bones {
//     public final static int applesBones = 20;
//      public final static int peachBones = 5;
//  }
    // решение задачи 3
    static class Bones {

        public void getAmount(){
         Fruit fruit = new Fruit(1, 3);
         int amount= apple * 10 + peach;
            System.out.println("Amount of bones" + " " + "=" + " " + amount);
        }

         public void meth(){
            Bones bones = new Bones();
            bones.getAmount();
         }
              }
    }





