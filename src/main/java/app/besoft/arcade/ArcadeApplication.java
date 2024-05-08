package app.besoft.arcade;

import com.arcadedb.ContextConfiguration;
import com.arcadedb.database.Database;
import com.arcadedb.database.DatabaseFactory;
import com.arcadedb.server.ArcadeDBServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArcadeApplication implements CommandLineRunner {

    @Autowired
    ArcadeDBconfig arcadeDBconfig;

    public static void main(String[] args) {
        SpringApplication.run(ArcadeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        DatabaseFactory db = new DatabaseFactory(("database/test"));
//        Database database;
//        if (db.exists()) {
//           database = db.;
//        } else {
//           database = db.create();
//        }
//
//
//
//        ContextConfiguration config = database.getConfiguration();
//        System.out.printf(config.toJSON().toString());

//        ContextConfiguration config = new ContextConfiguration();
//        ArcadeDBServer server = new ArcadeDBServer(config);
//        Database database = server.getOrCreateDatabase("database/test");
        Database database = arcadeDBconfig.getDB();
        ContextConfiguration cnf = database.getConfiguration();
        System.out.println(cnf.toJSON().toString());


    }
}
