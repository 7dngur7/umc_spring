package umc.spring.study.service.memberService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.apiPayLoad.code.status.ErrorStatus;
import umc.spring.study.apiPayLoad.exception.handler.FoodTypeHandler;
import umc.spring.study.converter.MemberConverter;
import umc.spring.study.converter.MemberFoodTypeConverter;
import umc.spring.study.domain.FoodType;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.mapping.MyLike;
import umc.spring.study.repository.FoodTypeRepository;
import umc.spring.study.repository.MemberRepository;
import umc.spring.study.web.dto.MemberRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberCommandServiceImpl implements MemberCommandService{
    final MemberRepository memberRepository;
    final FoodTypeRepository foodTypeRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto joinDto) {
        Member member = MemberConverter.toMember(joinDto);
        List<FoodType> foodTypeList = joinDto.getPreferCategory().stream()
                .map(myFoodType -> {
                    return foodTypeRepository.findById(myFoodType).orElseThrow(() -> new FoodTypeHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MyLike> myFoodTypeList = MemberFoodTypeConverter.MemberFoodTypeConvert(foodTypeList);

        for(MyLike myLike:myFoodTypeList){
            myLike.setMember(member);
        }

        return memberRepository.save(member);
    }
}
