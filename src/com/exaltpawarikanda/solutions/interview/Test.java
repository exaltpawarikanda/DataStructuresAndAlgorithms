package com.exaltpawarikanda.solutions.interview;


import java.io.*;

/**
 * Created by Exalt Pawarikanda on 8/5/21
 */
public class Test extends BaseUser implements Cloneable, Serializable {






    public static void main(String[] args) throws CloneNotSupportedException {

        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("admin.ser"));
            Admin admin = new Admin();
            admin.setName("Lokesh");
            admin.setAge(21);
            admin.setPassword("password");
            //Serialize the object
            oos.writeObject(admin);
            oos.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }


        try
        {
            ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("admin.ser"));
            //Read the object back
            Admin readEmpInfo = (Admin) ooi.readObject();
            System.out.println(readEmpInfo.getName());
            System.out.println(readEmpInfo.getAge());
            System.out.println(readEmpInfo.getPassword());
            ooi.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
        Test test1 = new Test();
        Admin admin2= new Admin();
        Admin admin3= new Admin();
        Admin admin4= new Admin();
        Admin admin5= (Admin)admin4.clone();
        /*System.out.println(admin5.equals(admin4));
        System.out.println(admin5 == admin4);
        System.out.println(createdUsersCount);
        System.out.println(createdUsersCount);*/
    }

}
