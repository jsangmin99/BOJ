package solvedac;

public class Singleton {
    //    클래스의 유일한 정적 변수
    private static Singleton singletonInstance;

    //    private 생성자를 통해 외부에서 객체 생성을 막음
    private Singleton() {
    }

    //    싱글톤 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

//    확인용 메시지
    public  void showMessage(){
        System.out.println("싱글톤 출력~~~");
    }


    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();
        singleton2.showMessage();

        System.out.println("------- 같은 객체인지 확인 --------");
        System.out.println(singleton1 == singleton2);
        if (singleton1 == singleton2) {
            System.out.println("singleton1 과 singleton2 는 같은 인스턴스");
        } else {
            System.out.println("singleton1 과 singleton2 는 다른 인스턴스");
        }
    }
}
