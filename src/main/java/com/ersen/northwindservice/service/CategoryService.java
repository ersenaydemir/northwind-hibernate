package com.ersen.northwindservice.service;

import com.ersen.northwindservice.dto.ActionResult;
import com.ersen.northwindservice.dto.CategoryDto;
import com.ersen.northwindservice.dto.ResponseDto;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    CategoryDto getCategoryById(Integer categoryId);

    ResponseDto getCategories(Pageable pageable);

    ActionResult save(CategoryDto categoryDto);

    ActionResult update(CategoryDto categoryDto);
}
