public class SalesRepresentative {
    private int nrOfSales;
    private  int valueOfSales;
    public int totalValue;

    public SalesRepresentative(int nrOfSales, int valueOfSales) {
        this.nrOfSales = nrOfSales;
        this.valueOfSales = valueOfSales;
        this.totalValue = nrOfSales * valueOfSales;
    }
    public static void main(String[] args) {
        SalesRepresentative[] SalesRep = new SalesRepresentative[4];

        SalesRep[0] = new SalesRepresentative(10, 500);
        SalesRep[1] = new SalesRepresentative(7, 800);
        SalesRep[2] = new SalesRepresentative(9, 1000);
        SalesRep[3] = new SalesRepresentative(11, 200);

        for (SalesRepresentative salesRepCorect: SalesRep){
            System.out.println(salesRepCorect);
        }
        SalesRep = SalesRep[0].bubbleSort(SalesRep);
        for (SalesRepresentative salesRepresentative: SalesRep){
            System.out.println(salesRepresentative);
        }

    }
    SalesRepresentative[] bubbleSort(SalesRepresentative[] SalesRep) {
        int n = SalesRep.length;
        int flag;
        SalesRepresentative item;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (SalesRep[j].totalValue > SalesRep[j + 1].totalValue) {
                    item = SalesRep[j];
                    SalesRep[j] = SalesRep[j + 1];
                    SalesRep[j + 1] = item;

                }
            }
        }
        return SalesRep;
    }

    @Override
    public String toString() {
        return "" + this.totalValue;
    }
}


