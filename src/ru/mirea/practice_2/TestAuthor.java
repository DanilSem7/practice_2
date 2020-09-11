package ru.mirea.practice_2;
public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Ann", "ann@mail.ru", 'F');

        System.out.println(a.toString());
        a.setEmail("annnew@mail.ru");
        System.out.println(a);
    };
};