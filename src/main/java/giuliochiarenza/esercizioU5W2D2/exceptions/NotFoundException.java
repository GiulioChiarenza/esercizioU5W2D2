package giuliochiarenza.esercizioU5W2D2.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(int id){
        super("Elemento con id " + id + " non trovato!");
    }
}

