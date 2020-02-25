package SerialzationDeserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        BankAccount acct = new BankAccount("1234",500);
        acct.deposit(250);
        saveAccount(acct, "accounts.dat");
        BankAccount ba = loadAccount("accounts.dat");
        System.out.println(ba.getId() + " : " + ba.getBalance());
    }

    public static void saveAccount(BankAccount account, String filename) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)))) {
            objectOutputStream.writeObject(account);
        } catch (IOException ioE) {
            ioE.printStackTrace();
        }
    }

    public static BankAccount loadAccount(String fileName) {
        BankAccount ba = null;
        try(ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            ba = (BankAccount) inputStream.readObject();
        } catch (IOException ioE) {
            ioE.printStackTrace();
        } catch (ClassNotFoundException cnfE) {
            cnfE.printStackTrace();
        }
        return ba;
    }

}
