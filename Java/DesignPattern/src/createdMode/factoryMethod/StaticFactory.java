package createdMode.factoryMethod;

/*常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，
 * 一般情况下工厂类不需要实例化。*/

public class StaticFactory {

    private StaticFactory(){}
    
    public static Fruit getBanana(){  return new Banana(); }
    public static Fruit getOrange(){  return new Orange(); }
    public static Fruit getMango(){  return new Mango(); }
}

class Client{
    //客户端代码只需要将相应的参数传入即可得到对象
    //用户不需要了解工厂类内部的逻辑。
    public Fruit get(String name){
    	Fruit fruit = null ;
        if ( name.equals("Banana")) {
        	fruit = StaticFactory.getBanana();
        }else if ( name.equals("Orange")){
        	fruit = StaticFactory.getOrange();
        }else {
        	fruit = StaticFactory.getMango();
        }
        
        return fruit;
    }
}
