import java.util.Scanner;

public class MovieDriver1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie movie = new Movie();

        System.out.println("Enter the title of the movie:");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.println("Enter the rating of the movie:");
        String rating = scanner.nextLine();
        movie.setRating(rating);

        System.out.println("Enter the number of tickets sold:");
        int ticketsSold = scanner.nextInt();
        movie.setTicketsSold(ticketsSold);

        System.out.println(movie.toString());

        scanner.close();
    }

    static class Movie {
        private String title;
        private String rating;
        private int ticketsSold;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public void setTicketsSold(int ticketsSold) {
            this.ticketsSold = ticketsSold;
        }

        @Override
        public String toString() {
            return "Movie [title=" + title + ", rating=" + rating + ", ticketsSold=" + ticketsSold + "]";
        }
    }
}
