package generic.parameterizedGenericClass;

// Student class
class Student{
    String name;
    int[] marks;

    Student(String s, int[] m){
        name = s;
        marks = m;
    }

    void printStudent(){
        System.out.println("Name : " + name);
        System.out.print("Scores : ");
        for (int m : marks){
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

// Generic class
class GenericMultiArray<T, S>{
    T[] a;
    S[] b;

    GenericMultiArray(T[] x, S[] y){
        a = x;
        b = y;
    }

    // print T array
    void printT(){
        for(T item : a){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // print Student array (S assumed as Student)
    void printS(){
        for(S item : b){
            ((Student)item).printStudent();
        }
    }

    // reverse T
    void reverseT(){
        int front = 0, rear = a.length - 1;
        while(front < rear){
            T temp = a[rear];
            a[rear] = a[front];
            a[front] = temp;
            front++; rear--;
        }
    }

    // reverse S
    void reverseS(){
        int front = 0, rear = b.length - 1;
        while(front < rear){
            S temp = b[rear];
            b[rear] = b[front];
            b[front] = temp;
            front++; rear--;
        }
    }
}

// Main class
public class GenericMultiArraydemo {
    public static void main(String[] args) {

        String[] t = {"A", "B", "C"};

        Student[] s = new Student[3];
        s[0] = new Student("Dheeraj", new int[]{84, 33, 22});
        s[1] = new Student("Niharika", new int[]{82, 55, 77});
        s[2] = new Student("Niraj", new int[]{83, 66, 77});

        GenericMultiArray<String, Student> arrayData =
                new GenericMultiArray<>(t, s);

        // print
        arrayData.printT();
        arrayData.printS();

        // reverse
        arrayData.reverseT();
        arrayData.reverseS();

        // print again
        arrayData.printT();
        arrayData.printS();
    }
}