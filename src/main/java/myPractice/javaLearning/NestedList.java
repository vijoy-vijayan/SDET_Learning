package myPractice.javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedList {

    public void IterateNestedLoop()
    {
        String[] words = new String[0];
        // Static Array
        for(String eachWord:words)
        {   }

        List<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        //Dynamic Array
        for(String eachFruit:fruits)
        {   }

        List<List<String>> paths = new ArrayList<List<String>>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        // Nested Lists
        for(List<String> eachPath:paths)
        {
            for(String eachFruit:eachPath){   }
        }
    }
}
