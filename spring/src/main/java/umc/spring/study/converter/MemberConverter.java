package umc.spring.study.converter;

import umc.spring.study.domain.Member;
import umc.spring.study.domain.Review;
import umc.spring.study.domain.enums.Gender;
import umc.spring.study.domain.enums.MemberStatus;
import umc.spring.study.domain.enums.SocialType;
import umc.spring.study.domain.mapping.MyLike;
import umc.spring.study.domain.mapping.MyMission;
import umc.spring.study.domain.mapping.MyRegion;
import umc.spring.study.web.dto.MemberRequestDTO;
import umc.spring.study.web.dto.MemberResponseDTO;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemberConverter {
    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member) {
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now()).build();


    }


    public static Member toMember(MemberRequestDTO.JoinDto joinDto) {
        Gender gender = null;

        switch (joinDto.getGender()) {
            case 1:
                gender = Gender.Male;
                break;
            case 2:
                gender = Gender.Female;
                break;

        }

        return Member.builder()
                .email(joinDto.getEmail())
                .address(joinDto.getSpec_address())
                .gender(gender)
                .name(joinDto.getName())
                .myLikeList(new ArrayList<>())
                .build();
    }

}
