

public class car3 implements Transportable  {
     
        private String number;
            public car3(String number) {
            this.number = number;
            System.out.println("Создан " + toString());
        }
    
        @Override
        public String toString() {
            return "Автомобиль гос.номером " + number;
        }
    
        @Override
        public void getInfo() {
            System.out.println(toString() + " не имеет данных о вместимости");
    
        }
    
    }

