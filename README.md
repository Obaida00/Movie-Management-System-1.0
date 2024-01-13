# Movie-Management-System-1.0
this is my version of the movie management system project 2nd year, 1st semester, programming 3

# Design System
for practice am going to use design systems and in particular mcv design system (model-view-controller)

# Main Classes
## > Models
###    1. Movie
represents a single movie object <br>
totalMovies<ArrayList<Movie>>//HashMap<String,Movie> 
<br> title(String) 
<br> description(String>)
<br> genre(Genre)
<br> thumbnail(Image)
<br> rating(float)

###    2. Ticketing
represents a ticketing platform for a single movie <br>
movie(Movie)
<br> showdate(Date) 
<br> hall(Hall)
<br> seats(ArrayList<Boolean>)

###    3. Booking
represents a booking platform for a specific user so no direct control on user class <br>
bookedTickets(ArrayList(Tickets))

###    4. User
represents a user in the system <br>
totalUsers(ArrayList(User))//HashMap(String,User) 
<br> username(String) 
<br> password(String) 
<br> booking(Booking)

***

## > Views
###    1. LoadingScreen
###    2. LoginScreen
###    3. SignupScreen
###    4. HomeScreen
###    5. BookingScreen
###    6. SeatSelectingScreen
###    7. PaymentScreen

***

## > Controllers
### 1. MovieController
Movie controlling functions
searchMovie() 
<br> filter() 
<br> addMovie()

### 2. TicketingController
Ticketing platform controlling functions <br>
searchSeat() 
<br> getAvailableSeats() 
<br> getAvailableTickets() 
<br> bookSeat() 
<br> bookTicket() 
<br> generateTicket()

### 3. BookingController
Booking platform controlling functions <br>
bookTicket() 
<br> getCurrentUserBookings()

### 4. UserController
User regestration & Login & account display controlling functions <br>
getCurrentUser() 
<br> validateLogin() 
<br> signup() 
<br> searchUser()
