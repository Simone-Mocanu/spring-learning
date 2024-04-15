package com.models;

public class Person {
  public int id;
  public String name;
  public int age;
  public float weight;

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", age" + age +
        ", weight=" + weight + "]";
  }

  public Person(int id, String name, int age, float weight) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public int getId() { return id; }

  public void setId(int id) { this.id = id; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public int getAge() { return age; }

  public void setAge(int age) { this.age = age; }

  public float getweight() { return weight; }

  public void setWeight(float weight) { this.weight = weight; }
}
