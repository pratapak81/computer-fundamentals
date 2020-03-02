package com.nsc.designpattern.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Employee employee = new Employee();
        employee.setName("Pratap");
        employee.setNickName("B K");
        employee.setPhone("12345");

        System.out.println("Employee before save");
        System.out.println(employee);

        careTaker.save(employee);

        employee.setPhone("98765");
        careTaker.save(employee);

        System.out.println("Employee after phone number save");
        System.out.println(employee);

        employee.setPhone("565656"); // we haven't called save

        careTaker.revert(employee);

        System.out.println("Revert to last saved point");
        System.out.println(employee);

        careTaker.revert(employee);

        System.out.println("Revert second time");
        System.out.println(employee);
    }
}
