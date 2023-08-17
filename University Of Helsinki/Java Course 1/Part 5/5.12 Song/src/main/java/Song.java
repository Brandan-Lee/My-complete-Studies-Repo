
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }//end song

    public boolean equals(Object compared){
        
        if (this == compared){
            return true;
        }//end if
        
        if (!(compared instanceof Song)){
            return false;
        }//end if
        
        Song comparedSong = (Song) compared;
        
        if (this.artist == comparedSong.artist &&
                this.name == comparedSong.name &&
                this.durationInSeconds == comparedSong.durationInSeconds){
            return true;
        }//end if
        
        return false;
    }//end equals
       
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }//end toString


}//end class
