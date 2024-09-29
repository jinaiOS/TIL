package chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();

        Constructor[] constructors = clazz.getConstructors();

        for (Constructor constructor : constructors) {
            // public chapter_44.Customer()
            // public chapter_44.Customer(java.lang.String)
            // public chapter_44.Customer(java.lang.String,java.lang.String)
            System.out.println(constructor);
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            // public int chapter_44.Customer.calculatePrice(int)
            // public boolean chapter_44.Customer.equals(java.lang.Object)
            // public java.lang.String chapter_44.Customer.toString()
            // public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
            // public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
            // public final void java.lang.Object.wait() throws java.lang.InterruptedException
            // public native int java.lang.Object.hashCode()
            // public final native java.lang.Class java.lang.Object.getClass()
            // public final native void java.lang.Object.notify()
            // public final native void java.lang.Object.notifyAll()
            System.out.println(method);
        }

        Field[] fields = clazz.getDeclaredFields(); // public 아니어도 전체 출력
        for (Field field : fields) {
            // static int chapter_44.Customer.serialNums
            // java.lang.String chapter_44.Customer.hello1
            // java.lang.String chapter_44.Customer.hello2
            // public java.lang.String chapter_44.Customer.customerID
            // public java.lang.String chapter_44.Customer.name
            // protected java.lang.String chapter_44.Customer.customerGrade
            // protected int chapter_44.Customer.bonusPoint
            // protected double chapter_44.Customer.bonusPointRatio
            System.out.println(field);
        }
        ///
        Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        // Customer{hello1='Hello', hello2='Hello2', customerID='Customer2', name='민철', customerGrade='SILVER', bonusPoint=0, bonusPointRatio=0.01}
        System.out.println(customer2);
    }
}
