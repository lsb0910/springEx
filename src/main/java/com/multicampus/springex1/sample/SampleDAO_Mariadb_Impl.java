package com.multicampus.springex1.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("maria")
public class SampleDAO_Mariadb_Impl implements SampleDAO{

}
