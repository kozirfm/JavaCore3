package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1
        String[] arr = new String[]{"1", "2", "3", "4", "5"};
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        Double[] arr2 = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] arr3 = new Character[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println("Task1: ");
        System.out.println(Arrays.toString(changeArrElement(arr, 2, 0)));
        System.out.println(Arrays.toString(changeArrElement(arr1, 2, 3)));
        System.out.println(Arrays.toString(changeArrElement(arr2, 3, 0)));
        System.out.println(Arrays.toString(changeArrElement(arr3, 3, 1)));

        //Task2
        System.out.println("\nTask2: ");
        System.out.println(toArrayList(arr).getClass().getSimpleName() + " " + toArrayList(arr).get(0).getClass().getSimpleName());
        System.out.println(toArrayList(arr1).getClass().getSimpleName() + " " + toArrayList(arr1).get(0).getClass().getSimpleName());
        System.out.println(toArrayList(arr2).getClass().getSimpleName() + " " + toArrayList(arr2).get(0).getClass().getSimpleName());
        System.out.println(toArrayList(arr3).getClass().getSimpleName() + " " + toArrayList(arr3).get(0).getClass().getSimpleName());

        //Task3
        System.out.println("\nTask3: ");
        //Создаем коробку №1 с яблоками
        Box<Apple> appleBox1 = new Box<>(new Apple(), 7);
        //Создаем коробку №2 с яблоками
        Box<Apple> appleBox2 = new Box<>(new Apple(), 6);
        //Добавляем в коробку №2, 2 яблока
        appleBox2.addSomeFruits(new Apple(), 2);
        //Создаем коробку для апельсинов
        Box<Orange> orangeBox1 = new Box<>();
        //Добавляем в коробку с апельсинами, 10 апельсинов
        orangeBox1.addSomeFruits(new Orange(), 10);
        System.out.println("Вес коробки с яблоками №1 до пересыпания: " + appleBox1.getWeightBox());
        System.out.println("Вес коробки с яблоками №2 до пересыпания: " + appleBox2.getWeightBox());
        // Пересыпаем яблоки из одной коробки в другую
        appleBox1.fillBox(appleBox2);
        System.out.println("Вес коробки с яблоками №1 после пересыпания: " + appleBox1.getWeightBox());
        System.out.println("Вес коробки с яблоками №2 после пересыпания: " + appleBox2.getWeightBox());
        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeightBox());
        //Сравниваем вес коробок с яблоками и апельсинами
        System.out.println("Вес коробок равен: " + appleBox2.compareBox(orangeBox1));
    }

    //Task1
    public static <T> T[] changeArrElement(T[] arr, int first, int second) {
        if (arr.length > 1 && first >= 0 && first < arr.length && second >= 0 && second < arr.length) {
            T third = arr[first];
            arr[first] = arr[second];
            arr[second] = third;
        } else {
            System.out.println("В массиве недостаточно елементов или введены некорректные номера элементов");
        }
        return arr;
    }

    //Task2
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}
