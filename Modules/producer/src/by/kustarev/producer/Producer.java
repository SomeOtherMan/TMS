package by.kustarev.producer;

import by.kustarev.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producer {

    public static List<Client> getClients() {
        List<Client> result = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            result.add(new Client(getRandomAge(), "Client" + i));
        return result;
    }

    private static int getRandomAge() {
        return ThreadLocalRandom.current().nextInt(18, 101);
    }

}
