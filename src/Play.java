import dk.mak.learnedma.generated.valuedomains.*;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

public class Play {
    public static void main(String[] args) {

        Pair name = Pair.create()
                .key("name")
                .value(MyValue.create(MyString.create("John")));

        Pair age = Pair.create()
                .key("age")
                .value(MyValue.create(MyInteger.create(32)));

        Pair student = Pair.create()
                .key("student")
                .value(MyValue.create(MyObject.begin().add(name).add(age).end()));

        Pair id1 = Pair.create()
                .key("id")
                .value(MyValue.create(MyInteger.create(1234)));

        Pair name1 = Pair.create()
                .key("name")
                .value(MyValue.create(MyString.create("Seahorse riding")));

        Pair etcs1 = Pair.create()
                .key("ects")
                .value(MyValue.create(MyInteger.create(15)));


        MyObject obj1 = MyObject.begin()
                .add(id1)
                .add(name1)
                .add(etcs1)
                .end();

        Pair id2 = Pair.create()
                .key("id")
                .value(MyValue.create(MyInteger.create(4321)));

        Pair name2 = Pair.create()
                .key("name")
                .value(MyValue.create(MyString.create("Squid painting")));

        Pair etcs2 = Pair.create()
                .key("ects")
                .value(MyValue.create(MyInteger.create(5)));


        MyObject obj2 = MyObject.begin()
                .add(id2)
                .add(name2)
                .add(etcs2)
                .end();

        Pair courses = Pair.create()
                .key("courses")
                .value(MyValue.create(MyArray.begin().add(obj1).add(obj2).end()));

        Pair active = Pair.create().key("active").value(MyValue.create(MyBoolean.create(true)));

        MyObject json = MyObject.begin().add(student).add(courses).add(active).end();
        System.out.println(json.toJson());
    }
}
