package by.kustarev.consumer;

import by.kustarev.model.Client;
import by.kustarev.writer.Writer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Consumer {

    public static void main(String[] args) {
        // Calling the write method to create a file with clients
        Writer.write();
        // Reading clients and writing them to the console
        try (var input = new ObjectInputStream(new FileInputStream("./clients.dat"))) {
            Client client;
            while (true) {
                client = (Client) input.readObject();
                System.out.println(client);
            }
        } catch (EOFException e) {
            System.out.println("End of file!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Something is wrong when reading clients from a file!");
        }
    }

}
