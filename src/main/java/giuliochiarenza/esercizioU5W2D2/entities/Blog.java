package giuliochiarenza.esercizioU5W2D2.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Blog {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
}
