public class Main {


    static class A{
        public final void lol(){
            System.out.println("Lol");
        }
    }

    static class B extends A{

    }
    public static void main(String[] args) {
        Datasource datasource = Datasource.getInstance();
        Datasource anotherDatasource = Datasource.getInstance();
        System.out.println(datasource == anotherDatasource);
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton);
        new B().lol();
    }
}
