package inheritanceEmployee;

import java.util.ArrayList;
import java.util.Collections;

public class EmpProgram {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Saskatoon");
        stringList.add("Regina");

        stringList.add("Prince Albert");

        System.out.println("This is my list: ");
        System.out.println(stringList);

        ArrayList<String> updateList = new ArrayList<>();
        updateList.add("Calgary");
        updateList.add("Edmonton");
        updateList.add("Winnipeg");

        stringList.addAll(updateList);
        System.out.println(stringList);

        stringList.remove("Calgary");
        System.out.println(stringList);

        stringList.add(2,"Calgary");
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
