

public class BUS implements Transportable{
        private String boardNumber;
        private int numberOfSeats;
    
        public BUS(String boardNumber) {
            this.boardNumber = boardNumber;
            numberOfSeats = 400;
            System.out.println("Создан " + toString());
        }
    
        @Override
        public String toString() {
            return "автобус с госудаственным номером " + boardNumber;
        }
    
        @Override
        public void getInfo() {
            System.out.println(toString() + " , пассажирских мест: " + numberOfSeats);
        }
    
    }

