import java.util.*;
class Assignment_seven{
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Atharva");
        ls.add("Shivraj");
        ls.add("Aryan");
        ls.add("Arya");
        ls.add("Shreyash");
        for(String a : ls){
            if(a.charAt(0)=='S'){
                System.out.println(a);
            }
        }
    }
}