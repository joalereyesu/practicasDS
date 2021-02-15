public class Letra {
    char l;
    int counter;

    public Letra (char l, int c)
    {
        this.l = l;
        this.counter = c;
    }

    public int getCounter ()
    {
        return this.counter;
    }
    public char getLetter()
    {
        return this.l;
    }

    public String toString()
    {
        return l + "  " + counter;
    }


}
