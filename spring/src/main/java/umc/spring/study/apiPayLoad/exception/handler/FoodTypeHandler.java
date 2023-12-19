package umc.spring.study.apiPayLoad.exception.handler;

import umc.spring.study.apiPayLoad.code.BaseErrorCode;
import umc.spring.study.apiPayLoad.exception.GeneralException;

public class FoodTypeHandler extends GeneralException {

    public FoodTypeHandler(BaseErrorCode code) {
        super(code);
    }
}
