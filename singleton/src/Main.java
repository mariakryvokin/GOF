public class Main {


    public static void main(String[] args) {
        Datasource datasource = Datasource.getInstance();
        Datasource anotherDatasource = Datasource.getInstance();
        System.out.println(datasource == anotherDatasource);
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton);
    }
}
