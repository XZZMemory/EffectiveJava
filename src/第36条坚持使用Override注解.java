import java.util.HashSet;
import java.util.Set;

public class 第36条坚持使用Override注解 {
    private final char first;
    private final char second;
    public 第36条坚持使用Override注解(char first,char second)
    {
        this.first=first;
        this.second=second;
    }
    @Override
    public boolean equals(Object o) {
        第36条坚持使用Override注解 b=(第36条坚持使用Override注解)o;
        return (b.first==first&&b.second==second);
    }
    @Override
    public int hashCode() {
        return 31*first+second;
    }
//覆盖equals时总要覆盖hashCode 不覆盖hashCode跟没写一样
    public static void main(String[] args)
    {
        Set<第36条坚持使用Override注解> set=new HashSet<第36条坚持使用Override注解>();
        for (int i=0;i<10;i++)
            for (char ch='a';ch<='z';ch++)
                set.add(new 第36条坚持使用Override注解(ch,ch));
        System.out.println(set.size());
    }
}
