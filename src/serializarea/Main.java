package serializarea;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user =new User();
        user.liveLevel=32;
        user.inaltime=90;

        FileOutputStream fileOutputStream=new FileOutputStream("sorinus.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        user.inaltime=91;

        FileInputStream fileInputStream=new FileInputStream("sorinus.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        User newUser=(User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.liveLevel);
        System.out.println(newUser.inaltime);
    }

}
