public class DogTest {


        public static void main(String[] args) {
            // Dog 객체 생성
            Dog d = new Dog();

            d.name = "choco";
            d.breeds = "poodle";
            d.age = 2;

            // Dog 객체 필드 값 출력
            System.out.printf("Name: %s\n", d.name);
            System.out.printf("Breeds: %s\n", d.breeds);
            System.out.printf("Age: %s\n", d.age);

            d.wag();
            d.bark();
        }

    /* Dog 클래스 */
    static class Dog {
        /* 1. 필드 영역을 작성하시오. */
        String name;
        String breeds;
        int age;

        /* 2. 메소드 영역을 추가하시오. */
        void wag(){
            System.out.println("wagging");
        }

        void bark(){
            System.out.println("barking");
        }
    }
    }

