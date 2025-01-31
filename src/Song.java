public class Song implements Comparable<Song>
{
    //1) Instance Variables
    private String title;
    private String artist; //can be composer
    private boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megaBytes
    private static int count = 0; //number of songs in my playlist

    //2) Constructors
    //Overloaded constructors (methods) have early binding
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end zero-arg or default constructor

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
        count ++;
    }

    public Song(String title, String artist, boolean hasLyrics, int length, double fileSize)
    {
        this.title = title;
        this.artist = artist;
        this.hasLyrics = hasLyrics;
        this.length = checkLength(length);
        this.fileSize = fileSize;
        count++;
    }//end multi-arg constructor


    //4) Getters
    public static int getCount()
    {
        return count;
    }//end method getCount
    public String getTitle()
    {
        return title;
    }//title getter

    public String getArtist()
    {
        return artist;
    }//artist getter

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//hasLyrics getter

    public int getLength()
    {
        return length;
    }//length getter

    public double getFileSize()
    {
        return fileSize;
    }//fileSize getter


    //6) Brain Methods
    
    public int compareTo(Song someSong)
    {
        if (this.length < someSong.length)
        {
            return -1;
        }
        else if (this.length == someSong.length)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }//end compareTo implemented from interface Comparable

    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
        return minutes + " min " + seconds + " sec";
    }//end brain method to convert length

    /*
    CheckLength is a helper method. It is private because
    it "helps" the other public methods by validating entry
    This is an example of method decomposition - each method does
    just one thing.
    */
    private int  checkLength(int newLength)
    {
        int tempLength = newLength;
        if (tempLength < 0)
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end else if
        return tempLength;
    }//end length validation method checkLength

    //5) Setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end Title setter

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }//end Artist setter

    public void setHasLyrics(boolean newhasLyrics)
    {
        hasLyrics = newhasLyrics;
    }//end hasLyrics setter

    public void setFileSize(double newfileSize)
    {
        fileSize = newfileSize;
    }//end fileSize setter

    //Pre-Condition: the object exists
    //Post-Condition: length == newLength validated to (0,20)
    public void setLength(int newLength)
    {
        length = checkLength(newLength);
    }

    //3) toString a must have for every great object class
    public String toString()
    {
        String output = "";
        output += "Title: " + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics?: " + hasLyrics;
        output += "\nLength (in seconds): " + length;
        output += "\nFile Size (in mB): " + fileSize;

        return output;
    }//end toString
} //end class Song
