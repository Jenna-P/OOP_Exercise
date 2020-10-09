public class CatTest {
    public static void main(String[] args) {
        // Cat 객체 생성
        Cat c = new Cat();

        /* 1. 객체의 필드 값을 변경하시오. */
        c.name = "nero";
        c.breeds = "persian";
        c.age = 3;

        // Dog 객체 필드값 출력
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("나이: %s\n", c.age);

        c.claw();
        c.meow();
    }
}

/* Cat 클래스 */
class Cat {
    String name;   // 이름
    String breeds; // 품종
    int age;       // 나이

    void claw() {
        System.out.println("할퀴기!!");
    }

    void meow() {
        System.out.println("야옹~");
    }
}
