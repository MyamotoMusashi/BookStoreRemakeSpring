package com.example.demo.service.impl;

import com.example.demo.model.entity.Author;
import com.example.demo.model.service.AuthorServiceModel;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.service.AuthorService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository, ModelMapper modelMapper) {
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AuthorServiceModel> getAuthors() {
        return this.authorRepository.findAll()
                .stream()
                .map(author -> this.modelMapper.map(author, AuthorServiceModel.class))
                .toList();
    }

    @Override
    public List<Author> getAuthorsByListOfNames(List<String> authors) {
        return this.authorRepository.findByNameIn(authors);
    }

    @Override
    public AuthorServiceModel getAuthorById(Long id) {
        return this.modelMapper.map(this.authorRepository.findById(id),AuthorServiceModel.class);
    }

    @Override
    public AuthorServiceModel addAuthor(AuthorServiceModel author) {
        Author createdAuthor = this.authorRepository.saveAndFlush(this.modelMapper.map(author, Author.class));

        return this.modelMapper.map(createdAuthor, AuthorServiceModel.class);
    }
}
