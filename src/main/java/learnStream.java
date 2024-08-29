import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class learnStream {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<String>();
        names.add("Kishori");
        names.add("Kusum");
        names.add("Kundan");
        names.add("Suresh");
        names.add("Kanchan");
        names.add("Anvika");
int count=0;
        for(int i=0;i< names.size();i++)
        {
            String name=names.get(i);
            if(name.startsWith("K"))
            {
                count++;
            }

        }
        System.out.println(count);
    }
    @Test
    public void streamFilter()
    {
        ArrayList<String>names=new ArrayList<String>();
        names.add("Kishori");
        names.add("Kusum");
        names.add("Kundan");
        names.add("Suresh");
        names.add("Kanchan");
        names.add("Anvika");

        List<String> myName= names.stream().filter(s->s.startsWith("K")).collect(Collectors.toList());
        myName.forEach(System.out::println);
      long count1= names.stream().filter(s->s.startsWith("K")).count();
      System.out.println(count1);
     // names.stream().filter(s->s.startsWith("K")).limit(1).forEach(s->System.out.println(s));
    }
    @Test
    public void streamMap()
    {
       Stream.of("Kishori","Kusum","Kunadan","Suresh","Kanchan","Anvika","Teena").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        Stream.of("Kishori","Kusum","Kunadan","Suresh","Kanchan","Anvika","Teena").filter(s->s.startsWith("K")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        ArrayList<String>names=new ArrayList<String>();
        names.add("Kishori");
        names.add("Kusum");
        names.add("Kundan");
        names.add("Suresh");
        names.add("Kanchan");
        names.add("Anvika");

        List<String> data=new ArrayList<>();
        data.add("Advait");
        data.add("Chaitanya");
       System.out.println("------------------------");
        Stream<String> newStream=Stream.concat(names.stream(),data.stream());
       // newStream.sorted().forEach(s->System.out.println(s));

        boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Advait"));
        System.out.println(flag);
        Assert.assertTrue(true);

    }
    @Test
    public void streamCollect()
    {
        Stream.of("Kishori","Kusum","Kunadan","Suresh","Kanchan","Anvika","Teena")
                .filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(s->System.out.println(s));
        List<Integer> values= Arrays.asList(1,1,45,45,67,9,23,900);
        values.stream().distinct().forEach(s->System.out.println(s));
    }
}
