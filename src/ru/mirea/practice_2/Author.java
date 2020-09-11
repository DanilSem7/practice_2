package ru.mirea.practice_2;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    };
    public String getName()
    {
        return name;
    };
    public String getEmail()
    {
        return email;
    };
    public void setEmail(String email)
    {
        this.email = "hello@mail.ru";
    };
    public char getGender()
    {
        return gender;
    };
    public String toString()
    {
        return this.getName()+" ("+this.getGender()+") at "+this.getEmail();
    };
}
