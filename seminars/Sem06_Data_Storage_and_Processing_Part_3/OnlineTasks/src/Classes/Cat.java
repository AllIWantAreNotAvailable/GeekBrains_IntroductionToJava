package Classes;

import java.util.List;
import java.util.Objects;

public class Cat {
    /*
    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
        а) информационной системой ветеринарной клиники
        б) архивом выставки котов
        в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, необязательно реализовывать в java.
     */
    private String name;
    private String breed;
    private Integer age;
    private String owner;
    private List<String> history;

    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public Cat(String name, String breed, Integer age, String owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return  this.name.equals(cat.name)
                && this.breed.equals(cat.breed)
                && Objects.equals(this.age, cat.age)
                && this.owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 7 * this.breed.hashCode() + 11 * this.age + 17 * this.owner.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
