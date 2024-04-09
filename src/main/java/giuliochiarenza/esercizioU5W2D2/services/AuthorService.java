package giuliochiarenza.esercizioU5W2D2.services;

import giuliochiarenza.esercizioU5W2D2.entities.Author;
import giuliochiarenza.esercizioU5W2D2.entities.Blog;
import giuliochiarenza.esercizioU5W2D2.exceptions.NotFoundException;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    private List<Author> authorList = new ArrayList<>();
    public List<Author> getAuthorList(){
        return this.authorList;
    }

    public Author saveAuthor(Author body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(1,10000));
        body.setAvatar("https://ui-avatars.com/api/?name=Mario+Rossi");
        this.authorList.add(body);
        return body;
    }

    public Author findById(int id){
        Author found = null;
        for(Author author: this.authorList){
            if(author.getId() == id) found = author;
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }

    public Author findByIdAndUpdate(int id, Author updatedAuthor){
        Author found = null;
        for(Author author: this.authorList){
            if(author.getId() == id) {
                found = author;
                found.setName(updatedAuthor.getName());
                found.setSurname(updatedAuthor.getSurname());
                found.setEmail(updatedAuthor.getEmail());
                found.setBirth(updatedAuthor.getBirth());
            }
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }

    public void findByIdAndDelete(int id){
        Iterator<Author> iterator = this.authorList.iterator();

        while(iterator.hasNext()){
            Author current = iterator.next();
            if(current.getId() == id){
                iterator.remove();
            }
        }

    }
}
