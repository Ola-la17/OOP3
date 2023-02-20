

public class program3 {
        public static void main(String[] args) {
            List<Transportable> listTransport = new ArrayList<>();
            Transportable automobile = new Automobile("O009RT");
            Transportable car = new Car("Y325WA");
            Transportable jet = new Jet("FR12584");
    
            listTransport.add(automobile);
            listTransport.add(car);
            listTransport.add(jet);
    
            for (Transportable transportable : listTransport) {
                transportable.getInfo();
            }
        }
    }
}
}
