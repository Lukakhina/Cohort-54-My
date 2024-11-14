package homework18;
/*
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака,
 не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
 Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии,
 нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
  Если да -> идем тренироваться -> берет барьер
 */

public class DogHome {
    private String name;
    private int jumpHeight;
    private int initialHighJump;

    public DogHome(String name, int jumpHeight, int initialHighJump) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.initialHighJump = initialHighJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getInitialHighJump() {
        return initialHighJump;
    }

    public void setInitialHighJump(int initialHighJump) {
        this.initialHighJump = initialHighJump;
    }
    public void jump() {
        System.out.println(name + " прыгает на высоту " + jumpHeight + " см.");
    }
    public void train() {
        if (jumpHeight < initialHighJump * 2) {
            jumpHeight += 10;
            if (jumpHeight > initialHighJump * 2) {
                jumpHeight = initialHighJump * 2;
            }
            System.out.println(name + " тренируется. Новая высота прыжка: " + jumpHeight + " см.");
        } else {
            System.out.println(name + " достигла максимальной высоты прыжка.");
        }
    }
    public void jumpBarrier(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " успешно преодолела барьер высотой " + barrierHeight + " см.");
        } else {
            System.out.println(name + " не может преодолеть барьер высотой " + barrierHeight + " см.");
            int potentialJumpHeight = jumpHeight;
            while (potentialJumpHeight < barrierHeight && potentialJumpHeight < initialHighJump * 2) {
                potentialJumpHeight += 10;
            }
            if (potentialJumpHeight >= barrierHeight) {
                System.out.println(name + " может преодолеть барьер после тренировок.");
                while (jumpHeight < barrierHeight) {
                    train();
                }
                jumpBarrier(barrierHeight);
            } else {
                System.out.println(name + " не сможет преодолеть барьер даже после тренировок.");
            }
        }
    }



}
