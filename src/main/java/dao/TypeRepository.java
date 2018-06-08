package dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import po.builder.Builder;
import po.type.Type;

@Repository
@EnableAutoConfiguration
public interface TypeRepository extends JpaRepository<Type,Integer> {

}
