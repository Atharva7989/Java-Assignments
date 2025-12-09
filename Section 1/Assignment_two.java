class Assignment_two{
    public static String take(String a){
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        return b;
    }
    public static void main(String args[]){
        System.out.println(take("atharva"));
    }
}
