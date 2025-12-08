class Assignment_six{
    public static void main(String[] args) {
        int a =0,sum=0;
        try{
            sum = 10/a;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}