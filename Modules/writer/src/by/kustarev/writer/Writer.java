package by.kustarev.writer;

import by.kustarev.model.Client;
import by.kustarev.producer.Producer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Writer {

    public static void write() {
        List<Client> clients = Producer.getClients();
        try (var output = new ObjectOutputStream(new FileOutputStream("./clients.dat"))) {
            for(Client client : clients)
                output.writeObject(client);
        } catch (IOException e) {
            System.out.println("Something wrong while writing the file!");
        }
    }

}
