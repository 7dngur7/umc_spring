package umc.spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.FoodType;

public interface FoodTypeRepository extends JpaRepository<FoodType, Long> {

}
