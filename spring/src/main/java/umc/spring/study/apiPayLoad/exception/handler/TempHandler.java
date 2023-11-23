package umc.spring.study.apiPayLoad.exception.handler;

import umc.spring.study.apiPayLoad.code.BaseErrorCode;
import umc.spring.study.apiPayLoad.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode code) {
        super(code);
    }
}
