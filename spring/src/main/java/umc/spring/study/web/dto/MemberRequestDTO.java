package umc.spring.study.web.dto;

import lombok.Getter;
import umc.spring.study.domain.mapping.MyRegion;

import java.util.List;

public class MemberRequestDTO {
//    @NotBlank
//    String name;
//    @NotNull
//    Integer gender;
//    @NotNull
//    Integer birthYear;
//    @NotNull
//    Integer birthMonth;
//    @NotNull
//    Integer birthDay;
//    @Size(min = 5, max = 12)
//    String spec_address;
//    @Size(min = 5, max = 12)
//    String email;
//    @NotNull
//    Integer point;
//    @NotNull
//    Integer mission_count;
//
//    //    @ExistCategories
////    List<Long> my_region;
    @Getter
    public static class JoinDto {
        String name;
        Integer gender;
        Integer birthYear;
        Integer birthMonth;
        Integer birthDay;
        String socialType;
        String spec_address;
        String email;
        Integer point;
        Integer mission_count;
        List<Long> preferCategory;
    }
}
