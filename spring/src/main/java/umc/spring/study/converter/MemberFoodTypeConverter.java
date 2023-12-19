package umc.spring.study.converter;

import umc.spring.study.domain.FoodType;
import umc.spring.study.domain.mapping.MyLike;

import java.util.List;
import java.util.stream.Collectors;

public class MemberFoodTypeConverter {
    public static List<MyLike> MemberFoodTypeConvert(List<FoodType> foodTypeList) {
        return foodTypeList.stream()
                .map(foodType ->
                    MyLike.builder()
                            .foodType((FoodType) foodTypeList)
                            .build()
                ).collect(Collectors.toList());
    }
}
