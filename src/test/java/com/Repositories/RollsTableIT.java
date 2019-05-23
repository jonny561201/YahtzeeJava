package com.Repositories;

import com.Application;
import com.models.Die;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RollsTableIT {

    @Autowired
    private RollsTable table;

    @Test
    public void selectRollByRollId_ShouldReturnListOfDice() {
        UUID expectedId = UUID.fromString("d4c70d9a-7ce5-11e9-8676-53037a9d44dd");
        List<Die> dice = table.selectRollByRollId(expectedId);

        long threesCount = 4;
        long count = dice.stream().filter(x -> x.getPips() == 3).count();
        assertEquals(threesCount, count);
    }

    @Test
    public void selectRollByRollId_ShouldReturnEmptyListWhenRollNotFound() {
        UUID expectedID = UUID.randomUUID();
        List<Die> dice = table.selectRollByRollId(expectedID);

        assertEquals(Collections.EMPTY_LIST, dice);
    }

}