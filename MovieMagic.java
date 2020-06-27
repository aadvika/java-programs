/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/

/**
 * Define a class named MovieMagic with the following description:
 *
 * Instance variables/data members:
 * int year            –           to store the year of release of a movie
 * String title       –           to store the title of the movie.
 * float rating      –           to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0)
 *
 * Member Methods:
 *
 * (i)         movieMagic()              Default constructor to initialize numeric data members to 0 and String data member to “”.
 * (ii)        void accept()               To input and store year, title and rating.
 * (iii)       void display()              To display the title of a movie and a message based on the rating as per the table below.
 *
 * Rating	Message to be displayed
 * 0.0 to 2.0	Flop
 * 2.1 to 3.4	Semi-hit
 * 3.5 to 4.5	Hit
 * 4.6 to 5.0	Super Hit
 * Write a main method to create an object of the class and call the above member methods.
 */
import java.util.Scanner;

public class MovieMagic {
    int year;
    String title;
    float rating;

    MovieMagic() // default constructor
    {
        year = 0;
        rating = 0.0;
        title = "";
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie title : ");
        title = sc.nextLine();
        System.out.print("Enter the year of its release : ");
        year = sc.nextInt();
        System.out.print("Enter the movie rating : ");
        rating = sc.nextFloat();
    }

    void display()
    {
        System.out.println("The title of the movie is : "+title);
        if( rating >= 0.0 && rating <= 2.0 )
        {
            System.out.println("The movie was a Flop");
        }
        else if( rating >= 2.1 && rating <= 3.4 )
        {
            System.out.println("The movie was a Semi-hit");
        }
        else if( rating >= 3.5 && rating <= 4.5 )
        {
            System.out.println("The movie was a Hit");
        }
        else if (  rating >= 4.6 && rating <= 5.0 )
        {
            System.out.println("The movie was a Super Hit");
        }
        else
        {
            System.out.println("Rating should be between 0.0 and 5.0");
        }
    }

    public static void main(String args[])
    {
        MovieMagic obj = new MovieMagic(); // creating object of the class movieMagic
        obj.accept();
        obj.display();
    }
}

