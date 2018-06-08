package dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import po.builder.Builder;
import po.wood.Wood;

@Repository
@EnableAutoConfiguration
public interface WoodRepository extends JpaRepository<Wood,Integer> {

}
