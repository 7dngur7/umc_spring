package umc.spring.study.domain;

import lombok.*;
import umc.spring.study.domain.common.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodType extends BaseEntity {

    @Id
    private Long id;

    private String name;


}
