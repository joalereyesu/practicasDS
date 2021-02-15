import java.util.Arrays;

public class LoremIpsum {

    public static String printAll (int any)
    {
        String f = "*";
        for (int i = 0; i <= any; i++)
        {
            f = f + '*';
        }
        return f;
    }

    public static void reverse(int[] array) 
    {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }
    public static void main (String[] args)
    {
        String lorem = 
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Et tortor at risus viverra adipiscing at in tellus integer. Quis enim lobortis scelerisque fermentum dui. Massa tincidunt nunc pulvinar sapien et. Turpis massa tincidunt dui ut. Porta non pulvinar neque laoreet suspendisse interdum consectetur. Urna et pharetra pharetra massa massa. Dignissim enim sit amet venenatis urna cursus eget nunc scelerisque. Ultricies lacus sed turpis tincidunt id. Tempor orci eu lobortis elementum nibh. Non blandit massa enim nec dui nunc. Sapien faucibus et molestie ac feugiat. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Tristique sollicitudin nibh sit amet commodo nulla. Maecenas volutpat blandit aliquam etiam. Rutrum tellus pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Suspendisse ultrices gravida dictum fusce ut placerat. Augue mauris augue neque gravida in fermentum.";

        Letra[] arrLetters = new Letra[30];
        char letter;
        int n = 0;

        for (letter = 'A'; letter <= 'Z'; letter++)
        {
            int counter = 0;
            for (int i = 0; i < lorem.length(); i++)
            {
                if (Character.toUpperCase(lorem.charAt(i)) == letter)
                {
                    counter++;
                }
            }
            arrLetters[n] = new Letra(letter, counter);
            n++;
        }
        int[] arr = new int[arrLetters.length];
        for (int k = 0; k < arrLetters.length; k++)
        {
            try 
            { 
                arr[k] = arrLetters[k].counter;
            }
            catch(NullPointerException e)
            {
                continue;
            }
        }
        Arrays.sort(arr);
        reverse(arr);
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < arrLetters.length; j++)
            {   
                try
                {
                    if (arr[i] == arrLetters[j].counter)
                    {
                        System.out.println((i+1) + " " + arrLetters[j].l + " " + arr[i] + " " + printAll(arr[i]));
                    }
                }
                catch (NullPointerException e)
                {
                    continue;
                }
            }
        }
    }
}