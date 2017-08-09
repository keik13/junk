package module5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/**
 * Дан сериализуемый класс Animal:
 * <p>
 * class Animal implements Serializable {
 * private final String name;
 * <p>
 * public Animal(String name) {
 * this.name = name;
 * }
 *
 * @Override public boolean equals(Object obj) {
 * if (obj instanceof Animal) {
 * return Objects.equals(name, ((Animal) obj).name);
 * }
 * return false;
 * }
 * }
 * Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. Массив байт устроен следующим образом.
 * Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество объектов типа Animal,
 * сериализованных при помощи ObjectOutputStream.writeObject(animal).
 * <p>
 * Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить исключение java.lang.IllegalArgumentException.
 * <p>
 * Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите, какие исключения будут возникать.
 * Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то проверяющая система подскажет. Главное не глотать никаких исключений,
 * т.е. не оставлять нигде пустой catch.
 * <p>
 * Created by Andrey on 13.10.2016.
 */
public class Step5_4_8 {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] deserializedAnimals = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int countAnimal = objectInputStream.readInt();
            deserializedAnimals = new Animal[countAnimal];
            for (int i = 0; i < deserializedAnimals.length; i++) {
                deserializedAnimals[i] = (Animal) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
        return deserializedAnimals;
    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}