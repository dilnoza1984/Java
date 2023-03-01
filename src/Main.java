
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] namesArray = {"Ali", "Veli", "Lena", "Sami", "Hayati", "Memati", "Canan"};
        ArrayList<String> namesSet = new ArrayList<>();
        namesSet.addAll(Arrays.asList(namesArray));
        System.out.println(namesSet);
        for (int i = 0; i < namesSet.size(); i++) {
            if (namesSet.get(i).contains("e")){
                namesSet.remove(i);
            }
        }
        System.out.println(namesSet);
    }

}

//Remove all the names that contain the letter “e” from the list.