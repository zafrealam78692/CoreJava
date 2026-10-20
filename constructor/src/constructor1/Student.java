package constructor1;


class Student {

    int rollNo;
    String name;
    String city;

    // Constructor
    Student(int r, String n,String c) {
        rollNo = r;
        name = n;
        city=c;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("City:" + city);
    }
    
}


