package Lesson1;

import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {

    private List<T> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
    }

    //Конструктор создает коробку с фруктами
    public Box(T fruit, int number) {
        fruitBox = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            fruitBox.add(fruit);
        }
    }

    //Метод получения коробки
    public List<T> getFruitBox() {
        return fruitBox;
    }

    //Метод добавления одного фрукта
    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    //Добавить фрукты
    public void addSomeFruits(T fruit, int number) {
        for (int i = 0; i < number; i++) {
            fruitBox.add(fruit);
        }
    }

    //Получить вес коробки
    public float getWeightBox() {
        float weight = 0.0f;
        for (T fruit : fruitBox) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    //Сравнить коробки
    public boolean compareBox(Box<?> box) {
        return Math.abs(this.getWeightBox() - box.getWeightBox()) < 0.001;
    }

    //Пересыпать из коробки в коробку
    public void fillBox(Box<T> box) {
        if(box == this){
            return;
        }
        box.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

}
