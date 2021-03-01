package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlStudent {
    Scanner sc = new Scanner(System.in);
    List<Student> lst =new ArrayList<>();
    public void InputList(){
        System.out.println("Nhap so hoc sinh can nhap:");
        int number= Integer.parseInt(sc.nextLine());
        for(int i =0 ; i<number;i++){
            lst.add(InputStudent());
        }
    }
    public void showStudent(){
        lst.forEach(s-> System.out.println(s.toString()));

//        for (Student data: lst) {
//            System.out.println(data.toString());
//        }
//        for (int i = 0; i <lst.size() ; i++) {
//            System.out.println(lst.get(i).toString());
//        }
//        while (){}
//        do {
//
//        }while ()
    }

    public Student InputStudent() {
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String address= sc.nextLine();
        System.out.println("Nhap lop:");
        String className=sc.nextLine();
        System.out.println("Nhap ma hoc sinh");
        String studentCode=sc.nextLine();
        return new Student(name,address,className,studentCode);
    }
}
