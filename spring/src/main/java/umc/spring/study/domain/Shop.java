package umc.spring.study.domain;

import lombok.*;
import umc.spring.study.domain.common.BaseEntity;

import javax.persistence.*;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Shop extends BaseEntity {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodType_id")
    private FoodType foodType;

    private String name;

    private String introduce;
}
