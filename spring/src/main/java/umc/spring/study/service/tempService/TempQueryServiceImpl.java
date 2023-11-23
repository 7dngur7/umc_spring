package umc.spring.study.service.tempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.apiPayLoad.code.status.ErrorStatus;
import umc.spring.study.apiPayLoad.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEST_STATUS);
    }
}