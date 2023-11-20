package umc.spring.study.domain.mapping;

import lombok.*;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.enums.DoingDone;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MyMission {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private DoingDone doingDone;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="mission_id")
    private Mission mission;
}
