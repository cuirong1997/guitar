package dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import po.builder.Builder;
import po.guitar.Guitar;

@Repository
@EnableAutoConfiguration
public interface BuilderRepository extends JpaRepository<Builder,Integer> {

}
