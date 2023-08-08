package com.multicampus.springex1.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor //생성자 주입
public class SampleService {
    @Qualifier("maria")    //사용할 이름
    //생성자 주입
    private final SampleDAO sampleDAO;  //객체와 객체의 의존관계의 실제 객체를 몰라도 주입이 가능하게 하는 방식 "느슨한 결합"

    //필드 주입
   /* @Autowired
    private SampleDAO sampleDAO;    //Field Injection*/




}
