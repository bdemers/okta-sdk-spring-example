package com.example.demo;

import com.okta.sdk.client.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * This component will execute the 'run' method when the application starts. This is meant to demonstrate the usage
     * of the Okta SDK {@link Client}.  The usage pattern with be the same in a Web application.
     */
    @Component
    static class SimpleCommandLineRunner implements CommandLineRunner {

        // injected automatically via the constructor, you could use @Autowired too
        private final Client client;

        SimpleCommandLineRunner(Client client) {
            this.client = client;
        }

        @Override
        public void run(String... args) throws Exception {

            // list all of the Okta Users, and print the id
            client.listUsers().forEach(user ->
                    System.out.println(user.getProfile().getLogin()));

            // NOTE, this collection will paginate automatically, so if you have a million users you will
            // be here a while, instead you may want pass a 'filter' into the listUsers method.

            // For more examples see: https://github.com/okta/okta-sdk-java#usage-guide
        }
    }
}
