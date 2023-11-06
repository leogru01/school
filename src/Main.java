public class Main {
    public static void main(String[] args) {

        Person p = new Person(100, "Hans Nielsen", "hni@easv.dk");
        Person p1 = new Person(101, "Niels Hansen ", "nha@easv.dk");
        Person p2 = new Person(102, "Ib Boesen","ibo@easv.dk");
        Test_Class tc = new Test_Class();
        tc.setPersonList(p);
        tc.setPersonList(p1);
        tc.setPersonList(p2);

        for(Person m : tc.getPersonList()){
            System.out.println(p.toString());
        }


    }
}