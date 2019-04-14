import java.util.HashMap;
import java.util.Map;

public class Tracer {
    private Map<String, Integer> stringMap;

    public Tracer()
    {
        stringMap = new HashMap<>();
    }

    public void add(String input)
    {
        stringMap.put(input, stringMap.getOrDefault(input,0)+1);
    }

    public int count(String string)
    {
        return stringMap.getOrDefault(string,0);
    }


}
