import java.util.ArrayList;
import java.util.List;

public class Test_Class {
    private List<Person> personList;

    public Test_Class() {
        personList = new ArrayList<>();
    }

public void setPersonList(Person p) {
        personList.add(p);
        }

    public List<Person> getPersonList() {
        return personList;
    }
    }
