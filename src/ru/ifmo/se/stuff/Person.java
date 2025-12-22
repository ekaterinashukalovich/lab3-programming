package ru.ifmo.se.stuff;

public abstract class Person {
    private String name;
    private String memories;
    private int wish;
    private int lucky;
    private int driving;
 
    public Person(){
        this.name = "";
        this.memories = "";
        this.wish = 0;
        this.lucky = 0;
        this.driving = 0;
    }

    public final String getMemories() {
        return this.memories;
    }
    public final void setMemories(String m) {
        this.memories = m;
    }

    public final int getLucky() {
        return this.lucky;
    }
    public final void setLucky(int l) {
        this.lucky = l;
    }

    public final String getName() {
        return this.name;
    }
    public final void setName(String n) {
        this.name = n;
    }

    public final int getWish() {
        return this.wish;
    }
    public final void setWish(int w) {
        this.wish = w;
    }

    public final int getDriving() {
        return this.driving;
    }
    public final void setDriving(int d) {
        this.driving = d;
    }
    public final void changeLucky(int t) {
        this.lucky += t;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return name.equals(person.name);
}

    @Override
    public int hashCode() {
    return name.hashCode();
}
}