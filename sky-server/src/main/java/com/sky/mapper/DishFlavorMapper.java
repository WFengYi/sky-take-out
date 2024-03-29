package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.anno.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {
    void insertBatch(List<DishFlavor> flavor);

    @Delete("delete from sky_take_out.dish_flavor where dish_id = #{id}")
    void deleteFlavorById(Long id);
}
