package com.multicampus.springex1.mapper;

import com.multicampus.springex1.domain.TodoVO;
import com.multicampus.springex1.dto.PageRequestDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTests {
    @Autowired(required = false)
    private TodoMapper todoMapper;


    @Test
    public void testGetTime(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert(){
        TodoVO todoVO = TodoVO.builder()
                .title("스프링 TodoTest")
                .dueDate(LocalDate.of(2023,8,12))
                .writer("user1")
        .build();
            todoMapper.insert(todoVO);
    }

    //글목록
    @Test
    public void testSelectAll(){
      //  List<TodoVO> voList = todoMapper.selectAll();
       // voList.forEach(vo -> log.info(vo));
        /* for(TodoVO vo : voList ) {
            log.info(vo);
        }*/
    }

    //상세보기
    @Test
    public void testSelectOne(){
        TodoVO todoVO = todoMapper.selectOne(3L);   //tno가 Long값이어서 L붙여줌
        log.info(todoVO);

    }

    @Test
    public void testSelectList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(2).size(10).build();
        List<TodoVO> voList = todoMapper.selectList(pageRequestDTO);
        voList.forEach(vo ->log.info(vo));

    }
}
