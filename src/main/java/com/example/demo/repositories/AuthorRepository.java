package com.example.demo.repositories;

import com.example.demo.entities.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    private ArrayList<Author> authorsList = new ArrayList<Author>();

    private Author author1 = new Author(this.authorsList.size() + 1, "George R.R Martin", "George Raymond Richard Martin[1] (born George Raymond Martin; September 20, 1948),[2] also known as GRRM,[3] is an American novelist, screenwriter, television producer and short story writer. He is the author of the series of epic fantasy novels A Song of Ice and Fire, which were adapted into the Emmy Award-winning HBO series Game of Thrones (2011–2019) and its prequel series House of the Dragon (2022–present). He also helped create the Wild Cards anthology series, and contributed worldbuilding for the 2022 video game Elden Ring.\n" +
            "\n" +
            "In 2005, Lev Grossman of Time called Martin \"the American Tolkien\",[4][5][6] and in 2011, he was included on the annual Time 100 list of the most influential people in the world.[7][8] He is a longtime citizen of Santa Fe, New Mexico, where he helped fund Meow Wolf and owns the Jean Cocteau Cinema.[9][10][11][12] The city commemorates March 29 as George R. R. Martin Day.[13][14]", "https://en.wikipedia.org/wiki/File:Portrait_photoshoot_at_Worldcon_75,_Helsinki,_before_the_Hugo_Awards_%E2%80%93_George_R._R._Martin.jpg");

    public List<Author> getAuthors(){
        return this.authorsList;
    }
}
