package generic.basicOfGenericClasses;

// Define a class Student
class Student{
    String name;
    float marks;

    Student(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

class GenericUserClass<T>{  // Use < > to specify class type
    T obj;              // An object of type T is declared
    GenericUserClass(T obj){ // Constructor of the generic class
        this.obj = obj;
    }

    public T getObject(){  // A Method in the class
        return this.obj;
    }
}


class GenericUserDefinedClass{

    public static void main(String[] args) {
        GenericUserClass<Integer> iObj = new GenericUserClass<>(15);

        System.out.println(iObj.getObject());

        GenericUserClass<String> sObj = new GenericUserClass<>("Java");
        System.out.println(sObj.getObject());

        GenericUserClass<Student> tObj = new GenericUserClass<>(new Student("Dheeraj", 99.99f));
        System.out.println(tObj.getObject());
    }
}

