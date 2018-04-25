package createdMode.prototype;

/*原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
*/


//此处使用的是浅拷贝，关于深浅拷贝，大家可以另行查找相关资料。
public class Prototype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone()   {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }

    public static void main ( String[] args){
        Prototype pro = new Prototype();
        Prototype pro1 = (Prototype)pro.clone();
    }
}
