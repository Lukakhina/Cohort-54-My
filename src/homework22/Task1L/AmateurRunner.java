package homework22.Task1L;

public class AmateurRunner extends Human {
    public AmateurRunner() {
        super(15, 10);
        this.setTypeRunner("Любитель ");


    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
// можно было создать другим способом
  //  @Override
 //   public void run() {
  //      System.out.println("Любитель бежит со скоростью 15 км/ч ");
 //   }
  //  @Override
 //   public void run() {
 //       System.out.println("Профессионал бежит со скоростью 15 км/ч ");
 //   }
}
