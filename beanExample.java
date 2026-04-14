public class BeanExample {
    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        
        student.setId(101);
        student.setName("Kushal");
        
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}