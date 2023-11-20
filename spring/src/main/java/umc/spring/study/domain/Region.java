package umc.spring.study.domain;

import lombok.*;
import umc.spring.study.domain.common.BaseEntity;

import javax.persistence.*;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region extends BaseEntity {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private umc.spring.study.domain.enums.Region region;


}
