public class SuperZlodei {
    //так объявляем, если хотим иметь только один объект для всех
    //например, одна база данных
    private static SuperZlodei zlodei=null;
    public String name;

    public SuperZlodei() {
    }

    //создали метод getZlodei со входным параметром name
    public static SuperZlodei getZlodei(String name) {
        if (zlodei==null){
            zlodei=new SuperZlodei();
            zlodei.name=name;
        }
        return zlodei;
    }

    //переопределили метод getZlodei без входного параметра
    public static SuperZlodei getZlodei() {
        if (zlodei==null){
            zlodei=new SuperZlodei();
            zlodei.name="Kashei";
        }
        return zlodei;
    }

    public void setName(String name) {
        this.name = name;
    }
}
