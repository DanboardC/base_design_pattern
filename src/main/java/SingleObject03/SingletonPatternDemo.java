package SingleObject03;

public class SingletonPatternDemo {

    public   static void main(String []  args)
    {
        //不合法的构造函数
//        SingleObject singleObject=new SingleObject();

        SingleObject singleObject=SingleObject.getSingleObject();
        singleObject.showMessage();
     }
}
