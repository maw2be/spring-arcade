package app.besoft.arcade;

import com.arcadedb.ContextConfiguration;
import com.arcadedb.database.Database;
import com.arcadedb.server.ArcadeDBServer;
import com.arcadedb.server.ServerDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArcadeDBconfig {
    @Bean
    public ServerDatabase getDB() {
        ContextConfiguration config = new ContextConfiguration();
        ArcadeDBServer server = new ArcadeDBServer(config);
        return server.getOrCreateDatabase("database/test");
    }
}
