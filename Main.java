package com.company;

public class Main {

    public static class Animal{
        Animal animal;
        public String Kind;
        public String Name;
        public String location;
        private String food;


        Animal(String Kind,String Name,String location,String food){
            this.Kind = Kind;
            this.Name = Name;
            this.location=location;
            this.food=food;
        }

        public void makeNoise(){
            System.out.println("звучит");
        }
        public void sleep(){
            System.out.println("спит");
        }
        public void displayInfo(){
            System.out.println("Место приёма: " + location);
            System.out.println("Любимая еда: " + food);
        }

    }

    static class Dog extends Animal{
        private String minuses = "слишком активный.";
        private String pros = "забавно прыгает.";

        Dog(String Kind,String Name,String location,String food) {
            super(Kind,Name, location, food);
        }


        @Override
        public void makeNoise() {
            System.out.println("Звуки: Громко гафкает.");
        }

        @Override
        public void sleep() {
            System.out.println("Сон: Уснул спустя 5 часов. Длительность 2 часа.");
        }

        @Override
        public void displayInfo() {
            makeNoise();
            sleep();
            System.out.println("---Минусы: " + minuses);
            System.out.println("+++Плюсы: " + pros);
        }
    }
    static class Horse extends Animal{
        private String minuses = "очень большой.";
        private String pros = " мягкая грива.";
        Horse(String Kind,String Name,String location,String food) {
            super(Kind, Name,location, food);
        }

        @Override
        public void makeNoise() {
            System.out.println("Звуки: Много фыркает");
        }

        @Override
        public void sleep() {
            System.out.println("Сон: Уснул спустя 2 часа. Длительность 4 часа.");
        }

        @Override
        public void displayInfo() {
            makeNoise();
            sleep();
            System.out.println("---Минусы: " + minuses);
            System.out.println("+++Плюсы: " + pros);
        }
    }
    static class Cat extends Animal{
        private String minuses = " вредная.";
        private String pros = " ласковая когда в хорошем настроении.";
        Cat(String Kind,String Name,String location,String food) {
            super(Kind, Name, location, food);
        }


        @Override
        public void makeNoise() {
            System.out.println("Звуки: Почти не мяукает.");
        }

        @Override
        public void sleep() {
            System.out.println("Сон: Уснула спустя 1 час. Длительность 34 минуты.");
        }

        @Override
        public void displayInfo() {
            makeNoise();
            sleep();
            System.out.println("---Минусы: " + minuses);
            System.out.println("+++Плюсы : " + pros);
        }
    }
    static class Veterinarian{
        void treatAnimal(Animal animal) {
            System.out.println("Сейчас у ветеринара Айболита " + animal.Kind + ".");
            System.out.println("Карточка животного: " + animal.Kind + " "+ animal.Name+ ".");
            System.out.println("Место приёма: " + animal.location);
            System.out.println("Любимая еда: " + animal.Name+ " любит " + animal.food);
        }
    }
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("cобакен","Бобик", "ул. Столовая, д. 52.", "маринованные огурчики.");
        animals[1] = new Cat("котейка","Мяука","ул. Улыбки, д. 17.", "Whiskas со вкусом нежной курочки.");
        animals[2] = new Horse("лошадка","Фыр","ул. Чкалова, д. 69", "свежее весеннее сено.");
        for (int i = 0; i <= animals.length - 1; i++) {
            vet.treatAnimal(animals[i]);
            animals[i].displayInfo();
            System.out.println("\n");
        }
    }
}
