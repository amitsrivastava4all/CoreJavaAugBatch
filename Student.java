class Student {
    int rollno;
    String name;
    String course;
    String phone;
    public int hashCode(){
    return name.length;
    }
    public static void main(String args[]){
        Student ram = new Student();
        System.out.println("Rollno "+ram.rollno);
          System.out.println("Name "+ram.name);
            System.out.println("Course "+ram.course);
              System.out.println("Phone "+ram.phone);
        System.out.println("Ram "+ram);
        Student shyam = new Student();
        System.out.println("Shyam "+shyam);
        int x;
        x= 100;
    }

}