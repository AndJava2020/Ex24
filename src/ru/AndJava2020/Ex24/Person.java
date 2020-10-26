package ru.AndJava2020.Ex24;

public class Person {
    private String name="";
    private String surname;
    private String middlename="";

    public Person(String surname){
        this.surname=surname;

    }

    public Person(String name, String surname, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }

    public String getFCs(){
        String res=surname;
        if(name!="") res+=(" "+name.substring(0,1) +".");
        if(middlename!="") res+=(" "+middlename.substring(0,1) +".");
        return res;
    }

}
