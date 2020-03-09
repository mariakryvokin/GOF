public class Datasource {

    private Datasource() {
    }

    private static class SingletonHolder{
        private final static Datasource datasource = new Datasource();
    }


    public static Datasource getInstance(){
      return SingletonHolder.datasource;
    }
}
