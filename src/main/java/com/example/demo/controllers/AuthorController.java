package com.example.demo.controllers;

import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.service.AuthorServiceModel;
import com.example.demo.repositories.MyAuthorRepository;
import com.example.demo.service.impl.AuthorServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AuthorController {
    private final AuthorServiceImpl authorService;
    private final ModelMapper modelMapper;

    public AuthorController(AuthorServiceImpl authorService, ModelMapper modelMapper){
        this.authorService = authorService;
        this.modelMapper = modelMapper;
    }

    @GetMapping(value = "/authors")
    public List<AuthorServiceModel> getAllAuthors() {
        return this.authorService.getAuthors();
    }

    @PostMapping(value = "/authors")
    public AuthorServiceModel postAuthor(@RequestBody AuthorDTO authorDTO){
        return this.authorService.addAuthor(this.modelMapper.map(authorDTO, AuthorServiceModel.class));
    }

    @GetMapping(value = "/authors/{id}")
    public AuthorServiceModel getAuthor(@PathVariable Long id){
        System.out.println(id);
        return this.authorService.getAuthorById(id);
    }
}
