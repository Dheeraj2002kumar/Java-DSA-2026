package generic.boundedArgumentGenericClass;

class Student1<T extends Number>{
    String name;
    T[] marks;

    Student1(T[] m){
        marks = m;
    }

    // This method to calculate the total of marks obtained by a Student1
    double total(){
        double sum = 0.0;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i].doubleValue();
        }
        return (sum);
    }

    // This method compares the marks objtained by this
    // Student1 with another Student1
    boolean comparemarks(Student1<?> others){
        if (total() == others.total()){
            return true;
        }
        return false;
    }
    // end of the generic class definition
}


public class GenericLimitationWildcard {
    static void main(String[] args) {
        Integer[] intMarks = { 44, 55, 33, 66, 77};
        Student1<Integer> s1IntMarks = new Student1<>(intMarks);
        System.out.println("Total marks " + s1IntMarks.total());

        Integer[] intMarks2 = { 49, 39, 53, 54, 89};
        Student1<Integer> s2IntMarks = new Student1<>(intMarks2);
        System.out.println("Total marks " + s2IntMarks.total());

        // compare marks between s1 and s2
        if (s1IntMarks.comparemarks(s2IntMarks)){
            System.out.println("Same marks");
        } else{
            System.out.println("Different marks.");
        }

        Double[] doubleMarks = { 41.5, 43.5, 66.4, 55.4, 56.7};
        Student1<Double> s3DoubleMarks = new Student1<>(doubleMarks);
        System.out.println("Total marks " + s3DoubleMarks.total());

        Float[] floatMarks = { 45.3f, 49.5f, 96.4f, 35.4f, 96.7f};
        Student1<Float> s4FloatMarks = new Student1<>(floatMarks);
        System.out.println("Total marks " + s4FloatMarks.total());

        // Compare marks between s2 and s3
        if (s2IntMarks.comparemarks(s3DoubleMarks)){  // ERROR!
            System.out.println("Same marks");
        } else{
            System.out.println("Different marks.");
        }

        // compare marks between s3 and s4
        if (s3DoubleMarks.comparemarks(s4FloatMarks)){  // ERROR!
            System.out.println("Same marks.");
        } else{
            System.out.println("Different marks.");
        }

    }

}
