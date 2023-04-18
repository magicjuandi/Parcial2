package com.Parcial.MallCenter.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.Parcial.MallCenter.Model.MallCenter;

public class MainMall {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opt = "1";
        MallRep rep = new MallRepImp();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.List \n 3.Edit" + "\n 4.Delete \n 5.Exit \n =>");
            opt = s.next();
            switch(opt) {
                case "1": {

                    System.out.println("Id of the mall: ");
                    Integer id = s.nextInt();
                    System.out.println("Name of the mall: ");
                    String name = s.next();
                    System.out.println("City of the mall: ");
                    String city = s.next();
                    System.out.println("Address of the mall: ");

                    String address = s.next();
                    rep.save(new MallCenter(id, name, city, address));;
                    break;

                }case "2": {
                    List<MallCenter> malls = rep.findAll();
                    malls.forEach(System.out::println);
                    break;
                }case "3": {
                    System.out.println("~~~~~Edit~~~~~");
                    System.out.println("Id: ");
                    Integer idC = s.nextInt();
                    System.out.println("Name: ");
                    String name = s.next();
                    System.out.println("City: ");
                    String city = s.next();
                    System.out.println("Address: ");
                    String address = s.next();
                    MallCenter update = new MallCenter(idC, name, city, address);
                    rep.update(update);
                    break;
                }case "4": {
                    System.out.println("~~~~~Delete~~~~~");
                    System.out.println("Insert Id of the Mall Center: ");
                    Integer id = s.nextInt();
                    rep.delete(rep.findbyid(id));
                    rep.findAll().forEach(System.out::println);
                    break;
                }case "5": {
                    opt = "5";
                    break;
                }
            }
        }while (opt != "5");
    }
}
