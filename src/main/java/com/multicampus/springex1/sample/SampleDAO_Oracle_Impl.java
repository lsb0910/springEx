package com.multicampus.springex1.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("oracleDAO")
public class SampleDAO_Oracle_Impl implements SampleDAO{

}
