//Урок 41. Тема: Паттерны проектирования
//Паттерны бывают:
//Поведенческие
//Порождающие
//Структурные


public class Lesson41_patterProject_100722 {
    public static void main(String[] args){
    // Паттерн 1. Singlton - Порождающий

    //Идея:всегда должен быть объект один для всех и мы его объвляем в классе как: private static SuperZlodei zlodei=null;),
    // пример-всегда только одно соединение с БД, только один СУПЕР злодей в сказке
    //сколько бы методов в классе мы не создавали-всегда объект будет создаваться только один раз в каждом из методов

    //1.здесь создаем объект через метод getZlodei
    SuperZlodei zlodei1=SuperZlodei.getZlodei();
    System.out.println(zlodei1.name);   //печать Kashei

    //2.здесь создаем объект через метод с параметром getZlodei(name)
    SuperZlodei zlodei2=SuperZlodei.getZlodei("Bob");
    System.out.println(zlodei2.name);  //печать Kashei - т.к. объект уже не null  имя остается старое!

    //3.здесь создаем объект через метод с параметром getZlodei(name)
    SuperZlodei zlodei3=SuperZlodei.getZlodei("Bob");
     System.out.println(zlodei3.name);  //печать Kashei - т.к. объект уже не null  имя остается старое!
}//m

}
