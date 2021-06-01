/**
 * 饿汉式
 */
public class Mgr01 {

    private static final Mgr01 instance = new Mgr01();

    private Mgr01() {

    }

    public static Mgr01 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
