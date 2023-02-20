public class passenger car  extends car3  {
  
        private int numberOfSeats;
    
        public passenger Car(String number) {
            super(number);
            numberOfSeats = 4;
        }
    
        @Override
        public void getInfo() {
            System.out.println(toString() + ", пассажирских мест: " + numberOfSeats);
        }
    
    }
    