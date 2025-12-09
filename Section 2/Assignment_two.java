class Animal {
    public void makeSound(){
        System.out.println("From Animal class");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("From Dog class");
    }
}
class Assignment_two{
        public static void main(String args[]){
            Dog d = new Dog();
            d.makeSound();
        }
}