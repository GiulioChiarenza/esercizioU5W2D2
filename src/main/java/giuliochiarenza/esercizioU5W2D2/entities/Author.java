package giuliochiarenza.esercizioU5W2D2.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int birth;
    private String avatar;



}
