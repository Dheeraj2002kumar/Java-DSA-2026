/*
Generic method: Syntax

a method that can refer to any data type is known as a generic method.

The syntax for declaring a generic method is as follows:
<access_specifier> <return_type> mName(<type list>){
    // body of the method
}

Generic Method versus method overloading
Note:
1. you can readily understand the similarity between method Overloading and generic method. Both the concepts ave the same objective, but in their own ways.
2. The main difference is that in case of method overloading, we have to build code for each overloaded method, whereas, with generic method, same coe can work for the different type of data.
3. Further, with generic method, theoretically you can pass any of data as argument. However, with method overloading only a limited number of arguments are allowed.
4. According to the class encapsulation, method overloading and method overriding are also applicable to generic method

 */

package generic.method;

public class GenericMethod {
    // defining a generic method to print any data type
    <T> void genericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args){
        GenericMethod aObj = new GenericMethod();

        aObj.genericPrint(101);
        aObj.genericPrint("Joy with Java");
        aObj.genericPrint(3.1412);

    }

}
