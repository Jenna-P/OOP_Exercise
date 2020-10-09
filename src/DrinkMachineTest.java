public class DrinkMachineTest {
    public static void main(String[] args) {
        // 객체 생성
        DrinkMachine machine1 = new DrinkMachine();
        DrinkMachine machine2 = new DrinkMachine();
        // 음료 뽑기
        machine1.pushButton(1);
        machine2.pushButton(2);
        // 음료 확인
        machine1.printOutput();
        machine2.printOutput();
    }
}
class DrinkMachine {
    /* 필드 */
    String output; //클래스 스코프 (전체 클래스에 output 변수 적용)
    /* 메소드 */
    void pushButton(int num) {
        String[] drinks = {"coke", "seven up", "fanta"}; //method scope (변수가 메소드 안에서만 적용-local variable),배열
        output = drinks[num];//푸쉬버튼 메소드 안에서 아웃풋 변수(local)가 드링크 변수로 적용됨 그리고 메인에서 푸쉬버튼 메소드 호
    }
    void printOutput() {
        System.out.println(output);
    }
}
