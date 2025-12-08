import java.util.*;
class Assignment_eight{
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Delhi","India");
        hm.put("London","England");
        hm.put("Sydney","Australia");
        for(String key:hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
    }
}