public class Main {

    public static void main(String[] args) {

        MyBox<Integer> firstBox = new MyBox<>();
        firstBox.add(15);

        MyBox<Integer> secondBox = new MyBox<>();
        secondBox.add(27);

        MyBox<String> textBox = new MyBox<>();
        textBox.add("Hello, Java!");

        System.out.println("Первая коробка: " + firstBox.get());
        System.out.println("Вторая коробка: " + secondBox.get());
        System.out.println("Текстовая коробка: " + textBox.get());

        System.out.println("Первая коробка пуста: "
                + firstBox.isEmpty());

        Integer[] numbers = {3, 8, 1, 12, 5};
        String[] words = {"Java", "Generics", "MyBox"};
        Double[] decimals = {2.5, 7.1, 4.6};

        System.out.println("\nМассив целых чисел:");
        MyBox.printArray(numbers);

        System.out.println("\nМассив строк:");
        MyBox.printArray(words);

        System.out.println("\nМассив дробных чисел:");
        MyBox.printArray(decimals);

        MyBox<Integer> thirdBox = new MyBox<>();
        thirdBox.add(42);

        MyBox<Integer> fourthBox = new MyBox<>();
        fourthBox.add(31);

        System.out.println("\nМаксимум из двух коробок: "
                + MyBox.findMax(thirdBox, fourthBox));
    }
}
