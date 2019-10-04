public class SongDriver
{
    public static void main (String args[])
    {
        //1. Create a Song, or more
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("Deadlochs", "Blue Face", true, 150, 3.57);
        Song overture = new Song("1812 Overture", "Petyr Ilych Ichaicovsky", false, 1093, 11.11);
        Song happySong = new Song("Moi", "The Happy Song", true);

        //4 Checking other methods and properties
        deadLochs.setLength(-5);
        System.out.println(deadLochs);

        //fireworks.title = "Happy Song";
        //System.out.println(fireworks);
/*
        //3. Testing getters
        System.out.println(fireworks.getTitle());
        System.out.println(deadLochs.getArtist());
        System.out.println(overture.getHasLyrics());

        System.out.println("In minutes: " + overture.toMinSec());

        //Testing Setters
        System.out.println("\n" +someSong);
        someSong.setTitle("Lalalalala");
        someSong.setArtist("Cactus");
        someSong.setHasLyrics(true);
        someSong.setLength(200);
        someSong.setFileSize(2.5);
        System.out.println("\n" + someSong);

        //2. Print it out
        System.out.println(happySong);
        System.out.println(fireworks);
        System.out.println();
        System.out.println(deadLochs);
        System.out.println();
        System.out.println(overture);
 */
    }//end main method

}//end class SongDriver. This is where all the stuff happens.
