package tech.ashfaq.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ashfaq.server.model.Server;

public interface ServerRepository extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);
    Server findByName(String name);
}
