package com.Repositories;

import com.models.Die;
import com.models.Roll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class RollsTable {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_ROLL = "SELECT * FROM rolls WHERE id = CAST(? as uuid)";

    public List<Die> selectRollByRollId(UUID rollId) {
        Roll results = jdbcTemplate.queryForObject(SELECT_ROLL, new Object[]{rollId.toString()}, new BeanPropertyRowMapper<>(Roll.class));
        return convertRollToDice(results);
    }

    private List<Die> convertRollToDice(Roll roll) {
        return Arrays.asList(
                new Die(roll.getDie1()),
                new Die(roll.getDie2()),
                new Die(roll.getDie3()),
                new Die(roll.getDie4()),
                new Die(roll.getDie5())
        );
    }
}
