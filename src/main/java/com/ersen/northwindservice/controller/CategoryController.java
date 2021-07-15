package com.ersen.northwindservice.controller;

import com.ersen.northwindservice.dto.ActionResult;
import com.ersen.northwindservice.dto.CategoryDto;
import com.ersen.northwindservice.dto.ResponseDto;
import com.ersen.northwindservice.service.CategoryService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/{categoryId}")
    public ResponseEntity<CategoryDto> category(@PathVariable("categoryId") Integer categoryId) {
        CategoryDto category = categoryService.getCategoryById(categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<ResponseDto> categories(@PageableDefault(size = 20) Pageable pageable) {
        ResponseDto categories = categoryService.getCategories(pageable);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<ActionResult> createCategory(@RequestBody CategoryDto request) {
        return new ResponseEntity<>(categoryService.save(request), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<ActionResult> updateCategory(@RequestBody CategoryDto request,
                                                       @RequestParam("categoryId") Integer categoryId) {
        request.setCategoryId(categoryId);
        return new ResponseEntity<>(categoryService.update(request), HttpStatus.OK);
    }
}
