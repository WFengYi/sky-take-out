package com.sky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sky.anno.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService extends IService<Dish> {

    void save(Dish dish,DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO queryDTO);

    void removeByCndition(List<Long> ids);

    DishVO getByIdWithFlavor(Long id);

    void updateWithFlavor(Dish dish,DishDTO dishDTO);

    void updateStatus(Integer status, Long id);

    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);
}
