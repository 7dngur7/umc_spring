package umc.spring.study.converter;

import umc.spring.study.web.dto.TempResponse;


public class TempConverter {
    public static TempResponse.TempTestDTO toTempTestDTO(){
        return TempResponse.TempTestDTO.builder()
                .testString("this is test")
                .build();
    }

    public static TempResponse.TempExceptinoDTO toTempExceptionDTO(Integer flag){
        return TempResponse.TempExceptinoDTO.builder()
                .flag(flag)
                .build();
    }
}
