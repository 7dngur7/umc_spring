package umc.spring.study.domain.mapping;

import lombok.*;
import umc.spring.study.domain.FoodType;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.Mission;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MyLike {
    @Id
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "foodType_id")
    private FoodType foodType;
}
